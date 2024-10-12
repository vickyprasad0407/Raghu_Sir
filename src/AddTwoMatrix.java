
public class AddTwoMatrix 
{

	public static void main(String[] args)
	{
		Matrix mt=new Matrix ();
		System.out.println("Enter the first matrix");
		int [][] a=mt.readMatrix();
		System.out.println("Enter the second matrix");
		int [][] b=mt.readMatrix();
		System.out.println("User enter first matrix");
		mt.displayMatrix(a);
		System.out.println("User entered second matrix");
		mt.displayMatrix(b);
		int c[][]=mt.addMatrix(a,b);
		if (c==null)
			System.out.println("Addition failed");
		else
		{
			System.out.println("added matrix");
			mt.displayMatrix(c);
		}
		

	}

}
