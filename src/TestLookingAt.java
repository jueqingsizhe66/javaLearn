/**
 * 
 */

/**
 * @author XinRan
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestLookingAt
{

	/**
	 * @param args
	 */
    private static final String pattern = "foo";
    private static final String line = "fooooooooooooooooo";
    private static Pattern pattern1;
    private static Matcher matcher;	
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

		       pattern1 = Pattern.compile(pattern);
		       matcher = pattern1.matcher(line);

		       System.out.println("Current pattern is: "+pattern);
		       System.out.println("Current line is: "+line);

		       System.out.println("lookingAt(): "+matcher.lookingAt());
		       System.out.println("matches(): "+matcher.matches());
		   
	}
}


