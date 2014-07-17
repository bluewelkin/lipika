package lipika;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class youhuiquan  {
	public static void main(String[] args) throws IOException {
		File file=new File("c:\\test6.txt");
		FileInputStream fis=null;
		Scanner input=null;
		String str="INSERT INTO coupon(promoRuleId,couponNo,isSent,remainedTimes,STATUS,VERSION)"
				+ "VALUES(38,123456789,0,1,1,0);";
		
		
			fis=new FileInputStream(file);
			input=new Scanner (fis);			
	
	
		StringBuffer nr=new StringBuffer();
		 File outputFile = new File("c:\\test7.txt"); 
		 FileWriter out = new FileWriter(outputFile); //创建文件写出类
		while(input.hasNext())
		{
			String hn = input.next();		
				out.write(str.replace("123456789", hn)+ "\r\n");   //使用write()方法向文件写入信息   
		}
			
			out.close();
		}    
		


  }


