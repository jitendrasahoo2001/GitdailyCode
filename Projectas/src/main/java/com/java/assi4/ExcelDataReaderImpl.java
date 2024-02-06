package com.java.assi4;

import org.apache.poi.ss.usermodel.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelDataReaderImpl implements ExcelDataReader {

	@Override
	public List<ExcelData> readExcelData(String filePath) {
        List<ExcelData> excelDataList = new ArrayList<>();
        
        try (FileInputStream fis = new FileInputStream(filePath);
        		Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    excelDataList.add(new ExcelData(cell.toString()));
                }
            }
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			System.err.println("Error reading Excel file: " + e.getMessage());
		}

		return excelDataList;
		
		
	}

}
