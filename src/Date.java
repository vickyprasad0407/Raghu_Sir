
public class Date 
{
	int  dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dname []= {"sunday","monday","tuesday","wednesday","Thursday","Friday","Saturday"};

	public Date(int dd,int mm,int yy) 
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if (yy%4==0 ||yy%400==0 &&yy%100!=0)
			month [2]=29;
	}
	public int noOfDays()
	{
		int y=yy-1;
		int sum=dd;
		for (int i=1;i<mm;i++)
		{
			sum=sum+month [i];
		}
		sum=sum+y*365;
		sum=sum+y/4-y/100+y/400;
		return sum;
	}
	public String getDayName()
	{
		int ds=noOfDays();
		return dname [ds%7];
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}

}
