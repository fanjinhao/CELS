/**
 * 
 */
package com.ahstu.cels.view.impl;

import com.ahstu.cels.view.IView;

/**
 * @description 基于命令行的视图呈现
 * @author 范晋豪
 * @createDate 上午10:19:50
 * @version ver1.0
 * 
 */
public class CommandView implements IView {

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#description()
	 */
	@Override
	public void description() {
		System.out.println("###############################################");
		System.out.println("# 本项目是计算机英语学习的一款小软件，它采用Java语句，利用IO流，接口，循环+分支结构来完成");
		System.out.println("# 如在使用过程中，有任何疑问或建议，请联系fjinhao@qq.com");
		System.out.println("###############################################");
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#showMianMenu()
	 */
	@Override
	public void showMianMenu() {
		System.out.println(); //换行
		System.out.println("# 1. 按字母顺序浏览基库");
		System.out.println("# 2. 做游戏学习单词");
		System.out.println("# 3. 测试自己的水平【随机出题】");
		System.out.println("# 0. 退出！");
		System.out.println();
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#showBaseMenu()
	 */

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subGameMenu()
	 */
	@Override
	public void subGameMenu() {
		System.out.println("-----------------------------------------------");
		System.out.println(" -> 1. 提示英文，回答中文【只要答对一个就算对】");
		System.out.println(" -> 2. 提示中文，回答英文【大小写不敏感】");
		System.out.println(" -> 0. 返回上一级");
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subTestingMenu()
	 */
	@Override
	public void subTestingMenu() {
		System.out.println("-----------------------------------------------");
		System.out.println(" -> 1. 开始测试");
		System.out.println(" -> 2. 我的测试记录【只显示最近的10次】");
		System.out.println(" -> 0. 返回上一级");
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subShowBaseMenu()
	 */
	@Override
	public void subShowBaseMenu() {
		System.out.println("------------");
		System.out.println("-> 1. 浏览单词");
		System.out.println("-> 2. 浏览词汇");
		System.out.println("-> 0. 返回上一级");
		System.out.println("------------");
	}

}
