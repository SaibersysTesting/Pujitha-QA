package readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UseIfLoop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Tharun Reddy\\Desktop\\ExcelFileForTest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int num = sheet1.getLastRowNum();
		for(int i=0;i<num;i++){
			sheet1.getRow(i).getCell(0).getStringCellValue();
		}
wb.close();
		

	}

}
