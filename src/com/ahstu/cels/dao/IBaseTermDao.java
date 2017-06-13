/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description 针对word和Vocabulary的数据访问操作
 * @author 范晋豪
 * @createDate 上午11:35:33
 * @ version ver1.0
 */
public interface IBaseTermDao {
	// 1. 查所有的单词
	List<Word> getAllWords();
	
	// 2. 查所有的词汇
	List<Vocabular> getAllVocabulars();
	
	//持久化中英文互答的数据
	
	void persist(Map<String, String> data, boolean en2cn);
}
