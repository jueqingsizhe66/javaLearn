/**
 * 
 */

/**
 * @author XinRan
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
public class TestCalendar
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
        //Canlendar cl = new Canlendar();
        Calendar cl = Calendar.getInstance();
        System.out.println(cl);

        System.out.println(" Calendar.WEEK_OF_YEAR = "+cl.get(Calendar.WEEK_OF_YEAR));
        System.out.println(" Calendar.DAY_OF_MONTH = "+cl.get(Calendar.DAY_OF_MONTH));
        System.out.println(" Calendar.DAY_OF_YEAR = "+cl.get(Calendar.DAY_OF_YEAR));
        System.out.println(" Calendar.HOUR_OF_DAY = "+cl.get(Calendar.HOUR_OF_DAY));
        System.out.println(" Calendar.YEAR = "+cl.get(Calendar.YEAR));
        System.out.println(" Calendar.MONTH = "+cl.get(Calendar.MONTH)+1);
        System.out.println(" Calendar.HOUR = "+cl.get(Calendar.HOUR));
        System.out.println(" Calendar.MINUTE = "+cl.get(Calendar.MINUTE));
        System.out.println(" Calendar.SECOND = "+cl.get(Calendar.SECOND));


        Date now = new Date();
        System.out.println("Date now : "+now);

        Date now1 = new Date(System.currentTimeMillis());
        System.out.println("Date now : "+now);


        cl.set(2014,1,18);
        Date d1 =cl.getTime();
        System.out.println(d1);

        cl.set(2014,12,18);
        Date d2 =cl.getTime();
        System.out.println(d2);


        Date d3 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //  Year --> y
        //  Month -> M
        //  Day ---> d
        //  Hour --->H
        //  Minute --> m
        //  Second -->s
        String s = sdf.format(d3);
        System.out.println(s);
        
        Date d5 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss");
        String s2 = sdf1.format(d5);
        System.out.println(s2);
        try
        {
            Date d4 = sdf.parse("2019-8-9");
            System.out.println(d4);
        }catch(ParseException e)
        {
            e.printStackTrace();
        }

	}

}
