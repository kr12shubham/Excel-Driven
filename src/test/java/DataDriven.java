import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\kumar\\Downloads\\Selenium\\DemoData.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);
		int sheet = w.getNumberOfNames();
		for (int i = 0; i < sheet; i++)
		{
			if (w.getSheetName(i).equalsIgnoreCase("Datasheet1"))
			{
				XSSFSheet s = w.getSheetAt(i);
				Iterator<Row> fr = s.iterator();
				Row row = fr.next();
				Iterator<Cell> c1 = row.cellIterator();
				int a = 0;
				int column = 0;
				while(c1.hasNext())
				{
					Cell value = c1.next();
					if (value.getStringCellValue().equalsIgnoreCase("Test Cases"))
					{
						column = a;
						
					}	a++;
				}System.out.println(column);
			}
		}

	}

}
