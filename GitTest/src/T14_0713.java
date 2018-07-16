package edu.yust.ceceom;
import java.io.BufferedReader;
import java.io.FileReader;

public class T14_0713 {

	public static void main(String[] args) throws Exception{
		
		FileReader fr= new FileReader("c:/test/order.xlsx");
		BufferedReader bReader = new BufferedReader(fr);
		String str = null;
		while ((str=bReader.readLine())!=null) {
			System.out.println(str);
		}
		bReader.close();
		fr.close();
	

	}

}
