package firstpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReading {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\workspace\\data.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
	}

}
