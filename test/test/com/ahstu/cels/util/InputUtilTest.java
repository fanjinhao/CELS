/**
 * 
 */
package test.com.ahstu.cels.util;

import org.junit.Test;

import com.ahstu.cels.util.InputUtil;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 2017年6月12日 下午4:02:27
 * @version ver1.0
 * 
 */
public class InputUtilTest {
   @Test
   public void testGetInt() {
	   int i=InputUtil.getInt("请输入整数>");
	   System.out.println(i);
   }
}
