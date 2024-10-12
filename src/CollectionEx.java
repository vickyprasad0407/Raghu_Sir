import java.util.Scanner;
import java.util.ArrayList;
public class CollectionEx
{

	public static void main(String[] args) 
	{
		ArrayList<Double> avgs=new ArrayList<Double>();
		Scanner sc=new Scanner (System.in);
		while (true)
		{
			System.out.println("Enter the average");
			double avg=sc.nextDouble();
			avgs.add(avg);
			System.out.println("Do you have more value");
			String res=sc.next();
			if (res.equalsIgnoreCase("no"))
			  break;
		}
		System.out.println("entered values : ");
		System.out.println(avgs);
		avgs.add(3,45.67);
		Object ar[] =avgs.toArray();
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
