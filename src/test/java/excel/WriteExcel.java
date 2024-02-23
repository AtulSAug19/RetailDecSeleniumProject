package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("./src/test/resources/TestData.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fileInput);
		
		Sheet sheet = workbook.getSheet("data");
		int totalRows = sheet.getLastRowNum();
//		int totalCols = sheet.getRow(0).getLastCellNum();
		System.out.println("Total Rows:"+totalRows);
//		System.out.println("Total Cols:"+totalCols);
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=2;j<3;j++) {
			Row row = sheet.getRow(i);
			row.createCell(j,CellType.STRING).setCellValue("Failed");
			FileOutputStream fileOutput = new FileOutputStream(file);
			workbook.write(fileOutput);
			}
		}
		workbook.close();		

	}

}
