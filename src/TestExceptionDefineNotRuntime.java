/**
 * 
 */

/**
 * @author XinRan
 *
 */
public class TestExceptionDefineNotRuntime extends Exception
{

	public TestExceptionDefineNotRuntime()
	{
		super();
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefineNotRuntime(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefineNotRuntime(String message, Throwable cause)
	{
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefineNotRuntime(String message)
	{
		super(message);
		// TODO 自动生成的构造函数存根
	}

	public TestExceptionDefineNotRuntime(Throwable cause)
	{
		super(cause);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static void test(int i) throws TestExceptionDefineNotRuntime
	{
		if(i < 10)
		{
			/*try
			{
				throw new TestExceptionDefineNotRuntime("不是自己");
			} catch (TestExceptionDefineNotRuntime e)
			{
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}*/
			throw new TestExceptionDefineNotRuntime("不是自己");
		}
	}

}
