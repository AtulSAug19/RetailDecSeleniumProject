package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("./src/test/resources/TestData.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("data");
		int totalRows = sheet.getLastRowNum();
		int totalCols = sheet.getRow(0).getLastCellNum();
		System.out.println("Total Rows:"+totalRows);
		System.out.println("Total Cols:"+totalCols);
		for(int i=0;i<=totalRows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<totalCols;j++)
				if(row.getCell(j).getCellType()==CellType.STRING) {
					System.out.println(row.getCell(j).getStringCellValue());
				}
				else if(row.getCell(j).getCellType()==CellType.NUMERIC)
					System.out.println(row.getCell(j).getNumericCellValue());
		}
		workbook.close();		

	}

}
