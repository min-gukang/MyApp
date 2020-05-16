import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kr1.classes.User1;
import kr1.classes.User2;
import kr1.classes.reset;

public class smartAutoCarGUI {
	public void initGUI() {
	JFrame smartOption = new JFrame("Auto smart Option");
	smartOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = smartOption.getContentPane();
	
	JPanel pan1 = new JPanel();
	JButton User1 = new JButton("엄마");
	User1.addActionListener(new User1());
	JButton User2 = new JButton("나");
	User2.addActionListener(new User2());
	pan1.add(User1);
	pan1.add(User2);
	
	JPanel pan2 = new JPanel();
	JButton reset = new JButton("초기화");
	reset.addActionListener(new reset());
	pan2.add(reset);
	
	c.add(BorderLayout.CENTER, pan1);
	c.add(BorderLayout.SOUTH, pan2);
	
	// 프레임을 화면 가운데에 배치
	smartOption.setLocationRelativeTo(null);
	
	smartOption.setSize(300,150);
	smartOption.setVisible(true);
	}
	public static void main(String[] args) {
		new smartAutoCarGUI().initGUI();
		}
}

