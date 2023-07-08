
class Elephant extends Animal7 { 
    private String name; 
      
    public Elephant(String n, int a, int w) { 
        super(a, w);
        setName(n); 
        System.out.println("�ϥΤT�ӰѼƪ��غc�l�AElephant����w�إ�...."); 
    } 
      
    public Elephant(int a, int w) { 
        this("�p�H", a, w); 
    } 
      
    public Elephant() { 
        this("�p�H", 3, 150); 
    } 
      
    public String getName() { 
        return name; 
    } 
      
    public void setName(String n) { 
        if (n == null || n.equals("")) { 
            name = "�L�W��"; 
        } 
        else { 
            name = n; 
        } 
    } 
      
    public void speak() { 
        super.speak(); 
        System.out.println("�ڪ��W�r�O" + getName()); 
    } 
} 