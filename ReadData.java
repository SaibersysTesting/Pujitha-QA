package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.lang.Exception;


import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String args[]) throws Exception{
		//specify the file class object to locate the file to upload
		File f = new File("C:\\Users\\Tharun Reddy\\Desktop\\ExcelFileForTest.xlsx");
		// create file-input-stream class object and specify the file source
		FileInputStream fis = new FileInputStream(f);
		// to load the complete excel file (which is called workbook) create xssfworkbook class object
		//for .xlsx use XSSFWorkbook or else use HSSFWorkbook classes
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// for .xlx file use hffs workbook or else for xlsx use 
		//HSSFWorkbook wb1 = new HSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		wb.close();
		
		
		
		
		
	}

}
