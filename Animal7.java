
class Animal7 {
	private int age; 
    private int weight; 
      
    private static int number = 0; 
    
    public Animal7(int a, int w) { 
        number++;
    	setAge(a); 
        setWeight(w); 
        System.out.println("使用兩個參數的建構子，Animal物件已建立...."); 
    } 
      
    public Animal7(int w) { 
        this(3, w);      
    } 
  
    public Animal7() { 
        this(3, 15); 
    } 
      
      
    public int getAge() { 
        return age; 
    } 
  
    public void setAge(int n) { 
        if (n < 0) { 
            age = 1; 
        } 
        else { 
            age = n; 
        } 
    } 
      
    public int getWeight() { 
        return weight; 
    } 
      
    public void setWeight(int n) { 
        if (n < 0) { 
            weight = 1; 
        } 
        else { 
            weight = n; 
        } 
    } 
      
    public void speak() { 
        System.out.println("哈囉，我已經" + getAge() + "歲，有" + getWeight() + "公斤重"); 
    } 
    public static int getNumber() { 
        return number; 
    } 
} 
