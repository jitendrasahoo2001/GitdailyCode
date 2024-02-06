package com.java.assi4;

import java.util.List;

public class ExcelToTextApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String excelFilePath = "D:\\\\New folder\\\\Book.xlsx";
	        String textFilePath = "D:\\New folder\\dbefwjk.txt";

	        ExcelDataReader excelDataReader = new ExcelDataReaderImpl();
	        TextFileWriter textFileWriter = new TextFileWriterImpl();

	        List<ExcelData> excelDataList = excelDataReader.readExcelData(excelFilePath);
	        textFileWriter.writeDataToFile(excelDataList, textFilePath);

	        System.out.println("Data copied from Excel file to text file successfully");

	}

}
