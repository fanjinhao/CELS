/**
 * 
 */
package com.ahstu.cels.controller.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ahstu.cels.controller.IController;
import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;
import com.ahstu.cels.service.IBaseTermService;
import com.ahstu.cels.service.impl.BaseTermServiceImpl;
import com.ahstu.cels.util.InputUtil;
import com.ahstu.cels.view.IView;
import com.ahstu.cels.view.impl.CommandView;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 上午11:10:05
 * @version ver1.0
 * 
 */
public class SimpleController implements IController {

	private IView view; // 使用视图
	private IBaseTermService baseTermService; // 使用业务层
	
	/**
	 * 默认构造器，初始化 视图实例
	 */
	public SimpleController() {
		this.view = new CommandView();
		this.baseTermService = new BaseTermServiceImpl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.controller.IController#start()
	 */
	@Override
	public void start() {
		int choice = -1; // 定义用户的选择
		boolean rtnTop = false; // 用来保存是否返回上一级
		boolean exist = false; // 用来保存是否退出的变量
		// 首先显示欢迎界面
		view.description();
		// 利用do while 循环来展现菜单
		do {
			// 1. 显示主菜单
			view.showMianMenu();
			choice = InputUtil.getInt("请选择>");
			// 重置rntTop的变量值为false
			rtnTop = false;
			// 2. 根据用户的选择进行分支判断
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1. 进入第一个子菜单【浏览器库】
					view.subShowBaseMenu();
					// 进一步让用户选择
					choice = InputUtil.getInt("请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 浏览单词
						//1. 调用业务方法获取Map集合
						Map<Character, List<Word>> results = baseTermService.getAllWords();
						//2. 迭代这个Map，并接一定的格式显示出来即可
						Set<Character> keys = results.keySet();
						// 迭代key
						for (Character key : keys) {
							// 通过key来获取values
							List<Word> values = results.get(key);
							System.out.printf("%s[%d]    ", key, values.size());
							// 遇到G, N, T, Z换行
							if (key == 'G' || key == 'N' || key == 'T' || key == 'Z') {
								System.out.println(); // 换行
							}
						}
						// 让用户选择
						char input = InputUtil.getChar("请选择你要查看的字母>");
						// 根据用户输入的字母作为Key，来获取value的集合
						List<Word> showList = results.get(Character.toUpperCase(input));
						// 显示这个集合急即可
						int count = 0;
						while (count < showList.size()) {
							Word temp = showList.get(count);
							//
							System.out.printf("-> %d. %s 的解释是：%s\n", 
									count + 1, temp.getEn(), Arrays.toString(temp.getCn()));
							//计数一次
							count++;
							if (count % 15 == 0) { // 达到15的整数倍，要暂停
								// 提示用户是否继续
								input = InputUtil.getChar(" -> 是否查看下一页？ n 或 N 代表中断，其他字符继续  >");
								// 如果用户输入n, 则退出循环
								if (input == 'n' || input == 'N') {
									//
									break;
								}
							}
							// 如果没有退出，而显示到了最后一个单词，则提示下一个
							if (count == showList.size()) {
								System.out.println("\n已经翻到了最后 ... ... ... ...");
							}
						}
						//结束
						System.out.println("\n... ... ... ... ... ... ... ... ...");
						break; // end of case 1
					case 2:
						// 浏览词汇
						// 1. 调用业务方法，获取分页数据
						PageBean<Vocabular> pb = baseTermService.getAllVocabulary();
						while (true) {
							// 2. 显示分页的样式
							System.out.println(pb.getStyle());
							System.out.println("______________________________________");
							// 3. 让用户选择想要查看的页码
							int page = InputUtil.getInt("请选择你要查看的页码>");
							// 4. 根据页码来打印数据
							List<Vocabular> data = pb.getDataByPage(page);
							//
							count = 0;
							
							for (Vocabular v: data) {
								count++;
								System.out.printf("-> %d. %s 的解释是：%s\n",
										count, v.getEn(), Arrays.toString(v.getCn()));
							}
							// 判断是否要结束
							input = InputUtil.getChar(" -> 是否查看下一页？ n 或 N 代表中断，其他字符继续  >");
							// 如果用户输入n, 则退出循环
							if (input == 'n' || input == 'N') {
								//
								break;
							}
						}
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				}
				break;
			case 2:
				while (!rtnTop) {
					// 1. 进入第二个子菜单【做游戏学习】
					view.subShowBaseMenu();
					// 进一步让用户选择
					choice = InputUtil.getInt("   请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 提示中文回答英文
						System.out.println("\n *** 敬请期待，此功能开发中【中文到英文】.....******");
						// TODO 待开发列表3 -- 浏览单词列表 -- 英文到中文的游戏
						break;
					case 2:
						// 提示英文，回答中文
						System.out.println("\n *** 敬请期待，此功能开发中【英文到中文】.....******");
						// TODO 待开发列表4 -- 英文到中文的游戏
						break;
					case 0:
						// 返回上一级
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}	
				}
				break;
			case 3:
				while (!rtnTop) {
					// 1. 进入第一个子菜单【浏览器库】
					view.subTestingMenu();
					// 进一步让用户选择
					choice = InputUtil.getInt("   请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 开始测试
						System.out.println("\n *** 敬请期待，此功能开发中【单词】.....******");
						// TODO 待开发列表5 -- 开始测试
						break;
					case 2:
						// 查看测试的历史记录
						System.out.println("\n *** 敬请期待，此功能开发中【词汇】.....******");
						// TODO 待开发列表6 -- 查看测试的历史记录
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				}
				break;
			case 0:
				// 代表用户退出程序
				exist = true; //即可退出外部循环
				break;
			default:
				System.out.println("输入有误");
				break;
			}

		} while (!exist);
		//
		System.out.println("\n 程序结束 ... ");
	} //end of method start

} //end of class
