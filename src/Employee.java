
public class Employee {
int eid;
String ename;
double esal;
	public Employee(int eid,String ename,double esal)
	{
	     this.eid=eid;
	     this.ename=ename;
	     this.esal=esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
