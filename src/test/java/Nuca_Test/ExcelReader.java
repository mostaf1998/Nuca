package Nuca_Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelReader {

    static FileInputStream fis = null;
    public static FileInputStream getFileInputStream()
    {
      String filePath = System.getProperty("user.dir")+"\\src\\test\\Files\\data.xlsx";
        File src = new File(filePath);
        try {
            fis = new FileInputStream(src);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return fis;
    }

    public Object [][] getExcelData() throws IOException {
        fis= getFileInputStream();
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet  = wb.getSheetAt(0);

        int TotalNumbersOfRows = (sheet.getLastRowNum()+1);
        int TotalNumberOfcols= 2;



        String [][] arrayExelData = new String [TotalNumbersOfRows][TotalNumberOfcols];

        for (int i=0 ; i<TotalNumbersOfRows;i++)
        {


            for (int j=0 ; j<TotalNumberOfcols;j++)
            {

                XSSFRow row  = sheet.getRow(i);
                XSSFCell cell=row.getCell(j);
                String value=cell.toString();
                if(value!=null && value.endsWith(".0")){
                    value=value.substring(0, value.indexOf(".0"));
            }
                arrayExelData[i][j]=value;

            }
        }

        wb.close();
        return arrayExelData;

    }



}

