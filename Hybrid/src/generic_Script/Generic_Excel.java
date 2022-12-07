package generic_Script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {
public static String getData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream  fis = new FileInputStream("./Poi/Excell.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Cell cl = book.getSheet(sheet).getRow(row).getCell(cell);
	String value = cl.getStringCellValue();
	return value;
	}
}
