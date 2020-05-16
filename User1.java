package kr1.classes;

//import kr1.classes.carDB;
import kr1.classes.reset;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class User1 implements ActionListener {
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//(수정)초기화값이 저장된 database에 값이 없다면 기존값 실행구문 만들자. 
		System.out.println("mom's seat height : 30");
		System.out.println("mom's forback : 50");
		System.out.println("mp3 PlayList : 남진 playlist On");
		
		//carDB db = new carDB();
//		//만약 초기화 클래스에서 값이 재설정 된다면.. 
//		reset re = new reset();
//		System.out.println("mom's seat height :"+re.getHeight1());
//		System.out.println("mom's forback :"+re.getforBack1());
//		System.out.println("mp3 Option :"+re.Mp3());
		
	}
}
