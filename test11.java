
public class test11 {
	public static void main(String[] args) { 
    	System.out.println("�ʪ���" + Animal7.getNumber() + "��");
    	System.out.println("--------------------");
        Elephant puppy1 = new Elephant("�j�H", 6, 70); 
        puppy1.speak(); 
        System.out.println("--------------------");   
        Elephant puppy2 = new Elephant(10, 142); 
        puppy2.speak(); 
        System.out.println("--------------------");   
        Elephant puppy3 = new Elephant(); 
        puppy3.speak(); 
        System.out.println("--------------------");
        Elk deer4 = new Elk("BEER", 170, 80, 170.5, 8);
        deer4.speak();
        System.out.println("--------------------");
        System.out.println("�ʪ���" + Animal7.getNumber() + "��");
    } 
}
