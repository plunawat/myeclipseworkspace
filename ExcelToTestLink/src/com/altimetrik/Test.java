package com.altimetrik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	
	public static void main(String args[]) throws IOException	{
		
		String inputExcelFile="C:\\PRL\\Altimetrik\\Isha\\Old_Data.xlsx";
		String outputExcelFile="C:\\PRL\\Altimetrik\\Isha\\Old_Data2.xlsx";
		String workbookSheet="Sheet1";
		
		//Read Input File
	    File inputFile = new File(inputExcelFile);
	    FileInputStream fIS = new FileInputStream(inputFile);
	   
	    Map<Integer,List<String>> excelTable = readExcel(inputFile,workbookSheet);
	    fIS.close();
	    
	    //Write Output File
		int beginRowNo = 0;
		int rowIncrementer = 0;
		
	    File file = new File("C:\\PRL\\Altimetrik\\Isha\\Old_Data2.xlsx");
	    if(file.exists() ==  false)	{
	    	file.createNewFile();
	    }
	    
    	XSSFWorkbook workbook = new XSSFWorkbook(); 
        XSSFSheet spreadsheet = workbook.createSheet("Sheet2");
		
		for(Map.Entry<Integer,List<String>> entry : excelTable.entrySet())	{
			
			//This map holds single testcase, where value is Testcase column data splited using return key. 
			Map<Integer,String[]> newRow = new TreeMap<>();
			
			int columnCounter=0;
			List<Integer> arraySizeList = new ArrayList<>();
			//int arraySize[] = new int[];
			int arraySizeCounter = 0;
			
			newRow.put(0, new String[]{entry.getKey().toString()});
			newRow.put(1, new String[]{entry.getValue().get(1)+"_IF4_"+entry.getValue().get(1)+entry.getKey()});
			newRow.put(2, entry.getValue().get(0).split("\n"));
			newRow.put(3,seperatePre(entry.getValue().get(2).split("\n")).get(0) );
			newRow.put(4, new String[]{"Manual"});
			newRow.put(5, new String[]{""});
			newRow.put(6, seperatePre(entry.getValue().get(2).split("\n")).get(1));
			newRow.put(7, entry.getValue().get(4).split("\n"));
			
			for(Map.Entry<Integer,String[]> newRow1 : newRow.entrySet())	{
				arraySizeList.add(newRow1.getValue().length);
			}
			

			rowIncrementer = maxArraySize(arraySizeList);
			
			writeExcel(beginRowNo,newRow,spreadsheet,workbook,file,rowIncrementer);
			beginRowNo = beginRowNo + rowIncrementer;
		} 	
	}
	
	public static List<String[]> seperatePre(String [] str)	{
		
		List<String[]> stringList = new ArrayList<>();
		
		List<String> preReqString = new ArrayList<>();
		List<String> stepString = new ArrayList<>();
		

		int stepRowCounter = 0;
		
		for(int i=0;i<str.length;i++)	{
			if(str[i].contains("Prerequisite:") || str[i].contains("prerequisite:"))	{
				continue;
			}else	{
				preReqString.add(str[i]);
			}
			
			if(str[i].equals("") || str[i]==null)	{
				stepRowCounter = i+1;
				break;
			}
		}
		
		for(int i=stepRowCounter;i<str.length;i++)	{
			stepString.add(str[i]);
		}
		stringList.add(0,preReqString.toArray(new String[]{}));
		stringList.add(1,stepString.toArray(new String[]{}));
		
		return stringList;
		
	}
	
	public static int maxArraySize(List<Integer> arraySizeList)	{
		int maxSize=0;
		for(int i : arraySizeList)	{
			if(maxSize < i)	{
				maxSize = i;
			}
		}
		return maxSize;
		
	}

	public static void writeExcel(int beginRowNo,Map<Integer,String[]> newRow, XSSFSheet spreadsheet,XSSFWorkbook workbook,File file,int rowIncrementer ) throws IOException	{
		
	    List<int[]> cellRange = new ArrayList<>();
		try	{
	
	       	for(int i=0;i<rowIncrementer;i++)	{
	
	       		Row row = spreadsheet.createRow(beginRowNo + i);
	       		for(int j=0;j<8;j++)	{
		       		row.createCell(j);
		       	}
	        } 
	        
	        for(Map.Entry<Integer, String[]> entry : newRow.entrySet())	{
	        	
	        	for(int i=0;i<entry.getValue().length;i++)	{      		
	        		spreadsheet.getRow(beginRowNo + i).getCell(entry.getKey()).setCellValue(entry.getValue()[i]);
	        	}
	        }
	        
	        for(int i=0;i<8;i++)	{
	        	
	        	 for(int j=0;j<rowIncrementer;j++)	{
	  	        	Row row = spreadsheet.getRow(beginRowNo + j);
	  	        	String cellValue= row.getCell(i).getStringCellValue();
	  	        	if(cellValue.equals("") || cellValue == null)	{
	        			
	  	        		int i1[] = new int[4];
	        			if(j !=0)	{
	        				i1[0] = (beginRowNo + j) - 1;
	        			}else {
	        				i1[0] = beginRowNo + j;
	        			}
	        			
	        			i1[1] = (rowIncrementer+beginRowNo) - 1;
	        			i1[2] = i;
	        			i1[3] = i;
	        			
	        			cellRange.add(i1);
	        			break;
	        		}
	        	}
	        }
	        
	        for(int[] i1 : cellRange )	{
	        	int r1 = spreadsheet.addMergedRegion(new CellRangeAddress(i1[0], i1[1], i1[2], i1[2]));

	        }
	        
	        FileOutputStream fos = new FileOutputStream(file);
	        workbook.write(fos);
	        fos.flush();
	        fos.close();
	        
	    
	   }
	    catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static Map<Integer,List<String>> readExcel(File inputFile,String sheetName) throws IOException	{
			
			Map<Integer,List<String>> excelTable = new TreeMap<>();
	
		    XSSFRow row=null;
			try {
				
				XSSFWorkbook workbook = new XSSFWorkbook(inputFile);
				XSSFSheet spreadsheet = workbook.getSheet(sheetName);
				
	     	    Iterator <Row> rowIterator = spreadsheet.iterator();
	     	    while (rowIterator.hasNext()) 
	            {
	     	      List<String> columnData = new ArrayList<>();
	              row = (XSSFRow) rowIterator.next();
	              Iterator <Cell> cellIterator = row.cellIterator();
	              int mapKey = 0;
	              Cell keyCell = cellIterator.next(); 
	              
	              //Add first column as map key
	              if(keyCell.getCellTypeEnum() == CellType.NUMERIC)	{
	            	  mapKey = new Integer((int) keyCell.getNumericCellValue());
	              }else	{
	            	  mapKey = Integer.parseInt(keyCell.getStringCellValue());
	              }
	            
	              //Add remaining data 
	              while (cellIterator.hasNext()) 
	              {
	            	String cellVal=null;
	            	Cell valueCell = cellIterator.next();
	            	if(valueCell.getCellTypeEnum() == CellType.NUMERIC)	{
	            		  cellVal = new Integer((int) valueCell.getNumericCellValue()).toString();
	                  }else	{
	                 	 cellVal = valueCell.getStringCellValue();
	                  }
	                 columnData.add(cellVal);
	              }
	              excelTable.put(mapKey, columnData);
	            }
	
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			return excelTable;
		}

}
