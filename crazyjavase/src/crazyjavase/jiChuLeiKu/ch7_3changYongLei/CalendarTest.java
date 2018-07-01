package crazyjavase.jiChuLeiKu.ch7_3changYongLei;

import java.util.Calendar;

/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */


/*
 * 这里不知为什么，跑不通， 不知道你来有问题， 已经跟着课文一起来了。 
 */


public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(YEAR));
		System.out.println(c.get(MONTH));
		System.out.println(c.get(DATE));
		c.set(2003,10,23,12,32,23);
		System.out.println(c.getTime());
		c.add(YEAR, -1);
		System.out.println(c.getTime());
		c.roll(MONTH,-8);
		System.out.println(c.getTime());
			
		
		

	}

}
