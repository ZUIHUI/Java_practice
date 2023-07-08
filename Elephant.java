
class Elephant extends Animal7 { 
    private String name; 
      
    public Elephant(String n, int a, int w) { 
        super(a, w);
        setName(n); 
        System.out.println("使用三個參數的建構子，Elephant物件已建立...."); 
    } 
      
    public Elephant(int a, int w) { 
        this("小象", a, w); 
    } 
      
    public Elephant() { 
        this("小象", 3, 150); 
    } 
      
    public String getName() { 
        return name; 
    } 
      
    public void setName(String n) { 
        if (n == null || n.equals("")) { 
            name = "無名氏"; 
        } 
        else { 
            name = n; 
        } 
    } 
      
    public void speak() { 
        super.speak(); 
        System.out.println("我的名字是" + getName()); 
    } 
} 