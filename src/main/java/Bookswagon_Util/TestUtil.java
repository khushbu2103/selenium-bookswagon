package Bookswagon_Util;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtil
{
    public static long PAGE_LOAD_TIMEOUT=20;
    public static long IMPLICIT_WAIT=10;
//    public void switchToFrame()
//    {
//        driver.switchTo().frame("mainpanel");
//    }
   static String filePath = "C:\\Users\\LENOVO\\Desktop\\TestData.xlsx";
    static Workbook workbook;
    static Sheet sheet;
    public static Object[][] workBook(String sheetName) throws IOException {
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream(filePath);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try {
            workbook = WorkbookFactory.create(fileInputStream);
        }
        catch (EncryptedDocumentException | IOException e)
        {
            e.printStackTrace();
        }
        sheet = workbook.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i< sheet.getLastRowNum(); i++)
        {
            for (int k=0; k< sheet.getRow(0).getLastCellNum(); k++ )
            {
                data[i][k] = sheet.getRow(i+1).getCell(k).toString();
            }
        }
        return data;
    }

}