/**
 * 
 */

/**
 * @author XinRan
 *
 */
public class TestExceptionDefinedRuntime extends RuntimeException
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
			throw new TestExceptionDefinedRuntime("有点错误");
			// throw new IllegalArgumentException(); // 一样的效果
		}
	}
	public TestExceptionDefinedRuntime()
	{
		super();
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefinedRuntime(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefinedRuntime(String message, Throwable cause)
	{
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefinedRuntime(String message)
	{
		super(message);
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefinedRuntime(Throwable cause)
	{
		super(cause);
		// TODO 自动生成的构造函数存根
	}

}
