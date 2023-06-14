package org.kosta.semiproject.model;

public class MenuVO {
	private String name;
	private String price;
	private String category;
	public MenuVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuVO(String name, String price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "MenuVO [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
		
}

