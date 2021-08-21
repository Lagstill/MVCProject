/**********************************************************
 * 				PSG COLLEGE OF TECHNOLOGY
 * 						AMCS
 * 				JAVA PACKAGE SUBMISSION
 * 				  CLOUD KITCHEN MENU		
 * 					   19PD05
 *                     19PD019
 ************************************************************/

package com.alex.foodcart;

public class Food {
	
	private String name;
	private String avail;
	private int sweet;
	private int price;
	public Food(String name, String avail, int sweet, int price) {
		super();
		this.name = name;
		this.avail = avail;
		this.sweet = sweet;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvail() {
		return avail;
	}
	public void setAvail(String avail) {
		this.avail = avail;
	}
	public int getSweet() {
		return sweet;
	}
	public void setSweet(int sweet) {
		this.sweet = sweet;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
