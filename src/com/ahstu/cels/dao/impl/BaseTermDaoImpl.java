/**
 * 
 */
package com.ahstu.cels.dao.impl;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 下午4:59:21
 * @ version ver1.0
 */
public class BaseTermDaoImpl implements IBaseTermDao {
	/**
	 * 存放了所有的单词的数据文件
	 */
	private static final String WORD_FILE = "datas/dic/w.dic";
	/**
	 * 存放了所有的词汇的数据文件
	 */
	private static final String VOCABULAR_FILE = "datas/dic/v.dic";
	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllWords()
	 */
	@Override
	public List<Word> getAllWords() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllVocabulars()
	 */
	@Override
	public List<Vocabular> getAllVocabulars() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#persist(java.util.Map, boolean)
	 */
	@Override
	public void persist(Map<String, String> data, boolean en2cn) {
		// TODO Auto-generated method stub

	}

}
