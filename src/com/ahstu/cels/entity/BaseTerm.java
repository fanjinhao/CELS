/**
 * 
 */
package com.ahstu.cels.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @description ���������
 * @author ������
 * @createDate ����5:29:53
 * @version ver1.0
 * 
 */
public class BaseTerm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5564672604734157579L;
	public BaseTerm(String en, String[] cn) {
		super();
		this.en = en;
		this.cn = cn;
	}
	public BaseTerm() {
		super();
	}
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	public String[] getCn() {
		return cn;
	}
	public void setCn(String[] cn) {
		this.cn = cn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((en == null) ? 0 : en.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseTerm other = (BaseTerm) obj;
		if (en == null) {
			if (other.en != null)
				return false;
		} else if (!en.equals(other.en))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseTerm [en=").append(en).append(", cn=").append(Arrays.toString(cn)).append(", id=")
				.append(id).append("]");
		return builder.toString();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	//��д��������
	//1. Ӣ��
	private String en;
	//2.���Ľ���
	private String[] cn;
	//����ID
	private Long id;
}