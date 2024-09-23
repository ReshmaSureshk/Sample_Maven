package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode
{
//file--.wb--.sheet-->row nd col
//if we need to fetch the above details file,workbook,sheet etc java has predefined classes

public static FileInputStream f; //used to fetch file , and here FileInputStream is class
public static XSSFWorkbook w; //used to fetch workbook and here XSSFWorkbook is class
public static XSSFSheet s; //used to fetch sheet and here XSSFWorkbook is class
//in that excel sheet we have string nd int values

//to get string values we use below method
public static String readStringData(int i, int j) throws IOException
{
f = new FileInputStream("C:\\Users\\shoth\\OneDrive\\Desktop\\ExcelRead.xlsx"); //fetching the file location
w = new XSSFWorkbook(f); //workbook is inside the file
s = w.getSheet("Sheet1") ; //sheet is inside the workbook
XSSFRow r = s.getRow(i); //XSSFRow is predefined class nd it denoted to i nd used to fetch row
XSSFCell c = r.getCell(j);//XSSFCell is predefined class nd it denoted to j nd used to fetch col
return c.getStringCellValue(); //getStringCellValue() it will return the string values of cell not integers
}

//to get int values of cell

public static double readIntegerData(int i , int j) throws IOException
{
f = new FileInputStream("C:\\Users\\shoth\\OneDrive\\Desktop\\ExcelRead.xlsx"); //fetching the file location
w = new XSSFWorkbook(f); //workbook is inside the file
s = w.getSheet("Sheet1") ; //sheet is inside the workbook
XSSFRow r = s.getRow(i); //XSSFRow is predefined class nd it denoted to i nd used to fetch row
XSSFCell c = r.getCell(j);//XSSFCell is predefined class nd it denoted to j nd used to fetch col
return c.getNumericCellValue(); //it takes integer values
}

}
