/**
 * 
 */
package com.ahstu.cels.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;
import com.ahstu.cels.service.IBaseTermService;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 上午8:52:36
 * @ version ver1.0
 */
public class BaseTermServiceImpl implements IBaseTermService{
	
	//以dao为支撑
	private IBaseTermDao baseTermDao = new BaseTermDaoImpl();
	/* (non-Javadoc)
	 * @see com.ahstu.cels.service.IBaseTermService#getAllWords()
	 */
	@Override
	public Map<Character, List<Word>> getAllWords() {
		//1. 创建一个Map，用来存放最终的结果
		Map<Character, List<Word>> results = new TreeMap<>();
		//2. 遍历由dao获取的Set<Word>集合
		Set<Word> words = baseTermDao.getAllWords();
		// 定义一个List集合来存放所有具有相同首字母的单词
		List<Word> wordList = null; // 暂不初始化
		//3. 依次判断这个Word的首字母是否出现在Map中，如果没有出现在Map中，则创建一个新的List，用来存放这个Word,并把
		//首字母与这个List添加到Map中
		
		for (Word w: words) {
			// 获取这个单词的首字母
			Character letter = w.getCaptical();
			// 判断map 中是否已经有了这个首字母对应的记录
			if (results.containsKey(letter)) {
				// 说明这个Map中已经有了这个首字母的记录了,直接根据key，来取出value
				wordList = results.get(letter);
			}else {
				// 说明，这个map中还没有这个首字母的记录，则创建新的List
				wordList = new ArrayList<>();
				// 并把这个首字母与集合的映射关系添加到map中
				results.put(letter, wordList);
			}
			// 把这个单词添加到List中
			wordList.add(w);
		}
		// 返回result
		return results;
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.service.IBaseTermService#getAllVocabulary()
	 */
	@Override
	public PageBean<Vocabular> getAllVocabulary() {
		//1.获取所有的音词汇
		Set<Vocabular> vSet = baseTermDao.getAllVocabulars();
		//2. 创建PageBean对象
		final int ROWS = 15; // 每页显示15行
		PageBean<Vocabular> pb = new PageBean<>(vSet.size(), ROWS);
		//添加数据到此PageBean中
		List<Vocabular> data = new ArrayList<>();
		//把Set集合中的数据添加到List集合中
		for (Vocabular v : vSet) {
			data.add(v);
		}
		//
		pb.setData(data);
		//3. 返回
		return pb;
	}

}
