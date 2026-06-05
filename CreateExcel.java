package TestNG;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
    public static String[][] readData() throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
        XSSFSheet sheet = wb.getSheetAt(0);
        int rowCount = sheet.getLastRowNum();
        System.out.println(rowCount);
        int coulmnCount = sheet.getRow(0).getLastCellNum();
        System.out.println(coulmnCount);
        //String stringCellValue = wb.getRow(2).getCell(1).getStringCellValue();
        //System.out.println(stringCellValue);
        String[][] data = new String[rowCount][coulmnCount];

        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < coulmnCount; j++) {
                String cellValue = row.getCell(j).getStringCellValue();
                data[i-1][j] = cellValue;
            }
        }
        wb.close();

        return data;
    }
}
