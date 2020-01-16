package co.jessie.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionTest extends JFrame{ //JFrame : 윈도우창
	JButton btn ;
	public ActionTest() {		
		this.setTitle("frame test");
		this.setSize(300, 200);
		int var = 10;
		//버튼 추가
		btn = new JButton("눌러주세요!");
		btn.addActionListener( e -> {
			System.out.println("버튼 클릭");
			this.setTitle("펭수"); //람다식 안에서 this.는 람다식을 실행하는 outer클래스 (람다식밖에있는거setTitle)
			this.btn.setText("클릭됨"); //필드 btn
			System.out.println(var);
		} ); //람다식으로 표현
		
		this.getContentPane().add(btn);
		this.setVisible(true); //창 뜨게하는 구문
		
	}
	
	public static void main(String[] args) {		
		new ActionTest();
	}

}
