package sep19;

import java.io.FileInputStream;
 import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountRows {

	public static void main(String[] args) throws Throwable 
	{
		//read path of excel
	   FileInputStream fi=new FileInputStream("E:\\Book1.xlsx");
	   //get workbook from file
	   XSSFWorkbook wb=new XSSFWorkbook(fi);
	   //get sheet from workbook
	   XSSFSheet ws=wb.getSheet("login");
	   
	   //get first row from sheet
	   XSSFRow row=ws.getRow(0);
	   
	   // count no cell in a row
	   int rc=ws.getLastRowNum();
	   
	   //count no of cell in first row
	   int cc = row.getLastCellNum();
	   System.out.println("No of rows are::"+rc+" "+"no of cells are ::"+cc);
	   fi.close();
	   wb.close();
       
	}

}
