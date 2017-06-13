/**
 * 
 */
package com.ahstu.cels.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 上午8:36:32
 * @ version v1.0
 */
public class TestRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7173632654817823661L;
	// 属性
	// 1.测试时间
	private Date test_date;
	// 2.测试时长,以秒为单位
	private long sec;
	// 3.测试总题数
	private int count;
	// 4.完成题数
	private int finish;
	// 5.正确数
	private int correct;
	// 6.错误数
	private int error;
	// 7.测试数据[就是BaseTerm的集合]
	private List<BaseTerm> datas;
	// 8.标识
	private long id;
	public TestRecord() {
		super();
	}
	public Date getTest_date() {
		return test_date;
	}
	public void setTest_date(Date test_date) {
		this.test_date = test_date;
	}
	public long getSec() {
		return sec;
	}
	public void setSec(long sec) {
		this.sec = sec;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct = correct;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public List<BaseTerm> getDatas() {
		return datas;
	}
	public void setDatas(List<BaseTerm> datas) {
		this.datas = datas;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestRecord [test_date=").append(test_date).append(", sec=").append(sec).append(", count=")
				.append(count).append(", finish=").append(finish).append(", correct=").append(correct)
				.append(", error=").append(error).append(", id=").append(id).append("]");
		return builder.toString();
	}
}
