/**
 * 
 */
package com.ahstu.cels;

import com.ahstu.cels.controller.IController;
import com.ahstu.cels.controller.SimpleContrller;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 下午3:07:31
 * @version ver1.0
 * 
 */
public class MainCels {
	//程序入口
	public static void main(String[] args) {
		IController c = new SimpleContrller();
		c.start();
	}
}
