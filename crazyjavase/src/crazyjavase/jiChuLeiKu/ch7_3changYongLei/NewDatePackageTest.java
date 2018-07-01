package crazyjavase.jiChuLeiKu.ch7_3changYongLei;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */
public class NewDatePackageTest {

	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println("当前时间为：" + clock.instant());
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		System.out.println("-------------------------------");
		Duration d = Duration.ofSeconds(6000);
		System.out.println("6000秒相当于" + d.toMinutes()+"分");
		System.out.println("6000秒相当于" + d.toHours()+"小时");
		System.out.println("6000秒相当于" + d.toDays()+"天");

		System.out.println("-------------------------------");
		Clock clock2 =Clock.offset(clock, d);
		System.out.println("当前时间加6000秒是："+clock2.instant());
		
		

		System.out.println("----------下面是instant的使用---------------------");
		Instant instant = Instant.now();
		System.out.println(instant);
		
		

	}

}
