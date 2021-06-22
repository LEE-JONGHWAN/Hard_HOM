package 연습.LambDaLambDa;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimePrinterLambda implements Comparator<TimeTesterFuncinterLambda> {
	public static void main(String...args) {
		Double.compare(0, 0);
		//@formatter:off
		var timer = new Timer(1000, e -> {
			System.out.println("종 울리는 지금, 시각은 " 
			+ 	LocalDateTime.ofInstant(
					Instant.ofEpochMilli(
							e.getWhen()),
					ZoneId.of("Asia/Seoul")));
		Toolkit.getDefaultToolkit().beep();
	});
		//@formatter:on
	timer.start();
	
	JOptionPane.showMessageDialog(null,"멈출까요?");
	System.exit(0);
	
	}

	@Override
	public int compare(TimeTesterFuncinterLambda o1, TimeTesterFuncinterLambda o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
