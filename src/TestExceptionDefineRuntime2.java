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
		// TODO �Զ����ɵķ������
		test(1);
	}
	public static void test(int i)
	{
		if(i < 10)
		{
			throw new my1Exception("�е��");
		}
	}

}

class my1Exception extends RuntimeException
{

	public my1Exception()
	{
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public my1Exception(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO �Զ����ɵĹ��캯�����
	}

	public my1Exception(String message, Throwable cause)
	{
		super(message, cause);
		// TODO �Զ����ɵĹ��캯�����
	}

	public my1Exception(String message)
	{
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}

	public my1Exception(Throwable cause)
	{
		super(cause);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
