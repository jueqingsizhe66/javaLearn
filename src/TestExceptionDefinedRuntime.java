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
		// TODO �Զ����ɵķ������
		test(1);
	}
	public static void test(int i)
	{
		if(i < 10)
		{
			throw new TestExceptionDefinedRuntime("�е����");
			// throw new IllegalArgumentException(); // һ����Ч��
		}
	}
	public TestExceptionDefinedRuntime()
	{
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefinedRuntime(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefinedRuntime(String message, Throwable cause)
	{
		super(message, cause);
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefinedRuntime(String message)
	{
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}

	public TestExceptionDefinedRuntime(Throwable cause)
	{
		super(cause);
		// TODO �Զ����ɵĹ��캯�����
	}

}
