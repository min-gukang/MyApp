package kr1.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class reset implements ActionListener {
	
			//�ʱ�ȭ �Ἥ �ٽ� ����ġ��
			String User1 = "����";
			String User2 = "��";
			String height1, height2;
			String forback1, forback2;
			String playList1, playList2;
			String[] musicPlayList = {"�����������", "��Ŵ", "Itzy", "�۰���", "����", "BTS", "��ź�ҳ��", "������ũ", "������", "ġ��"};
			boolean reUser1 = false;
			boolean reUser2 = false;
			boolean MusicKey1 = false;
			boolean MusicKey2 = false;
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		//�� ����̺��� �ʱ�ȭ
		String UserChoice = JOptionPane.showInputDialog("�ʱ�ȭ�� ����� �Է����ּ���");
		if(UserChoice.equals(User1)) {
			String inputPw = JOptionPane.showInputDialog("��й�ȣ�� �Է����ּ���");
			String pw = "9415";
			if(inputPw.equals(pw)) {
			System.out.println("mom's seat height : 0cm");
			System.out.println("mom's seat forback : 0cm");
			System.out.println("MP3 Option : Playlist choice ");
			reUser1 = true;}
//			} else {
//			System.out.println("�Է��� ����� ���ų� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �õ����ּ���.");
//			}
		}
			//���� ����̺��� �ʱ�ȭ
		else if(UserChoice.equals(User2)) {
			String inputPw2 = JOptionPane.showInputDialog("��й�ȣ�� �Է����ּ���");
			String pw2 = "7985";
			if(inputPw2.equals(pw2)) {
			System.out.println("son's height : 0cm");
			System.out.println("son's forback : 0cm");
			System.out.println("MP3 Option : Playlist choice ");
			reUser2 = true;}
//			} else {
//			System.out.println("�Է��� ����� ���ų� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �õ����ּ���.");
//			}
		}
		System.out.println("==========================");
		
			//�� �ɼ� ����
		if(reUser1) {
			String inputHeight = JOptionPane.showInputDialog("seat ���̸� �������ּ���[�����Է�]\n ����)50");
			height1 = inputHeight;
			
			String inputForBack = JOptionPane.showInputDialog("seat �յ� ������ �������ּ���[�����Է�]\n ����)50");
			forback1 = inputForBack;
			
			System.out.println("mom's height :"+height1);
			System.out.println("mom's seatForback :" +inputForBack);
			
			playList1 = JOptionPane.showInputDialog("������ �Է����ּ���[�ѱ� �Ǵ� �����Է�]\n ����)BTS or ��ź�ҳ��");
			for(int i=0; i<musicPlayList.length; i++) {
				if(playList1.equals(musicPlayList[i])) {
					System.out.println("Your PlayList :"+musicPlayList[i]);
				}
			}
			
		}
			//���� �ɼ� ����
		else if(reUser2) {
			String inputHeight2 = JOptionPane.showInputDialog("seat ���̸� �������ּ���[�����Է�]\n ����)50");
			height2 = inputHeight2;
			
			String inputForBack2 = JOptionPane.showInputDialog("seat �յ� ������ �������ּ���[�����Է�]\n ����)50");
			forback2 = inputForBack2;
			
			System.out.println("mom's height :"+height2);
			System.out.println("mom's seatForback :" +inputForBack2);
			
			playList2 = JOptionPane.showInputDialog("������ �Է����ּ���[�ѱ� �Ǵ� �����Է�]\n ����)BTS or ��ź�ҳ��");
			for(int i=0; i<musicPlayList.length; i++) {
				if(playList2.equals(musicPlayList[i])) {
					System.out.println("Your PlayList :"+musicPlayList[i]);
				} 
			}
		
		}
	}
	public String getHeight1() {
		return height1;
	}
	public String getforBack1() {
		return forback1;
	}
	public String Mp3() {
		return playList1;
	}
  }


	

