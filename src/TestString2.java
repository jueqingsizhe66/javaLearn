import java.util.regex.*;
public class TestString2
{
    public static void main(String[] args)
    {
        String line = "How old are you";
        //System.out.println("a is at the "+line.charAt('a'));
        System.out.println("a is at the "+line.charAt(3));
        System.out.println("the first o'index is "+line.indexOf('o'));
        System.out.println("the first ol'index is "+line.indexOf("ol"));
        System.out.println("the first ol' last index is "+line.lastIndexOf('o'));

        System.out.println("from a to end the string is"+line.substring(line.indexOf('a')));
        System.out.println("from a to end the string is"+line.substring(3,7));


        String movie ="xiaoze[1995]maliye.avi";
        getFilename(movie);
        getFilename2(movie);
        //getFilename3(movie);
        String ipAddress = "192.168.1.1";
        printIp(ipAddress);
        
    }
    public static void printIp(String ipAddress)
    {
        String pattern = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(ipAddress);
        /*
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
            System.out.println(m.group(4));
            */
        while(m.find())
        {
            System.out.println(m.group());
        }
    }

    public static String getFilename(String movie)
    {
        int index = movie.indexOf('.');
        int leftSquare = movie.indexOf('[');
        int rightSquare = movie.indexOf(']');
        System.out.println(index);
        String fileName=movie.substring(1,index);
        String fileFormat=movie.substring(index);
        System.out.println("fileName: "+fileName+" \nfileFormat: "+fileFormat);

        String year = movie.substring(leftSquare+1,rightSquare);
        System.out.println("file year: "+year);
        return fileName;

    }
    public static void getFilename2(String movie)
    {
        String[] movies = movie.split("\\.");  // in the split ,you can write down  your regex expression
        for(int i=0; i< movies.length;i++)
        {
            System.out.println(movies[i]);
        }

    }
    public static String getFilename3(String movie)
    {
        String pattern1 = "(.*)(\\.)(.*)";
        Pattern pattern = Pattern.compile(pattern1);
        Matcher m = pattern.matcher(movie);
        String result=m.group();//m.group(1);
        System.out.println(m.matches());
        debugMatched(pattern1,movie);
        return result;

    }
	    public static void debugMatched(String pattern,String line)
	    {
	        Pattern peach = Pattern.compile(pattern);
	        Matcher m = peach.matcher(line);
	        int count =0;
	        while(m.find())
	        //if(m.find())
	        {
	            count++;
	            System.out.println("Match number :"+ count);
	            System.out.println("Match "+count+": from character "
	                    +m.start()+" to character "+m.end());
	            
	        }
	    }
}