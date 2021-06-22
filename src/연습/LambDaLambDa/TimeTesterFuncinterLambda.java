package 연습.LambDaLambDa;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimeTesterFuncinterLambda { // fork
	public static void main(String[] args) {
		 Double.compare(0, 0);
		// 경청자(listener)를 매 초 호출하는 타이머 생성
		ActionListener al = (ActionListener) new TimePrinterLambda();
		var timer = new Timer(1000, al);

		// 각 timer 는 배경(background) 쓰레드와 연관되어 있다.
		timer.start();

		// 사용자가 "OK"를 누를 때까지 프로그램(=타이머)는 작동함.
		JOptionPane.showMessageDialog(null, "멈출까요?");
		System.exit(0);

	}

}
