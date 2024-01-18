import java.awt.*;
import java.awt.event.*;

public class ItemEventCheck extends Frame implements ItemListener, ActionListener{ // implements 뒤에는 여러 개가 올 수 있다!
	Frame f;
	Checkbox one, two;
	Checkbox male, female;
	CheckboxGroup cbg;
	Button exit;

	public ItemEventCheck(String msg) {
		f =  new Frame(msg); //프레임 생성
		
		Panel top = new Panel();
		top.add(one = new Checkbox("One")); //CheckBox(X) => Checkbox(O)
		top.add(two = new Checkbox("Two"));
		one.addItemListener(this);
		two.addItemListener(this);

		Panel bottom = new Panel();
		cbg = new CheckboxGroup();
		bottom.add(male = new Checkbox("male", cbg, true));
		bottom.add(female = new Checkbox("female", cbg, true));
		male.addItemListener(this);
		female.addItemListener(this);

		exit = new Button("Exit");
		exit.addActionListener(this);

		f.add("North", top);
		f.add("South", bottom);
		f.add("East", exit);

		f.setVisible(true);
		f.setSize(300,200);
	}

	public void actionPerformed(ActionEvent e) {
		f.setVisible(false);
		f.dispose();
		System.exit(0);
	}

	public void itemStateChanged(ItemEvent e) {
		Object o = e.getSource();

		if (o == one)		{
			System.out.println(e.getItem()); // when o is one, just use getItem() (whether it is selected or deselected.)
		} 
		else if (o == two) {	// when o is two, perform differnt actions based on whether it is selected or deselected.
			if (e.getStateChange() == ItemEvent.SELECTED) { // using (getStateChange() method and ItemEvent.SELECTED)
				System.out.println("two is selected");
			} else	{
				System.out.println("two is deselected");
			}
		} 
		else if(o == male) { // CheckboxGroup cannot be deselected. (similarly to radio buttons)
			System.out.println("male - selected");
		} 
		else if(o == female) {
			System.out.println("female - selected");
		}
	}
}

public class ItemEventCheckMain
{
	public static void main(String[] args) {
		new ItemEventCheck("아이템 이벤트 리스너 활용");
	}
}
