
class Elk extends Animal7{
	private String name;
	private double antlers_cm;
	private int antlers_y;
	public Elk(String n, int a, int w, double antlers,int y) { 
        super(a, w);
        setName(n);
        setAntlers(antlers);
        setAntlerss(y);
        System.out.println("使用四個參數的建構子，Elk物件已建立...."); 
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
            name = "無名氏"; 
        } 
        else { 
            name = n; 
        } 
    } 
      
    public void speak() { 
        super.speak(); 
        System.out.println("我的名字是" + getName()+"，角的長度是"+ getAntlers()+"cm"+"，有"+getAntlerss()+"個岔"); 
    } 
} 
