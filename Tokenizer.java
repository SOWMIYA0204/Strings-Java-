package startproject;
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String [] args)
	{
		String s="SOMWIYA SOFTWARE DEVELOPER IN A MNC";
		String a="Mmy Mmom Mand MDad Mis Mmy Mworld,MI Mcan Mdo Manything ";
		String lif="I ,AM ,HARDWORKER ,RESPONSIBILITY ,GOAL ,ORIENTED ,PERSON ";
		String clg="In_MY_COLLEGE_I_FOUND_BEST_FRIENDS";
		StringTokenizer str=new StringTokenizer(s);
		StringTokenizer str1=new StringTokenizer(a,"M");
		StringTokenizer str2=new StringTokenizer(lif,",");
		StringTokenizer str3=new StringTokenizer(clg,"_");
//		str.hasMoreTokens();
//		System.out.println(str.nextToken());
//		str.hasMoreTokens();
//		System.out.println(str.nextToken());
//		str.hasMoreTokens();
//		System.out.println(str.nextToken());
		while(str.hasMoreTokens())
		{
			System.out.print(str.nextToken());
		}
		System.out.println();
		while(str1.hasMoreTokens())
		{
			System.out.print(str1.nextToken());
		}
		System.out.println();
		while(str2.hasMoreTokens())
		{
			System.out.print(str2.nextToken());
		}
		System.out.println();
		while(str3.hasMoreTokens())
		{
			System.out.print(str3.nextToken());
		}
		System.out.println();
		System.out.println(clg);
		System.out.println(lif);
	}
}
