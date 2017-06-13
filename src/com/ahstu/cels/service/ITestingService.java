/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;

import com.ahstu.cels.entity.BaseTerm;
import com.ahstu.cels.entity.TestRecord;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 上午11:28:38
 * @ version ver1.0
 */
public interface ITestingService {
	//1. 根据用户输入的测试数据。获取测试数据
	/******
	 * 
	 * @param items 用户输入测试的数量
	 * @return
	 */
	List<BaseTerm> getTestingData(int items);
	//2. 获取所有的测试记录【最近10次】
	/****
	 * 
	 * @return 返回最近10次的测试记录或是所有的
	 */
	List<TestRecord> getALLTestRecord();
	
	//3. 保存测试数据
	/*******
	 * 
	 * @param record 要持久化的测试数据
	 */
	void saveTestRecord(TestRecord record);
}
