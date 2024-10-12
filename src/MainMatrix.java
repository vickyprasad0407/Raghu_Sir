
public class MainMatrix {

	public static void main(String[] args) 
	{
		Matrix mt=new Matrix ();
		 
		int x [][]=mt.readMatrix();
		System.out.println("User entered the matrix element");
		mt.displayMatrix(x);
        System.out.println("Biggest is "+mt.getBiggest(x));
        System.out.println("Smallest is "+mt.getSmallest(x));
        System.out.println("sum of matrix element is "+mt.sumOfMatrix(x));
        System.out.println("Number of prime no is :"+mt.countPrime(x));
       int [] eo=mt.countEvenOdd(x);
        System.out.println("Number of even number is :"+eo[0]);
        System.out.println("Number of odd number is :"+eo[1]);
        System.out.println("Number of perfect number is : "+mt.countPerfect(x));
        System.out.println("Number of happy number is : "+mt.countHappy(x));
        int [][] tr=mt.getTranspose(x);
        mt.displayMatrix(tr);
        System.out.println("====================================");
        
        int rowBig []=mt.rowWiseBiggest(x);
        for (int i = 0; i < rowBig.length; i++) 
        {
		   System.out.print(rowBig [i]+" ");	
		}
        System.out.println();
        System.out.println("=====================================");
        int columnBig []=mt.columnWiseBiggest(x);
        for (int i = 0; i < columnBig.length; i++) 
        {
		   System.out.print(columnBig [i]+" ");	
		}
        System.out.println();
        System.out.println("======================================");
        mt.displayMatrix(x);
        System.out.println("=========================================");
        
        int rowReverse[][]=mt.rowWiseReverse(x);
        mt.displayMatrix(rowReverse);
        System.out.println("======================================");
        int columnReverse[][]=mt.columnWiseReverse(x);
        mt.displayMatrix(columnReverse);
        System.out.println("=======================================");
        mt.displayMatrix(x);
        System.out.println("=========================================");
       
        int [][] left=mt.rotate90Left(x);
        mt.displayMatrix(left);
        System.out.println("========================================");
        int [][] right=mt.rotate90Right(x);
        mt.displayMatrix(right);
        System.out.println("=======================================");
        mt.diagonalWiseReverse(x);
        int [] diagonalBig=mt.diagonalWiseBiggest(x);
        for (int i = 0; i < diagonalBig.length; i++) 
        {
		   System.out.print(diagonalBig [i]+" ");	
		}
        System.out.println();
	}

}
 