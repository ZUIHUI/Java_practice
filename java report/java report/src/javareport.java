import java.awt.*;     	//�פJ�����B�z�M������O
import javax.swing.*;	//�פJ�i�������B�z�M������O
import java.awt.event.*;
import java.util.*;		//�פJjava.util���Ҧ��M��

public class javareport extends JFrame implements ActionListener,MouseMotionListener,MouseListener
//�ϥ�extends���~��JFrame�����O�èϥ�implements�ӹ�{����
	{
		Container c;
		//�]�wUI����
		JButton bot,bot1;
		JLabel lab1,lab2;
		//�]�w�@�Ϊ��ܼƻP���O
		//mt�ɶ�,ms����
		java.util.Random rg;
		int x1,y1,x2,y2,mode,ms;
		double mt;
		javax.swing.Timer t;
		public javareport() //�غc��
		{
			//��l�Ʀ@���ܼ�
			x1=200;x2=400;
			y1=200;y2=200;mode=0;
			rg=new Random();
			c=getContentPane();//���oContentPane
			//�]�w�����]�w
			c.setLayout(new FlowLayout());
			//��l��UI����
			bot=new JButton("�}�l");
			bot1=new JButton("���s");
			lab1=new JLabel("�ѤU:60��");
			lab2=new JLabel("���Z:0");

			//�NUI����[�JContentPane
			c.add(lab1);c.add(bot);c.add(bot1);c.add(lab2);
			//�]�wUI����P�ƹ����ƥ�Ĳ�o��ť��
			bot.addActionListener(this);
			bot1.addActionListener(this);
			addMouseMotionListener(this);
			addMouseListener(this);
			t=new javax.swing.Timer(500,this);
			setSize(640,480);//�]�wsize�A��ܥX�h
			setVisible(true);
		}
public void paint(Graphics g)
{
	//�e�X����
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
//UI����ƥ�B�z���O
public void actionPerformed(ActionEvent e)
{
	if (e.getSource()==bot)		//���U�}�l�����
	{
		mt=60;
		ms=0;
		t.start();
	}
	else if (e.getSource()==t)	
	{
		mt=mt-0.5;				//�]�w�ɶ��p��
		mode=rg.nextInt(2)+1;	//�ϧΥH�ü��H���X�{
		lab1.setText("�ѤU:"+mt+"��");//��ܮɶ�
		if(mt==0) {
			mt=60;
		}
		repaint();
	}
	if (e.getSource()==bot1) {
		mt=60;
		t.restart();			//���s�p��
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
		if ((x1-mx)*(x1-mx)+(y1-my)*(y1-my)<2500)	//�P�w�O�_�I������
		{
			ms=ms+1;								//�p�⦨�Z
			lab2.setText("���Z:"+ms);
			mode=0;
			repaint();
		}
	}
	else if (mode==2)
	{
		if ((x2-mx)*(x2-mx)+(y2-my)*(y2-my)<2500)	//�P�w�O�_�I������
		{
			ms=ms+1;								//�p�⦨�Z
			lab2.setText("���Z:"+ms);
			mode=0;
			repaint();
		}
	}
}
public void mouseReleased(MouseEvent e){ };
public void mouseClicked(MouseEvent e){ };


/***�D�{��***/
public static void main(String args[]) //�{���_�I
{
	javareport app=new javareport(); //�Ұ�UI����
	app.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)//�B�z���������n�D
		{
			System.exit(0);
		}	
	}); 
}
}