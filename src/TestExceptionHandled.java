import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */

/**
 * @author XinRan
 *
 */
public class TestExceptionHandled
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ParseException,FileNotFoundException
	{
		// TODO �Զ����ɵķ������
		/*
		try
		{
			throw new IOException("aaa");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try
		{
			throw new RuntimeException("bbb");
		}finally
		{
			
		}
		*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date =null;
		FileInputStream fis = null; 

		date = sdf.parse("2019-1-4");
		fis = new FileInputStream("e:/a.txt");
		/*
		try
		{
			date = sdf.parse("2019-1-4");
			fis = new FileInputStream("e:/a.txt");
		} catch (ParseException e)
		{
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}*/
		System.out.println(date);
	}

}
