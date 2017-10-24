package com.prl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		TreeSet<String> s1 = new TreeSet<>();
		List<String> l1 =new ArrayList<>();

		TreeMap<String,String> t1 = new TreeMap<>();
		
		File f1 = new File("C:\\StrykerCMFDataFile.xlsx");
		FileInputStream fIS = new FileInputStream(f1);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fIS);
			XSSFSheet sheet = workbook.getSheetAt(1);
			
			Iterator<Row> rowIterator = sheet.iterator();
			
			rowIterator.next();
			while(rowIterator.hasNext())	{
				Iterator<Cell> cellIterator = rowIterator.next().iterator();
				
				cellIterator.next();
				while(cellIterator.hasNext())	{
					Cell cell1 =cellIterator.next();
					Cell cell2 =cellIterator.next();
					System.out.println(cell1.getStringCellValue());
					System.out.println(cell2.getStringCellValue());
					
				}
			}
		
			fIS.close();
			/*
		XSSFSheet s1 = workbook.getSheetAt(0);
		XSSFRow r1 = s1.getRow(3);
		XSSFCell c1 = r1.getCell(0);
		c1.setCellValue("BBBBBBBBBB");
		
		
		
		FileOutputStream os = new FileOutputStream(f1);
		workbook.write(os);
		os.close();
		*/
		
		
		 new abc()	{};
	}
}

interface abc	{
	
}
