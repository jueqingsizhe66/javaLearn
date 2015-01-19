/**
 * 
 */

/**
 * @author XinRan
 *
 */
public class TestStringBuffer
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
        String banana1 = "aaa";
        String banana2 = "bbb";
        String banana3 = "ccc";
        String banana4 = "ddd";
        String banana5 = banana1+ banana2 + banana3 + banana4;
        System.out.println(banana5+"----> banana5 by String combine");

        StringBuffer sb = new StringBuffer();
        sb.append(banana1);
        sb.append(banana2);
        sb.append(banana3);
        sb.append(banana4);
        String banana6 = sb.toString();
        System.out.println(banana6+"----> banana6 by StringBuffer");

        StringBuilder sb1 = new StringBuilder();
        sb1.append(banana1);
        sb1.append(banana2);
        sb1.append(banana3);
        sb1.append(banana4);
        String banana7 = sb1.toString();
        System.out.println(banana7+"----> banana7 by StringBuilder");


        //link programming
        StringBuffer sb2 = new StringBuffer();
        sb2.append(banana1).append(banana2).append(banana3).append(banana4);
        String banana8 = sb2.toString();
        System.out.println(banana8+"----> banana8 by StringBuffer link");

        StringBuilder sb3 = new StringBuilder();
        sb3.append(banana1).append(banana2).append(banana3).append(banana4);
        String banana9 = sb3.toString();
        System.out.println(banana9+"----> banana9 by StringBuffer link");


	}

}
