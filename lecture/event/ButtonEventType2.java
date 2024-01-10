import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
 
//패널을 상속받아야해서 프레임은 메인에서 선언한 것!
class ButtonEventType2 extends JPanel implements ActionListener{ //extends JPanel = 패널을 만들면서, 여기다가 프레임을 또 두면 문제가 될 수 있음.
	boolean flag = false;
	private int light_num = 0;

	public ButtonEventType2() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);

	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100,100,100,100);
		g.drawOval(100,200,100,100);
		g.drawOval(100,300,100,100);
		if (light_num == 0){
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		} else if (light_num == 1){
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		} else {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);
		}
	}
	public void actionPerformed(ActionEvent e){
		if (++light_num >= 3){ // light_num을 1씩 증가시키는데 이때 3 이상이 되면 다시 0으로 초기화 (0,1,2)값만 가짐 <mod연산>
			light_num = 0;
		}
		repaint();
	}
}

