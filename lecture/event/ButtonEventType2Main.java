import javax.swing.JFrame;

public class ButtonEventType2Main
{
	JFrame f;

	public ButtonEventType2Main(String msg){ //메인에서 프레임을 만들고 시작?!
		f = new JFrame();
		f.add(new ButtonEventType2()); // 프레임에다가 패널을 부른다! ButtonType2=panel
		//패널을 상속받기 위해 프레임은 메인에서 선언함 : 메인에서 프레임을 만들고 패널을 붙임!eventtype2를 부름으로써
		f.setSize(300,500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEventType2Main("버튼 이벤트 프로그래밍");
	}
}
