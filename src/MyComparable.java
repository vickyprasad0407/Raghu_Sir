
public class MyComparable implements Comparable
{

	@Override
	public int compareTo(Object o)
	{
		//System.out.println(o.hashCode());
		return this.hashCode()-o.hashCode();
	}

}
