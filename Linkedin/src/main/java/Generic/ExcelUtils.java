package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Base.BaseScreen;

public class ExcelUtils extends BaseScreen{
	
	private static File f2 = new File(TestData_Excel_path);  // path
	private static XSSFSheet sheet ;
	private static FileInputStream fis1;
	private static XSSFWorkbook Workbook;
	
	
	public ExcelUtils() throws Exception {
		 fis1 = new FileInputStream(f2);    // file connection
		 Workbook= new XSSFWorkbook(fis1);    // connection to workbook
		 sheet = Workbook.getSheet("testing");    // connection to sheet.

		
	}
	
	
	public XSSFCell getcelldata(int R,int C) throws Exception {
				
		XSSFCell value = sheet.getRow(R).getCell(C) ;
		fis1.close();
		return value;

		
		
	}
	
	
	public void setcelldata(int R,int C ,String value) throws Exception {
		
		Row r1 = sheet.createRow(R);
		Cell c1 = r1.createCell(C);
		c1.setCellValue (value);
		FileOutputStream fos1 = new FileOutputStream(f2);
		Workbook.write(fos1);
		fos1.close();

		
		
	}


}
