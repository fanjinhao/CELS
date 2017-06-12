/**
 * 
 */
package com.ahstu.cels.view;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 上午10:04:54
 * @version ver1.0
 * 
 */
public interface IView {
	/*
	 * 此类的描述信息
	 */
	void description();
	/*
	 * 显示主菜单
	 */
	void showMianMenu();
	/*
	 * 显示浏览基库子菜单
	 */
	void subShowBaseMenu();
	/*
	 * 做游戏中英文互答子菜单
	 */
	void subGameMenu();
	/*
	 * 显示测试子菜单
	 */
	void subTestingMenu();
}

