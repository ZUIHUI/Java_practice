import java.util.*;
public class BMI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in=new Scanner(System.in);
		System.out.print("請輸入姓名:");
		String name=in.nextLine();
		System.out.print("請輸入身高(公分):");
		double hei=in.nextDouble();
		System.out.print("請輸入體重(公斤):");
		double wei=in.nextDouble();
		
		in.close();
		
		Person p1= new Person(name,hei,wei);			
		p1.getname();
		p1.BMI();
		System.out.print(p1.getname()+"的BMI值:"+p1.BMI());
	}
}
