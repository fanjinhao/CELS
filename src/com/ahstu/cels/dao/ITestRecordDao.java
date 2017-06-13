/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;

import com.ahstu.cels.entity.TestRecord;


/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 下午4:51:37
 * @ version ver1.0
 */
public interface ITestRecordDao {
	// 1. 保存测试记录
	/*******************
	 * 以集合的方式储存所有的测试记录，每次保存的流程是：
	 * 1. 先把原来的数据读取出来，是一个集合
	 * 2. 加入新的测试数据到集合中
	 * 3. 重新把新的集合写回到文件中
	 * @param records
	 */
	void save(List<TestRecord> records);
	// 2. 查询所有的测试记录
	List<TestRecord> query();
	
}
