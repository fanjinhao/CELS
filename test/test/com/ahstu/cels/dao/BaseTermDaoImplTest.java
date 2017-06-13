/**
 * 
 */
package test.com.ahstu.cels.dao;

import java.util.List;

import org.junit.Test;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
import com.ahstu.cels.entity.Word;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 2017年6月13日 下午5:40:24
 * @version ver1.0
 * 
 */
public class BaseTermDaoImplTest {
	private IBaseTermDao dao=new BaseTermDaoImpl();
	@Test
	public void testGetAllWords() {
		//
		List<Word> words =dao.getAllWords();
		//
		if(words!=null) {
			for(Word w:words) {
				System.out.println(w);
			}
		}
	}
	
}
