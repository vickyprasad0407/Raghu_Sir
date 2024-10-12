
public class MainRunner2 {
	static class MyComparable implements Comparable
	{
		public int compareTo(Object obj)
		{
			System.out.println(obj.hashCode());
			return this.hashCode()-obj.hashCode();
		}
	}

	public static void main(String[] args) {
		Comparable com=new MyComparable();
		System.out.println(com.hashCode());
		System.out.println(com.compareTo("vicky"));

	}

}
