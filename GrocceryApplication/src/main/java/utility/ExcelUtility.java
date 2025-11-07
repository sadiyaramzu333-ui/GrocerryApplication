package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f;  //in-built class to read data from the file
	static XSSFWorkbook wb;   //in-built class to read data from the workbook
	static XSSFSheet sh;     //in-built class to read data from the sheet
	public static String getStringData(int a,int b,String sheet) throws 
IOException
	{
		f=new FileInputStream("C:\\Users\\sadiy\\git\\GrocerryApplication\\GrocceryApplication\\src\\test\\resources\\Testdata.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet); //is a method used to get details from the sheet - getSheet
		XSSFRow r =sh.getRow(a);// XSFFRow is an in built class that read data from row
		//getRow is a method used to get details from row.
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue(); //is a method used to return string value-getStringCellValue
	}
	public static String getIntData(int a,int b,String sheet) throws IOException
	{
		f=new FileInputStream("C:\\Users\\sadiy\\git\\GrocerryApplication\\GrocceryApplication\\src\\test\\resources\\Testdata.xlsx");
		wb = new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x = (int)c.getNumericCellValue();// is a method used to return number values.   
		return String.valueOf(x);   //valueof is used convert one datatype to string.
		
	}
	public static String getFloatData(int a,int b,String sheet) throws IOException
	{
		f=new FileInputStream("C:\\Users\\sadiy\\git\\GrocerryApplication\\GrocceryApplication\\src\\test\\resources\\Testdata.xlsx");
		wb = new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float x = (float)c.getNumericCellValue();// is a method used to return number values.   
		return String.valueOf(x);   //valueof is used convert one datatype to string.
		
	}

}
