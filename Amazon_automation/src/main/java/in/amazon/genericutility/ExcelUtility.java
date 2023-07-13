package in.amazon.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility{
	public String readStrinDataFromExcel(String SheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String cellData = workbook.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return cellData;
	}
}



