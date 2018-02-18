package firstpractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("C://workspace//dileep.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello how are you");
		
		bw.close();;
	}
	

}
