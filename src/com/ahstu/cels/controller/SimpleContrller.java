/**
 * 
 */
package com.ahstu.cels.controller;


import java.util.Scanner;

import com.ahstu.cels.controller.IController;
import com.ahstu.cels.view.IView;
import com.ahstu.cels.view.impl.CommandView;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 上午11:10:05
 * @version ver1.0
 * 
 */
public class SimpleContrller implements IController{

	private IView view; // 使用视图
	/**
	 * 默认构造器，初始化 视图实例
	 */
	public SimpleContrller() {
		this.view = new CommandView();
	}
	
	/* (non-Javadoc)
	 * @see com.ahstu.cels.controller.IController#start()
	 */
	@Override
	public void start() {
		int choice = -1; // 定义用户的选择
		boolean rtnTop = false; //用来保存是否返回上一级
		boolean exist = false; //用来保存是否退出的变量
		Scanner sc = new Scanner(System.in);
		//首先显示欢迎界面
		view.description();
		//利用do while 循环来展现菜单
		do {
			//1. 显示主菜单
			view.showMianMenu();
			System.out.print("请选择>");
			choice = sc.nextInt();
			
			//2. 根据用户的选择进行分支判断
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1. 进入第一个子菜单【浏览器库】
					view.subShowBaseMenu();
					//进一步让用户选择
					System.out.println("   请选择");
					choice = sc.nextInt();
					//进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 浏览单词
						System.out.println("\n *** 敬请期待，此功能开发中【单词】.....******");
						//TODO 待开发列表1 -- 浏览单词列表
						break;
					case 2:
						// 浏览词汇
						System.out.println("\n *** 敬请期待，此功能开发中【词汇】.....******");
						//TODO 待开发列表1 -- 浏览词汇列表
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

			default:
				break;
			}
			
		} while (!exist);
	}
	
}
