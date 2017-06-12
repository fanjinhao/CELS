/**
 * 
 */
package com.ahstu.cels.entity;

/**
 * @description 此类的描述
 * @author 范晋豪
 * @createDate 下午5:27:01
 * @version ver1.0
 * 
 */
public class Vocabular extends BaseTerm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7709059420195809459L;
	//属性
	//1. 简称
	private String abbr;
	// 如有需要，再添加其他属性

	public Vocabular(String en, String[] cn, String abbr) {
		super(en, cn);
		this.abbr = abbr;
	}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	
}
