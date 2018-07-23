
import java.util.zip.GZIPInputStream;
import java.util.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;  
import java.net.URLEncoder;


public class Project {  
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(" 判断季节");
    	System.out.println("请输入月份：");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt(); 
		while(month<1||month>12){  
                System.out.println("该月份不存在，请重新输入1-12月：");
		month=sc.nextInt();
		}  
		switch(month){
			case 3:
			case 4:
			case 5:
			System.out.println("该月份为春季");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println("该月份为夏季");
			break;
			case 9:			
			case 10:
			case 11:
			System.out.println("该月份为秋季");
			break;
			case 12:			
			case 1:
			case 2:
			System.out.println("该月份为冬季");
			break;
			default:
			break;
		}
    	
		String link="https://api.shenjian.io/weather/city?appid=2d929b6ee13bacedcfabd91f7a818933&city_name=哈尔滨市";  
       
          
        String area=URLEncoder.encode("哈尔滨","UTF-8");
        String only_now=URLEncoder.encode("\n","UTF-8");
        String appid="2d929b6ee13bacedcfabd91f7a818933";

        String httpUrl = "https://api.shenjian.io/weather/area/";

        String httpArg = "appid="+appid+"&area="+area+"&only_now="+only_now;

        String jsonResult = request(httpUrl, httpArg);

        System.out.println(jsonResult);

	}  

        public static String request(String httpUrl, String httpArg) {

        BufferedReader reader = null;

        String result = null;

        StringBuffer sbf = new StringBuffer();

        httpUrl = httpUrl + "?" + httpArg;

        try {

        URL url = new URL(httpUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        connection.setRequestProperty("charset", "utf-8");

        connection.setRequestProperty("Accept-Encoding", "gzip");

        connection.connect();

        InputStream is = new GZIPInputStream(connection.getInputStream());

        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));

        String strRead = null;

        while ((strRead = reader.readLine()) != null) {

        sbf.append(strRead);

        sbf.append("\r\n");

        }

        reader.close();

        result = sbf.toString();

        } catch (Exception e) {

        e.printStackTrace();

        }
        
        return result;

        }
   }  
 