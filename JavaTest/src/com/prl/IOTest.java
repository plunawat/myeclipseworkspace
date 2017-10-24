package com.prl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\abc.txt");
		if(!f.exists()) f.createNewFile();
		
		FileOutputStream f1 =new FileOutputStream (f);
		f1.write("92374923749237493274".getBytes());
		f1.close();
		
		FileInputStream f2 = new FileInputStream("C:\\abc.png");
		System.out.println(f2.available());
	}

}
