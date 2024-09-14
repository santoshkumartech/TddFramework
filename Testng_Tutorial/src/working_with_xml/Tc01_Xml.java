package working_with_xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc01_Xml {

	public static void main(String[] args) throws IOException {
		
		String filePath = "./Test_Data/Data.xlsx";
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("ELF");
		int row_count = sheet.getPhysicalNumberOfRows();
		System.out.println(row_count);
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rows][cells]; 
		
		for (int i = 1; i < rows; i++)
		{
			for (int j = 0; j < cells; j++) 
			{
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i][j]);
			}
		}
	}
}
