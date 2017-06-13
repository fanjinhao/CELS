/**
 * 
 */
package com.ahstu.cels.entity;

import java.util.List;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 上午9:43:29
 * @ version ver1.0
 */
public class PageBean<T> {
	//属性
	//1.  总记录数【来自于DAO】
	private int count;
	//2 . 每页多少行【事先配置好的】
	private int rows;
	//3. 要分页的数据
	private List<T> data;
	//4. 总页数
	private int pages;
	
	//5. 第一页
	private int first = 1;
	//6. 最后一页
	private int last;
	//7. 前一页
	private int previous;
	//8. 后一页
	private int next;
	//9. 当前页
	private int current = 1;
	//10. 分页样式
	private String style = "| 1 | 2 | 3 | ... |";
	/**
	 * @param count
	 * @param rows
	 */
	public PageBean(int count, int rows) {
		super();
		this.count = count;
		this.rows = rows;
		//1.计算总行数
		this.pages = this.count % this.rows == 0 ?
				this.count / this.rows : this.count / this.rows + 1;
		//调用setCurrent方法，默认是第一页
		setCurrent(1);
	}
	public void setCurrent(int current) {
		//给current 赋值
		
		//修改其它的属性值
		if (current < 0)
			this.current = 1;
		else if (current > this.pages) {
			this.current = this.pages;
		}
		else {
			this.current = current;
		}
		this.last = this.pages;
		//
		this.next = this.current  == this.last ? this.current : this.current + 1;
		//
		this.previous = this.current  == this.first ? this.first : this.current - 1;
		//计算style
		this.style = this.current >= this.pages - 3 ?
				"| 1 | 2 | 3 | . . . | " + this.pages + " |" :
				"| " + this.current + " | " + (this.current + 1) + " | " + (this.current + 2)
				+" | . . . | " + this.pages + " |";
				
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}
	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}
	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}
	/**
	 * @return the first
	 */
	public int getFirst() {
		return first;
	}
	/**
	 * @return the last
	 */
	public int getLast() {
		return last;
	}
	/**
	 * @return the previous
	 */
	public int getPrevious() {
		return previous;
	}
	/**
	 * @return the next
	 */
	public int getNext() {
		return next;
	}
	/**
	 * @return the current
	 */
	public int getCurrent() {
		return current;
	}
	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}
}
