package Day_7_oops_FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class FileHand_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		FileReader fb = new FileReader("C:\\Users\\DELL\\Desktop\\files\\demo1.txt");
//		BufferedReader br = new BufferedReader(fb);
//		String data = br.readLine();
//		
//		while(data != null){
//			System.out.println(data);
//			data = br.readLine();
//		}
//		fb.close();
		
//		File f = new File("C:\\Users\\DELL\\Desktop\\files\\demo3.txt");
//		f.createNewFile();
		
		
		
		FileReader fb = new FileReader("C:\\Users\\DELL\\Desktop\\files\\demo1.txt");
		BufferedReader br = new BufferedReader(fb);
		FileWriter fb2 = new FileWriter("C:\\Users\\DELL\\Desktop\\files\\demo2.txt");
		
		
		String st;
		
			while((st = br.readLine()) != null){
			 fb2.write(st);
				
		    }
			br.close();
			fb2.close();
		
	
		
	}

}
