package kr1.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class User2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//(수정)초기화값이 저장된 database에 값이 없다면 기존값 실행구문 만들자. 
		System.out.println("kmgu88's height : 50cm");
		System.out.println("kmgu88's forback : 70cm");
		System.out.println("mp3 Option : Acoustic Playlist ON");
		
		
	}

}
