import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.Font;

class ButtonEventType3 extends JPanel implements ActionListener{ //extends JPanel = 패널을 만들면서, 여기다가 프레임을 또 두면 문제가 될 수 있음.
	double A, B, C;
	JButton[][] buttons = new JButton[3][3];
	char[][] board = new char[3][3];
	private char turn = 'X';

	public ButtonEventType3() {
		setLayout(new GridLayout(3,3,5,5));
		Font f = new Font("Dialog", Font.ITALIC, 50);

		for (int i=0; i<3; i++)	{
			for (int j=0; j<3; j++)	{
				buttons[i][j] = new JButton(" "); //버튼 array
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this); //모든 버튼에 대해 addListener하나면 됨!
				add(buttons[i][j]); 
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e){
		for (int i=0; i<3; i++)	{
			for (int j=0; j<3; j++)	{
				if (e.getSource()==buttons[i][j] &&
					buttons[i][j].getText().equals(" ")==true) {
					if (turn == 'X'){
						buttons[i][j].setText("X");
						turn ='O';
					} 
					else {
						buttons[i][j].setText("O");
						turn ='X';
					}
				}
			}
		}
	}
}
