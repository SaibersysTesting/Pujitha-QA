package readExcel;

import libraryCodeToReUse.Reusecode;

public class ReadfromReUsedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reusecode excel = new Reusecode("C:\\Users\\Tharun Reddy\\Desktop\\ExcelFileForTest.xlsx");
System.out.println(excel.getData(0,1,1));
	}

}
