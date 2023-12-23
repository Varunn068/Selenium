package apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\LENOVO\\Desktop\\Projects\\selenium\\Documents\\Test4.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook  work = new HSSFWorkbook(fis);
		HSSFSheet  sheet = work.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowcount;i++) {
			HSSFRow row  =sheet.getRow(i);
		int cellcount = row.getPhysicalNumberOfCells();
		for(int j=0;j<cellcount;j++) {
			HSSFCell cell= row.getCell(j);
			String cellvalue = getcellvalue(cell);
			System.out.println("||"+cellvalue);
		}
		System.out.println();
		}
		work.close();
		fis.close();
	}
	
	public static String getcellvalue(HSSFCell cell) {
		switch(cell.getCellType()) {
		case NUMERIC :
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN :
			return String.valueOf(cell.getBooleanCellValue());
		case STRING :
			return cell.getStringCellValue();
		
			default:
				return cell.getStringCellValue();
				
		}
	}

}
