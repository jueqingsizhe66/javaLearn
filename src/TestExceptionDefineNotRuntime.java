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
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefineNotRuntime(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefineNotRuntime(String message, Throwable cause)
	{
		super(message, cause);
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefineNotRuntime(String message)
	{
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefineNotRuntime(Throwable cause)
	{
		super(cause);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������

	}
	public static void test(int i) throws TestExceptionDefineNotRuntime
	{
		if(i < 10)
		{
			/*try
			{
				throw new TestExceptionDefineNotRuntime("�����Լ�");
			} catch (TestExceptionDefineNotRuntime e)
			{
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}*/
			throw new TestExceptionDefineNotRuntime("�����Լ�");
		}
	}

}
