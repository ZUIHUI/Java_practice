import java.util.*;
public class BMI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in=new Scanner(System.in);
		System.out.print("�п�J�m�W:");
		String name=in.nextLine();
		System.out.print("�п�J����(����):");
		double hei=in.nextDouble();
		System.out.print("�п�J�魫(����):");
		double wei=in.nextDouble();
		
		in.close();
		
		Person p1= new Person(name,hei,wei);			
		p1.getname();
		p1.BMI();
		System.out.print(p1.getname()+"��BMI��:"+p1.BMI());
	}
}
