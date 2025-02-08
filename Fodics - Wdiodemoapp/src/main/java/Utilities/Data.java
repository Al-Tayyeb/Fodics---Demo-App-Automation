package Utilities;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Data {
	
	String DataPath   = "src/main/java/Utilities/TestData.xlsx" ;
	// GET THE VALUE FOR THE DESIRED CELL IN THE ROW YOU CHOOSE ( IT WILL RETURN NOT PRINT THE VALUE ) 
    public String Get_Cell_Value( int desiredColumn ,int desiredRow) throws IOException {
    	String CellValue = null ;
		 // Read the Excel file using Apache POI
        FileInputStream fileInputStream = new FileInputStream(new File(DataPath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Get the desired row and column values
        Row row = sheet.getRow(desiredRow);
        Cell cell = row.getCell(desiredColumn);

        // Check the cell type and return the value
        if (cell != null) {
            CellType cellType = cell.getCellType();
            
            if (cellType == CellType.STRING) {
                CellValue = cell.getStringCellValue();
            } else if (cellType == CellType.NUMERIC) {
				CellValue = String.valueOf(cell.getNumericCellValue());
				// Remove ".0" if present at the end of the string
				if (CellValue.endsWith(".0")) {
					CellValue = CellValue.substring(0, CellValue.length() - 2);
				}

            } else if (cellType == CellType.BOOLEAN) {
                CellValue = String.valueOf(cell.getBooleanCellValue());
				
            } else if (cellType == CellType.BLANK) {
                System.out.println("<BLANK>");
            }
        }

        // Close the workbook
        workbook.close();
		return CellValue;
	}

	// GET ALL DATA IN ALL ROWS
	public void Get_All_Data() throws IOException {
		   // Read the downloaded Excel file using Apache POI
        FileInputStream fileInputStream = new FileInputStream(new File(DataPath));
	    Workbook workbook = new XSSFWorkbook(fileInputStream);
	    Sheet sheet = workbook.getSheetAt(0);

	    // Iterate through rows
	    for (Row row : sheet) {
	        // Iterate through columns
	        int lastCellNum = row.getLastCellNum();
	        for (int col = 0; col < lastCellNum; col++) {
	            Cell cell = row.getCell(col);
	            if (cell != null) {
	                CellType cellType = cell.getCellType();
	                if (cellType == CellType.STRING) {
	                    System.out.print(cell.getStringCellValue() + "\t");
	                } else if (cellType == CellType.NUMERIC) {
	                    System.out.print(cell.getNumericCellValue() + "\t");
	                } else if (cellType == CellType.BOOLEAN) {
	                    System.out.print(cell.getBooleanCellValue() + "\t");
	                } else if (cellType == CellType.BLANK) {
	                    System.out.print("<BLANK>\t");
	                }
	            } else {
	                System.out.print("<NULL>\t");
	            }
	        }
	        System.out.println();
	    }
	    // Close the workbook
	    workbook.close();
	}


}
