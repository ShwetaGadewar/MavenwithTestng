package package3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;


public class Test_Data {
	public static String un1;//null
	public static String pwd;//null
	public void Data_fetching() throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\Mypasswords.xlsx");	
        Workbook wb=WorkbookFactory.create(f1);
         un1=NumberToTextConverter.toText(wb.getSheet("amazon_cred").getRow(1).getCell(0).getNumericCellValue());
     
         pwd=wb.getSheet("amazon_cred").getRow(1).getCell(1).getStringCellValue();
	
       
        }
	
}
