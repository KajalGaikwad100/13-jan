package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String currentworkingdirectory=System.getProperty("user.dir");
String filepath=currentworkingdirectory+"\\TestData\\Data1.properties";

FileInputStream fis=new FileInputStream(".\\TestData\\Data1.properties");
Properties prop=new Properties();
prop.load(fis);

System.out.println(prop.getProperty("url"));
System.out.println(prop.getProperty("username"));
System.out.println(prop.getProperty("password"));


}

}
