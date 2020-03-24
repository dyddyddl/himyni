package use;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException { //IOException은 입력이 끝나야 발생하기 때문에 throws해도 상관없다
		// .properties
		Properties prop = new Properties();
		Properties prop2 = new Properties();
		
		InputStream inStream = PropertiesTest.class.getResourceAsStream("/setup.properties"); // 두개 다른 경로 
		FileInputStream fStream  = new FileInputStream("C:\\Users\\bitcamp\\Documents\\workspace"
				+ "-sts-3.9.11.RELEASE\\BookSource_java\\src\\setup.properties"); // 정확한 경로
		
		
		//fileinputStream을 사용할 때 주의점 : 절대경로를 써서 가져오는 형식은 배포시 문제가 생김(위치가 바뀜)
		//getResourceAsStream은 현재  위치에서 한단계 위에 있는 것 가져옴
		prop.load(inStream);//읽어들인다
		prop2.load(fStream);

		System.out.println(prop.getProperty("hi"));
		System.out.println(prop2.getProperty("hi"));
		

		prop.setProperty("server", "192.168.1.100");
		prop.setProperty("timeout", "5000");
		System.out.println(prop.getProperty("Server"));
		System.out.println(prop.getProperty("timeout"));

		OutputStream out = new FileOutputStream("C:\\Users\\bitcamp\\Documents\\workspace"
				+ "-sts-3.9.11.RELEASE\\BookSource_java\\src\\setup.properties");
		prop.store(out, "@#@#");
	}

}
