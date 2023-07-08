
public class Person {	
	
	protected String n;
	private double h;
	private double w;
    public double BMI;
	public Person() {n=" ";h=0;w=0;};
	public String getname() {
		return n;
	}
	public double getheight() {
		return h;
	}
	public double getweight() {
		return w;
	}
	public Person(String  n,double  h,double  w) {
		this.n=n;
		this.h=h;
		this.w=w;
	}
    public double BMI() {
		BMI=w/((h/100)*(h/100));
		return BMI;
    }
}
