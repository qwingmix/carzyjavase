package crazyjavase.jiChuLeiKu.ch7_5zhenZeBiaoDaShi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */

/*
 * Pattern对象用来放正则表达式，
 * matcher类的对象用来放源文本，搞事情的方法是在matcher类里边。
 */


public class FindGroup {
	public static void main(String[] args) {
		String str = "我想求购一本crazyjava，电话13500006666"+"重金求种，电话13611125565"+"出售个人电脑，电话15899903312";
		
		Pattern p =Pattern.compile("((13\\d)|(15\\d))\\d{8}");//一定要先有p对象，他就是用来写正则表达式的地方；
		Matcher m  = p.matcher(str); //matcher对象， 就是用来放被正则语句源文文的地方。 所以，主要搞事情的还是要靠matcher类。
		while(m.find())//判断目标字符串是匹配正则表达式，如果匹配， 下面就开始搞事情啊。 
		{System.out.println(m.group());//匹配一次。 （书上说是上一次， 不知道为什么这样表达，其实就是这一次吧。）

	}

}
}
