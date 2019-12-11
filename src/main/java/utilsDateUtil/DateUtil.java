package utilsDateUtil;

import java.util.Date;

public class DateUtil {
//求未来日期离今天还剩的天数
	public static int getDaysByFuture(Date future) {
		Date now = new Date();
		return (int) ((future.getTime()-now.getTime())/(60*60*24*1000));
	}
//求过去日期离今天过去的天数
	
	public static int getDaysByDeparted(Date departed) {
		Date now = new Date();
		return (int) ((now.getTime()-departed.getTime())/(60*60*24*1000));
	}
}
