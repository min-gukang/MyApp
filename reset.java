package kr1.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class reset implements ActionListener {
	
			//초기화 써서 다시 뜯어고치자
			String User1 = "엄마";
			String User2 = "나";
			String height1, height2;
			String forback1, forback2;
			String playList1, playList2;
			String[] musicPlayList = {"볼빨간사춘기", "폴킴", "Itzy", "송가인", "남진", "BTS", "방탄소년단", "에이핑크", "아이유", "치즈"};
			boolean reUser1 = false;
			boolean reUser2 = false;
			boolean MusicKey1 = false;
			boolean MusicKey2 = false;
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		//나 드라이브모드 초기화
		String UserChoice = JOptionPane.showInputDialog("초기화할 대상을 입력해주세요");
		if(UserChoice.equals(User1)) {
			String inputPw = JOptionPane.showInputDialog("비밀번호를 입력해주세요");
			String pw = "9415";
			if(inputPw.equals(pw)) {
			System.out.println("mom's seat height : 0cm");
			System.out.println("mom's seat forback : 0cm");
			System.out.println("MP3 Option : Playlist choice ");
			reUser1 = true;}
//			} else {
//			System.out.println("입력한 대상이 없거나 비밀번호가 틀렸습니다. 다시 시도해주세요.");
//			}
		}
			//엄마 드라이브모드 초기화
		else if(UserChoice.equals(User2)) {
			String inputPw2 = JOptionPane.showInputDialog("비밀번호를 입력해주세요");
			String pw2 = "7985";
			if(inputPw2.equals(pw2)) {
			System.out.println("son's height : 0cm");
			System.out.println("son's forback : 0cm");
			System.out.println("MP3 Option : Playlist choice ");
			reUser2 = true;}
//			} else {
//			System.out.println("입력한 대상이 없거나 비밀번호가 틀렸습니다. 다시 시도해주세요.");
//			}
		}
		System.out.println("==========================");
		
			//내 옵션 설정
		if(reUser1) {
			String inputHeight = JOptionPane.showInputDialog("seat 높이를 조절해주세요[숫자입력]\n 예시)50");
			height1 = inputHeight;
			
			String inputForBack = JOptionPane.showInputDialog("seat 앞뒤 간격을 조절해주세요[숫자입력]\n 예시)50");
			forback1 = inputForBack;
			
			System.out.println("mom's height :"+height1);
			System.out.println("mom's seatForback :" +inputForBack);
			
			playList1 = JOptionPane.showInputDialog("음악을 입력해주세요[한글 또는 영문입력]\n 예시)BTS or 방탄소년단");
			for(int i=0; i<musicPlayList.length; i++) {
				if(playList1.equals(musicPlayList[i])) {
					System.out.println("Your PlayList :"+musicPlayList[i]);
				}
			}
			
		}
			//엄마 옵션 설정
		else if(reUser2) {
			String inputHeight2 = JOptionPane.showInputDialog("seat 높이를 조절해주세요[숫자입력]\n 예시)50");
			height2 = inputHeight2;
			
			String inputForBack2 = JOptionPane.showInputDialog("seat 앞뒤 간격을 조절해주세요[숫자입력]\n 예시)50");
			forback2 = inputForBack2;
			
			System.out.println("mom's height :"+height2);
			System.out.println("mom's seatForback :" +inputForBack2);
			
			playList2 = JOptionPane.showInputDialog("음악을 입력해주세요[한글 또는 영문입력]\n 예시)BTS or 방탄소년단");
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


	

