package edu.yust.ceceom;

import java.io.BufferedReader;
import java.io.FileReader;

public class Order {
	private int tableNum;
	private String orderedMenu;
	private double price;
	
	
	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	public void getTotalPrice() {
		
	}

	public String getOrderedMenu() {
		return orderedMenu;
	}

	public void setOrderedMenu(String orderedMenu) {
		this.orderedMenu = orderedMenu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order(int tableNum, String orderMenu, double price) {
		super();
		this.tableNum = tableNum;
		this.orderedMenu = orderMenu;
		this.price = price;
	}


	public static void main(String[] args) throws Exception{
		FileReader fr= new FileReader("c:/test/order.txt");
		BufferedReader bReader = new BufferedReader(fr);
		String str = null;
		while ((str=bReader.readLine())!=null) {
			System.out.println(str.split("£¬")[1]);
		}
		bReader.close();
		fr.close();
		
	}

}
