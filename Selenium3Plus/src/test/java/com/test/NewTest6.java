package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NewTest6 {
	
	@Test
	
	public void test() {
		
		File file=new File("Book1.xlsx");
		
		
		try {
			InputStream is=new FileInputStream(file);
			
			try {
				XSSFWorkbook xssf=new XSSFWorkbook(is);
				
				XSSFSheet sheet1=xssf.getSheet("Sheet1");
				for(int i=1; i<=sheet1.getLastRowNum();i++)
				{
					System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue()+"\t\t\t"
							+sheet1.getRow(i).getCell(1).getStringCellValue()+"\t\t\t"+sheet1.getRow(i).getPhysicalNumberOfCells());
				}
				
				
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
