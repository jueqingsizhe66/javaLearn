public class TestExceptionStructure
{
    public static void main(String[] args)
    {
        try
        {
            Integer i1 = null;
            int i2 = i1;
        }catch(NullPointerException e)
        {
            System.out.println("δ���г�ʼ��");
        }

        try
        {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
            int[] banana = {1,3,5};
            for(int  i = 0; i< banana.length+1; i++)
            {
                System.out.println("banana["+i+"] :"+banana[i]);
            }
        }catch(ArithmeticException e)
        {
            System.out.println("����������Ϊ0");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("����Խ����");
        }

        // jdk1.7
        try
        {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
            int[] banana = {1,3,5};
            for(int  i = 0; i< banana.length+1; i++)
            {
                System.out.println("banana["+i+"] :"+banana[i]);
            }
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("������������");
        }
    }
}