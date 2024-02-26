package com.autom.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.InvalidArgumentException;

public class Testutil {
	public static String TESTDATA_SHEET_PATH="C:\\AUTOMATION\\selenium\\eclipse-java-photon-R-win32-x86_64 (3)\\eclipse\\automationmaven\\src\\main\\java\\com\\autom\\qa\\testdata\\loginsheet.xlsx";
	static Workbook book;
	static Sheet sheet;
	public static Object[][]getTestData(String sheetName) throws EncryptedDocumentException, IOException{
		FileInputStream file=null;
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
			
		}catch (InvalidArgumentException e) {
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetName);
		Object[][]data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}

}
