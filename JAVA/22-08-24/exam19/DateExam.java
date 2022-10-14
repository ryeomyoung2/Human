package exam19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
	      Date now = new Date();
	      String strNow1 = now.toString();
	      System.out.println (strNow1);
	      
	      SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	      String strNow2 = sdf1.format(now);
	      System.out.println(strNow2);

	      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd  hh:mm:ss");
	      // 형식을 지정할 수 있다.  (sdf2는 형식을 지정하는것.)
	      String strNow3 = sdf2.format(now);
	      // now 현재인데.. Date now = new Date();이를 통해서 현재시간이 정의됨.
	      System.out.println(strNow3);

	}

}
