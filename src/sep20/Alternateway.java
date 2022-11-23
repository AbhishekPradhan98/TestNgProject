package sep20;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alternateway {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fi=new FileInputStream("E:\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("login");
		int rc=ws.getLastRowNum();
		System.out.println("no of rows are ::"+rc);
		String user=ws.getRow(10).getCell(0).getStringCellValue();
		String pass=ws.getRow(5).getCell(1).getStringCellValue();
		System.out.println(user+ " "+pass);
		
		fi.close();
		wb.close();

	}

}
