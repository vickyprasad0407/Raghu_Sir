//Define a method to return biggest ,smnallest and sum of element of the matrix
import java.util.Scanner;
public class Matrix 
{
   int [][] readMatrix()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the order");
	   int row=sc.nextInt();
	   int col=sc.nextInt();
	   int [][] mat=new int [row][col];
	   System.out.println("Enter the "+row*col+" elements row wise");
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat[i].length;j++)
		   {
			   mat [i][j]=sc.nextInt();
		   }
		  
	   }
	
	   return mat;
   }
   void displayMatrix(int mat [][])
   {
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0; j<mat [i].length;j++)
		   {
			   System.out.print(mat[i][j]+" ");
		   }
		   System.out.println();
	   }
   }
   int getBiggest (int mat [][])
   {
	   int big=mat [0][0];
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat[i].length ;j++)
		   {
			   if (mat [i][j]>big)
				   big=mat [i][j];
		   }
	   }
	   return big;
   }
   int getSmallest (int mat [][])
   {
	   int small=mat [0][0];
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat[i].length ;j++)
		   {
			   if (mat [i][j]<small)
				   small=mat [i][j];
		   }
	   }
	   return small;
   }
   int sumOfMatrix(int mat [][])
   {
	   int sum=0;
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat[i].length ;j++)
		   {
			   sum=sum+mat [i][j];
		   }
	   }
	   return sum;
   }
   int countPrime(int [][] mat)
   {
	   int count=0;
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat [i].length;j++)
		   {
			   boolean rs=isPrime(mat [i][j]);
			   if (rs)
				   count++;
		   }
	   }
	   return count;
   }
   private boolean isPrime(int x)
   {
	   for (int i=2;i<=x/2;i++)
	   {
		   if (x%i==0)
			   return false;
	   }
	   return true;
   }
   int [] countEvenOdd(int mat [][])
   {
	   int ev=0,od=0;
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat [i].length;j++)
		   {
			   if(mat [i][j]%2==0)
				   ev++;
			   else 
				   od++;
		   }
	   }
	   int [] count= {ev,od};
	   return count;
   }
   int countPerfect(int [][] mat)
   {
	   int count=0;
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat [i].length;j++)
		   {
			   boolean rs=isPerfect(mat [i][j]);
			   if (rs)
				   count++;
		   }
	   }
	   return count;
   }
   boolean isPerfect(int x)
   {
	   int sum=0,temp=x;
	   for (int i=1;i<=x/2;i++)
	   {
		   if (x%i==0)
			   sum=sum+i;
			   
	   }
	   return sum==temp;
   }
   int countHappy(int [][] mat)
   {
	   int count=0;
	   for (int i=0;i<mat.length;i++)
	   {
		   for (int j=0;j<mat [i].length;j++)
		   {
			   boolean rs=isHappy(mat [i][j]);
			   if (rs)
				   count++;
		   } 
	   }
	   return count;
   }
   boolean isHappy(int n)
   {
	   while (n>9)
	   {
		   int sum=0;
		   do 
		   {
			  int d=n%10;
			  sum=sum+d*d;
			  n=n/10;
		   }while(n!=0);
		   n=sum;
	   }
	   return n==1||n==7;
   }
  int [][] addMatrix(int [][] x,int [][] y)
  {
	  if (x.length!=y.length || x[0].length!=y[0].length)
	  {
		  System.out.println("Order must be same");
		  return null;
	  }
	  int [][] z=new int [x.length][x[0].length];
	  for (int i=0;i<z.length;i++)
	  {
		  for (int j=0;j<z[0].length;j++)
		  {
			  z[i][j]=x[i][j]+y[i][j];
		  }
	  }
	  return z;
	  
  }
  int [][] getTranspose(int [][] mat)
  {
	  int [][] tr=new int [mat[0].length][mat.length];
	  for (int i=0;i<mat.length;i++)
	  {
		  for (int j=0;j<mat[i].length;j++)
		  {
			  tr [j][i]=mat[i][j];
		  }
	  }
	  return tr;
  }
  int [] rowWiseBiggest(int mat [][])
  {
	  int big [] =new int [mat.length];
	  for (int i=0;i<mat.length;i++)
	  {
		  int bg=mat [i][0];
		  for (int j = 0; j < mat[i].length; j++)
		  {
			 if (mat[i][j]>bg)
			 {
			    bg=mat [i][j];	
			 }
		  }
		  big[i]=bg;
	  }
	  return big;
  }
  int [] columnWiseBiggest (int mat [][])
  {
	  int big []=new int [mat[0].length];
	  for (int i = 0; i < mat[0].length; i++)
	  {
		  int bg=mat [0][i];
		 for (int j = 1; j < mat.length; j++)
		 {
		    	if (mat[j][i]>bg)
		    	{
					bg=mat [j][i];
				}
		 }
		 big [i]=bg;
	  }
	  return big;
  }
  int [][] rowWiseReverse (int mat [][])
  {
	  for (int i = 0; i < mat.length; i++)
	  {
		 for (int j = 0; j < mat[0].length/2; j++)
		 {
		    int temp=mat [i][j];	
		    mat [i][j]=mat [i][mat[0].length-1-j];
		    mat [i][mat[0].length-1-j]=temp;  
		 }
	  }
	  return mat;
  }
  int [][] columnWiseReverse (int mat [][])
  {
	  for (int i = 0; i < mat.length/2; i++)
	  {
		 for (int j = 0; j < mat[i].length; j++)
		 {
			
		    int temp=mat [i][j];	
		    
		    mat [i][j]=mat [mat.length-1-i][j];
		    
		    mat [mat.length-1-i][j]=temp;  
		    
		 }
          }
  return mat;
  }
  int [][] rotate90Left (int [][] mat)
  {
	 mat=getTranspose(mat);
	 columnWiseReverse(mat);
	 return mat;
	  
  }
  int [][] rotate90Right (int [][] mat)
  {
	 mat=getTranspose(mat);
	 rowWiseReverse(mat);
	 return mat;
	  
  }
  void diagonalWiseReverse(int [][]mat)
  {
	  for (int i = 0; i < mat.length/2; i++)
	  {
		int temp=mat [i][i];
		mat [i][i]=mat [mat.length-1-i][mat.length-1-i];
		mat [mat.length-1-i][mat.length-1-i]=temp;
		temp=mat[i][mat.length-1-i];
		mat[i][mat.length-1-i]=mat[mat.length-1-i][i];
		mat [mat.length-1-i][i]=temp;
	  }
  }
  int [] diagonalWiseBiggest(int [][] mat)
  {
	  int pBig=mat[0][0],sBig=mat[0][mat.length-1];
	  for (int i = 0; i < mat.length; i++)
	  {
		if (mat[i][i]>pBig)
		{
		   pBig=mat[i][i];	
		}
		if (mat[i][mat.length-1-i]>sBig)
		{
		   sBig=mat [i][mat.length-1-i];	
		}
		
	  }
	  int [] big= {pBig,sBig};
		return big;
  }
}
