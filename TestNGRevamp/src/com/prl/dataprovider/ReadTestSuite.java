package com.prl.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestSuite {
	
	
	public  Map<String,List<String>> readExcel()	{
		
		Map<String,List<String>> excelTable = new HashMap<>();

	    File file = new File("C:\\Users\\parikshit\\workspace\\TestNGRevamp\\TestSuite.xlsx");
	    FileInputStream fIP = null;
	    
	    XSSFRow row=null;

	    
		try {
			fIP = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet spreadsheet = workbook.getSheet("Sheet1");
			
     	    Iterator <Row> rowIterator = spreadsheet.iterator();
     	    rowIterator.next();
     	    
     	    while (rowIterator.hasNext()) 
            {
     		
     	      List<String> columnData = new ArrayList<>();
              row = (XSSFRow) rowIterator.next();
              Iterator <Cell> cellIterator = row.cellIterator();
              String mapKey = cellIterator.next().getStringCellValue();
              
              while (cellIterator.hasNext()) 
              {
            	 String cellVal = cellIterator.next().getStringCellValue();
                 columnData.add(cellVal);
              }
              excelTable.put(mapKey, columnData);
            }

		} catch (IOException | InvalidFormatException e) {
			e.printStackTrace();
		}
		return excelTable;
	}
}
