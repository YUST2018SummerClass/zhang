package edu.yust.ceceom;

import java.io.BufferedReader;
import java.io.FileReader;

public class java0712 {
	
	public static void main(String[] args)throws Exception {
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
