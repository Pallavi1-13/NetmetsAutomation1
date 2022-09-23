package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
   private WebDriver driver;
   
	public static void captureScreenshot(int testID, WebDriver driver) throws IOException
	{
    DateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy HH mm ss");
	Date date = new Date();
	String time = dateformat.format(date);
	TakesScreenshot take = (TakesScreenshot) driver ;
	File src = take.getScreenshotAs(OutputType.FILE);
	File desc = new File("E:\\Screenshot\\Netmet\\Test"+testID+" "+time+".jpeg");
	FileHandler.copy(src, desc);
	 
	//return driver;
	}
	
	
	public static String fetchDataFromExcel() throws EncryptedDocumentException, IOException
	{
	String path = "";
	FileInputStream file = new FileInputStream(path);	
	String value = WorkbookFactory.create(file).getSheet("").getRow(0).getCell(0).getStringCellValue();
	return null;
	}
}
