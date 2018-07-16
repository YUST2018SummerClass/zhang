
import java.io.BufferedReader;
import java.io.FileReader;
class order{
	
	void menu() throws Exception {
		FileReader fr= new FileReader("c:/test/order.txt");
		BufferedReader bReader = new BufferedReader(fr);
		String str = null;
		while ((str=bReader.readLine())!=null) {
			System.out.println(str);
		}
		bReader.close();
		fr.close();
	}
	
}
public class T14_0712 {

	public static void main(String[] args)throws Exception {
		
		order or = new order();
		or.menu();
		
		
	}

}
