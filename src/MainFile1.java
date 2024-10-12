import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFile1 {

	public static void main(String[] args) {
   FileInputStream fin=null;
   try
   {
	   fin=new FileInputStream("C:\\Users\\Mr. Santosh\\Desktop\\htmlcode2.html");
	   int bt=0;
	   while ((bt=fin.read())!=-1)
	   {
		   System.out.print((char)bt);
	    }
	   System.out.println("thank you");
   }
   catch (FileNotFoundException e) 
   {
       System.out.println("File is not present in your system");                                 
   }
   catch (IOException e)
   {
       System.out.println("we cant read this file");       
   }
   finally
   {
	   try
	   {
	   fin.close();
	   }
	   catch (IOException e)
	   {
         System.out.println("unable to close");
	   }
   }
	}

}
