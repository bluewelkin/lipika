package lipika;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class tihuanwenjian {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\USER\\Desktop\\5003.txt");
		FileInputStream fis=null;
		Scanner input=null;
		String str="insert into gift_certificate (giftCertificateNo,purchaser,recipient,isSentByEmail,giftCertAmt,remainedAmt,giftType,status,version)"
				+ "values('123456789','N/A','N/A',1,500,500,1,2,0);";
		try{
			fis=new FileInputStream(file);
			input=new Scanner (fis);
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		StringBuffer nr=new StringBuffer();
		while(input.hasNext()){
			String hn = input.next();
			
			System.out.println(str.replace("123456789", hn));
		}
		
			
	
		
                                      
	}

}
