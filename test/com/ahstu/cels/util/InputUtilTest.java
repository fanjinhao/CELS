/**
 * 
 */
package com.ahstu.cels.util;

import org.junit.Test;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 下午4:01:29
 * @version ver1.0
 * 
 */
public class InputUtilTest {
	@Test
	public void testGetInt() {
		int i = InputUtil.getInt("请输入整数 > ");
		System.out.println(i);
	}
}
