
class Elk extends Animal7{
	private String name;
	private double antlers_cm;
	private int antlers_y;
	public Elk(String n, int a, int w, double antlers,int y) { 
        super(a, w);
        setName(n);
        setAntlers(antlers);
        setAntlerss(y);
        System.out.println("�ϥΥ|�ӰѼƪ��غc�l�AElk����w�إ�...."); 
    } 
      
	public void setAntlers(double antlers){
		antlers_cm = antlers;
	}
	
	public double getAntlers(){
	    return antlers_cm;
	}
	public void setAntlerss(int y){
		antlers_y = y;
	}
	
	public int getAntlerss(){
	    return antlers_y;
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
        System.out.println("�ڪ��W�r�O" + getName()+"�A�������׬O"+ getAntlers()+"cm"+"�A��"+getAntlerss()+"�ӧ�"); 
    } 
} 
