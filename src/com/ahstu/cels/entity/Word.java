/**
 * 
 */
package com.ahstu.cels.entity;

/**
 * @description 单词类
 * @author 范晋豪
 * @createDate 下午5:24:20
 * @version ver1.0
 * 
 */
public class Word extends BaseTerm{
	/**
	 * 
	 */
	private static final long serialVersionUID = -857523324430612615L;
	public Word(String en, String []cn) {
		super(en, cn);
		this.captical = en.toUpperCase().charAt(0);
	}

	

	//属性
	//1. 首字母【大写】
	private Character captical;
	//如有需要，再添加其它属性



	public Character getCaptical() {
		return captical;
	}
}
