package com.skySpider;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author mike_yi
 *
 */
@Entity
@Table(name="t_url")
public class Url {
	private String id;
	private int kind;
	private String link;
	private int statu;
	private String extra;

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getStatu() {
		return statu;
	}

	public void setStatu(int statu) {
		this.statu = statu;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
