import java.util.Scanner;

//wajp to get the fibonacci no
public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0;
		if (n==1)
			System.out.println(0);
		if(n==2)
			System.out.println(1);
		for (int i=2;i<n;i++)
		{
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
		}
		System.out.println(n3);
	}

}
