
public class Test {
	
		int a;
		
  Test(int a) {
		// TODO Auto-generated method stub
		this.a=a;
	}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + a;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Test other = (Test) obj;
	if (a != other.a)
		return false;
	return true;
}
public static void main(String args[])
{ 
	Test a=new Test(2);
	Test b=new Test(2);
	System.out.println(a==b);
	System.out.println(a.equals(b));
}
}
