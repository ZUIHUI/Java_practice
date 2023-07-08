import java.awt.*;     	//匯入視窗處理套件及類別
import javax.swing.*;	//匯入進階視窗處理套件及類別
import java.awt.event.*;
import java.util.*;		//匯入java.util的所有套件

public class javareport extends JFrame implements ActionListener,MouseMotionListener,MouseListener
//使用extends來繼承JFrame父類別並使用implements來實現介面
	{
		Container c;
		//設定UI元件
		JButton bot,bot1;
		JLabel lab1,lab2;
		//設定共用的變數與類別
		//mt時間,ms分數
		java.util.Random rg;
		int x1,y1,x2,y2,mode,ms;
		double mt;
		javax.swing.Timer t;
		public javareport() //建構元
		{
			//初始化共用變數
			x1=200;x2=400;
			y1=200;y2=200;mode=0;
			rg=new Random();
			c=getContentPane();//取得ContentPane
			//設定版面設定
			c.setLayout(new FlowLayout());
			//初始化UI元件
			bot=new JButton("開始");
			bot1=new JButton("重新");
			lab1=new JLabel("剩下:60秒");
			lab2=new JLabel("成績:0");

			//將UI元件加入ContentPane
			c.add(lab1);c.add(bot);c.add(bot1);c.add(lab2);
			//設定UI元件與滑鼠的事件觸發傾聽者
			bot.addActionListener(this);
			bot1.addActionListener(this);
			addMouseMotionListener(this);
			addMouseListener(this);
			t=new javax.swing.Timer(500,this);
			setSize(640,480);//設定size，顯示出去
			setVisible(true);
		}
public void paint(Graphics g)
{
	//畫出元件
	super.paint(g);
	g.drawOval(x1-50,y1-50,50,50);
	g.drawOval(x2-50,y2-50,50,50);
	
	if(mode==1)
		g.fillOval(x1-50,y1-50,50,50);
	else
		g.drawOval(x1-50,y1-50,50,50);
	if(mode==2)
		g.fillOval(x2-50,y2-50,50,50);
	else
		g.drawOval(x2-50,y2-50,50,50);
}
public void mouseDragged(MouseEvent xxx) { };
public void mouseMoved(MouseEvent e){ };
//UI元件事件處理類別
public void actionPerformed(ActionEvent e)
{
	if (e.getSource()==bot)		//按下開始後執行
	{
		mt=60;
		ms=0;
		t.start();
	}
	else if (e.getSource()==t)	
	{
		mt=mt-0.5;				//設定時間計數
		mode=rg.nextInt(2)+1;	//圖形以亂數隨機出現
		lab1.setText("剩下:"+mt+"秒");//顯示時間
		if(mt==0) {
			mt=60;
		}
		repaint();
	}
	if (e.getSource()==bot1) {
		mt=60;
		t.restart();			//重新計數
	}
}
public void mouseEntered(MouseEvent e){ };
public void mouseExited(MouseEvent e){ };
public void mousePressed(MouseEvent e)
{
	int mx,my;
	mx=e.getX();my=e.getY();
	if (mode==1)
	{
		if ((x1-mx)*(x1-mx)+(y1-my)*(y1-my)<2500)	//判定是否點擊到圓圈
		{
			ms=ms+1;								//計算成績
			lab2.setText("成績:"+ms);
			mode=0;
			repaint();
		}
	}
	else if (mode==2)
	{
		if ((x2-mx)*(x2-mx)+(y2-my)*(y2-my)<2500)	//判定是否點擊到圓圈
		{
			ms=ms+1;								//計算成績
			lab2.setText("成績:"+ms);
			mode=0;
			repaint();
		}
	}
}
public void mouseReleased(MouseEvent e){ };
public void mouseClicked(MouseEvent e){ };


/***主程式***/
public static void main(String args[]) //程式起點
{
	javareport app=new javareport(); //啟動UI元件
	app.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)//處理視窗關閉要求
		{
			System.exit(0);
		}	
	}); 
}
}