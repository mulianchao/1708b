package utilsDateUtil;

import java.util.Date;
import java.util.concurrent.Future;

import utils.StringUtil;

public class MyTest {

	public static void main(String[] args) {
		
		/*System.out.println(new Date());
		DateUtil dateUtil = new DateUtil();
		System.out.println(dateUtil.getDaysByFuture(new Date()));
		da*/
		
				Date date = new Date();
				//调用编写方法
		System.out.println(DateUtil.getDaysByFuture(date));
		System.out.println(DateUtil.getDaysByDeparted(date));

	}

}
