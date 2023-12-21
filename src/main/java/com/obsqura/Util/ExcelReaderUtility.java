package com.obsqura.Util;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.obsqura.constants.Constants;

public class ExcelReaderUtility {

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int a, int b) throws IOException

	{

		f=new FileInputStream(Constants.EXCELFILE);
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();

	}

}
