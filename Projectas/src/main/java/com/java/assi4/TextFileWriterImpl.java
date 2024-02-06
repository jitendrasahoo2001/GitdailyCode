package com.java.assi4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextFileWriterImpl implements TextFileWriter {

	@Override
	public void writeDataToFile(List<ExcelData> excelDataList, String filePath) {
		// TODO Auto-generated method stub
		try (FileWriter writer = new FileWriter(filePath)) {
            for (ExcelData excelData : excelDataList) {
                writer.write(excelData.getData() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to text file: " + e.getMessage());
        }
    }
		
	}


