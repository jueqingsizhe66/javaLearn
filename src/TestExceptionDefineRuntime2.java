/**
 * 
 */

/**
 * @author XinRan
 *
 */
public class TestExceptionDefineRuntime2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		test(1);
	}
	public static void test(int i)
	{
		if(i < 10)
		{
			throw new my1Exception("有点错");
		}
	}

}

class my1Exception extends RuntimeException
{

	public my1Exception()
	{
		super();
		// TODO 自动生成的构造函数存根
	}

	public my1Exception(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

	public my1Exception(String message, Throwable cause)
	{
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	public my1Exception(String message)
	{
		super(message);
		// TODO 自动生成的构造函数存根
	}

	public my1Exception(Throwable cause)
	{
		super(cause);
		// TODO 自动生成的构造函数存根
	}
	
}
