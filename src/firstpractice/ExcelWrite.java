package firstpractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("C://workspace//dileep.xls");
		WritableWorkbook ww=Workbook.createWorkbook(fos);
		WritableSheet ws=ww.createSheet("dileep", 0);
		ws.addCell(new Label(0,0,"sudha"));
		ws.addCell(new Label(0,1,"prema"));
		ws.addCell(new Label(1,0,"padma"));
		ws.addCell(new Label(1,1,"dileep"));
		ww.write();
		ww.close();
	}
	

}
