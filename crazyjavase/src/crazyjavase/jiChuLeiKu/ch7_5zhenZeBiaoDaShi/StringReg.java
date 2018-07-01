package crazyjavase.jiChuLeiKu.ch7_5zhenZeBiaoDaShi;

import java.util.Arrays;

/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */
public class StringReg {

	public static void main(String[] args) {
		String[] msgs =
			{
					"java has regular expressions in 1.4",
					"regular expressions now expressing in java",
					"java represses oracular expressions"
			};
		
		for(String msg:msgs)
		{
			System.out.println(msg.replaceFirst("re\\w*","哈哈"));//String类由一个replaceFirst方法，可以用来正则替换
			System.out.println(Arrays.toString(msg.split(" ")));//顺便把字符串分割成多个子串
		}

	}

}
/*
java has 哈哈 expressions in 1.4
[java, has, regular, expressions, in, 1.4]
哈哈 expressions now expressing in java
[regular, expressions, now, expressing, in, java]
java 哈哈 oracular expressions
[java, represses, oracular, expressions]


*/
