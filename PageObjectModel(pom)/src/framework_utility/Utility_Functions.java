package framework_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Functions extends Base_Test
{
	
	public static void sendKeys(WebElement element ,String value)
	{
		element.sendKeys(value);
	}
	public static void click(WebElement ele)
	{
		ele.click();
	}
	public static void usingText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void usingIndex(WebElement element,int i)
	{
		Select sel = new Select(element);
		sel.selectByIndex(i);
	}
	public static void usingValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public static String testConfiguration(String key) throws IOException
	{
		String filePath = "Test Configeration/config.properties";
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
		public static Object[][] testData(String sheetName) throws IOException {	
		String filePath = "./Test_Data/Data.xlsx";
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
	
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[rows-1][cells]; 
		
		for (int i = 1; i < rows; i++)
		{
			for (int j = 0; j <= cells-1; j++) 
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}
