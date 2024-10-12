import java.util.Scanner;
public class MainDate 
{

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first date");
	    int d1=sc.nextInt();
	    int m1=sc.nextInt();
	    int y1=sc.nextInt();
	    System.out.println("Enter the second date");
	    int d2=sc.nextInt();
	    int m2=sc.nextInt();
	    int y2=sc.nextInt();
	    Date dt1=new Date (d1,m1,y1);
	    Date dt2=new Date (d2,m2,y2);
	    System.out.println("First date is : "+dt1);
	    System.out.println("Second daye is : "+dt2);
	    int x=dt1.noOfDays();
	    int y=dt2.noOfDays();
	    System.out.println("no od days in"+dt1+" is"+x);
	    System.out.println("no of days in "+dt2+" is"+y );
	    System.out.println("the no od days between "+dt1+" and "+dt2+" is: "+(y-x));
	    System.out.println(dt1+" day name is "+dt1.getDayName());
	    System.out.println(dt2+" day name is "+dt2.getDayName());

	}

}
