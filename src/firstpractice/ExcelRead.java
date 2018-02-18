package firstpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {
	public static void main(String[] args) throws  Exception {
		FileInputStream fis=new FileInputStream("C:\\workspace\\data.xls");
		Workbook w=Workbook.getWorkbook(fis);
		Sheet s=w.getSheet(0);
		for(int r=0;r<s.getRows();r++) {
			System.out.println(s.getCell(0, r).getContents());
		}
		w.close();
		
	}

}
