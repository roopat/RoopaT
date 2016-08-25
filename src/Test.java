
public class Test {
	
		public static void FirstTest()
		{
		/* This is from 
		 * https://courses.cs.washington.edu/courses/cse142/13su/lectures/06-26/slides/02-ch01-2-methods-expressions.pdf
		 * */
		System.out.println("This is my first test result\n");
		//first assignment
		System.out.println("/" + "\\" + "\t//" + "\\\\" + "\t///" + "\\\\\\\n");
		//second assignment
		System.out.println("This quote is from \n "+"Irish poet Oscar Wilde:\n"+"\"Music makes one feel so romantic \n"+
"- at least it always gets on one's nerves – \n"+"Which is the same thing nowadays.\"\n ");
		//third assignment
		System.out.println("A \"quoted\" String is \n"+"'much' better if you learn \n"+"the rules of \"escape sequences.\"\n");
		System.out.println("Also, \"\" represents an empty String.\n" + "Don't forget: use \\\" instead of \" !\n" + "\'\' is not the same as \"");
		}
public static void main(String arg[])
{
	FirstTest();
}
}