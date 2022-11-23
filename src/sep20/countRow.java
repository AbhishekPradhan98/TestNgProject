package sep20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class countRow {

	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("  E:\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("login");
		XSSFRow row=ws.getRow(0);
		
		int rc=ws.getLastRowNum();
		//count no of cells
		int cc=row.getLastCellNum();
		System.out.println("no of rows are:: "+rc+" "+"no of cells are::"+cc);
		fi.close();
		wb.close();
		
	
	}

		
	}