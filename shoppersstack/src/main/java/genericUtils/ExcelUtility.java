package genericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String fetchStringDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, FileNotFoundException, IOException {

		return WorkbookFactory.create(new FileInputStream(IPathConstant.EXCEL_FILE_PATH))
				.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}

	/**
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public long fetchNumericDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, FileNotFoundException, IOException {

		return (long)WorkbookFactory.create(new FileInputStream(IPathConstant.EXCEL_FILE_PATH))
				.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
	}

	/**
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public boolean fetchBooleanDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, FileNotFoundException, IOException {

		return WorkbookFactory.create(new FileInputStream(IPathConstant.EXCEL_FILE_PATH))
				.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
	}
	
	public String fetchDateDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, FileNotFoundException, IOException {

		return WorkbookFactory.create(new FileInputStream(IPathConstant.EXCEL_FILE_PATH))
				.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue().toString().substring(0, 10);
	}
	
//	public void writeDataInExcelSheet(String sheetName, int rowNo, int cellNo, String value) throws EncryptedDocumentException, FileNotFoundException, IOException {
//	    Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/testData/TestCasesReport.xlsx"));
//
//	    // Check if the sheet already exists
//	    Sheet sheet = workbook.getSheet(sheetName);
//	    if (sheet == null) {
//	        sheet = workbook.createSheet(sheetName);
//	    }
//
//	    // Check if the row already exists
//	    Row row = sheet.getRow(rowNo);
//	    if (row == null) {
//	        row = sheet.createRow(rowNo);
//	    }
//
//	    // Check if the cell already exists
//	    Cell cell = row.getCell(cellNo);
//	    if (cell == null) {
//	        cell = row.createCell(cellNo);
//	    }
//
//	    // Set the cell value
//	    cell.setCellValue(value);
//
//	    try (FileOutputStream fos = new FileOutputStream("./src/test/resources/testData/TestCasesReport.xlsx")) {
//	        workbook.write(fos);
//	        System.out.println("==============Workbook is Updated=============");
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    } finally {
//	        workbook.close();
//	    }
//	}


}
