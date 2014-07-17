package lipika;

import java.io.*;

public class main {

public static void main(String[] args) throws IOException {

  

    File outputFile = new File("c:\\test6.txt"); 
    FileWriter out = new FileWriter(outputFile); //创建文件写出类
 
	for(int i=10031893;i<=10031963;i++){
		
		out.write(i + "\r\n");   //使用write()方法向文件写入信息   
	}
	out.close();
}    
}

