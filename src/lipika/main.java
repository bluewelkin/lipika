package lipika;

import java.io.*;

public class main {

public static void main(String[] args) throws IOException {

  

    File outputFile = new File("c:\\test6.txt"); 
    FileWriter out = new FileWriter(outputFile); //�����ļ�д����
 
	for(int i=10031893;i<=10031963;i++){
		
		out.write(i + "\r\n");   //ʹ��write()�������ļ�д����Ϣ   
	}
	out.close();
}    
}

