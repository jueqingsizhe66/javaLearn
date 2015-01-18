/**
 * 
 */

/**
 * @author XinRan
 *
 */
import java.util.regex.*;
public class TestRegex1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
	       String line = "This order was placed for Santana.2000! Ok?";
	        //String pattern = "(.*)(\\d+)(.*)";
	        //String pattern = "(\\w*)([0-9]+)(.*)";
	        String pattern = "([a-zA-Z]*)\\.([0-9]+)(.*)";
	        // create a Pattern object
	        Pattern  peach = Pattern.compile(pattern);
	        // Now create a matcher object
	        Matcher m = peach.matcher(line);
	        if(m.find())
	        {
	            System.out.println("Found value:" + m.group(0));
	            System.out.println("Found value:" + m.group(1));
	            System.out.println("Found value:" + m.group(2));
	            System.out.println("Found value:" + m.group(3));
	        }else
	        {
	            System.out.println("No matched");
	        }

	        String output = replaceOneToTwo("2000","2005",line);
	        System.out.println("output : "+output);
	        
	        String ipAddress = "192.168.1.1";
	        printIp(ipAddress);
	        
	        getGroup("da12bka34342434bdca10000bdca234bm");//get 3434243 not 10000

	    }
	    public static String replaceOneToTwo(String findString,String replaceString,String line)
	    {
	        String pattern = findString;
	        Pattern peach = Pattern.compile(pattern);
	        Matcher m = peach.matcher(line);
	        String Input = m.replaceAll(replaceString);
	        return Input;
	    } 

	    public static void printIp(String ipAddress)
	    {
	        //String pattern = "([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})";
	       String pattern = "(25[0-5]|2[0-4]//d|1//d{2}|[1-9]?//d)(//.(25[0-5]|2[0-4]//d|1\\d{2}|[1-9]?//d)){3}";
	    	
	    	//String pattern = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
	        System.out.println(ipAddress);
	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(ipAddress);
	        
	        //System.out.println(m.group(1));

	        while(m.find())
	        {
	            System.out.println(m.group());
	        }
	    }
	    public static void getGroup(String line)
	    {
	    	Pattern p = Pattern.compile("(?<!c)a(\\d+)bd");
	    	Matcher m = p.matcher(line);
	    	while(m.find())
	    	{
	    		System.out.println(m.group(1));
	    		System.out.println(m.group(0));
	    	}
	    }
	}

