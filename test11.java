
public class test11 {
	public static void main(String[] args) { 
    	System.out.println("動物有" + Animal7.getNumber() + "隻");
    	System.out.println("--------------------");
        Elephant puppy1 = new Elephant("大象", 6, 70); 
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
        System.out.println("動物有" + Animal7.getNumber() + "隻");
    } 
}
