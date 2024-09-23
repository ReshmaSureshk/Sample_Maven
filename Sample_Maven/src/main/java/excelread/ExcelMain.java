package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = ExcelCode.readStringData(1, 0);

		double d = ExcelCode.readIntegerData(1, 1);

		System.out.println(s);

		System.out.println(d);
	}

}
