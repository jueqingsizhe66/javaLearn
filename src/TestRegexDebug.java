/*
 * @author :Ҷ����
 * @email  : zhaoturkkey@163.com
 * @purpose : ����������ʽ�ĵ��Թ��̵���ʶ
 * 
 * */
import java.util.regex.*;
public class TestRegexDebug
{
	   private static final String pattern = "\\bcat\\b";
	    private static final String line = "cat cat cat cattie cat";
	    public static void main(String[] args)
	    {
	        debugMatched(pattern,line);
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
