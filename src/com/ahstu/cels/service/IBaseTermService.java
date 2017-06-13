/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description 浏览单词词汇的接口
 * @author 范晋豪
 * @createDate 上午11:17:57
 * @ version ver1.0
 */
public interface IBaseTermService {
	Map<Character, List<Word>> getAllWords();
	//获取所有的词汇，以分页显示
	PageBean<Vocabular> getAllVocabulary();
}
