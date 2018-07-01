package crazyjavase.jiChuLeiKu.ch7_5zhenZeBiaoDaShi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */


/*
 * 这个case是在做是否能匹配email地址
 */
public class MatchesTest {

	public static void main(String[] args) {
		String[] mails = {
				"qwingdddddddhhhhhhhhhhhhhhdmix@gmail.com",
				"derek.wong@qddd.com",
				"qwinddix@qq.com",
				"kaka@21cn.com"
		};
		
		String mailRegex = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";//@前面3-20个字符，后面任意多个字符.一个后缀
		Pattern mailPattern = Pattern.compile(mailRegex);//但凡要用到正则，都要先弄一个编译好的正则表达式对象Patter p出来
		Matcher matcher = null;//搞事情主要是通过matcher来，他有很多方法
		for(String mail : mails)//在mails数组里面挨个循环遍历
		{
			if(matcher == null)
			{
				matcher = mailPattern.matcher(mail);//如果还没有matcher的话，就先搞一个处理啊啊，经典套路p.matcher(目标语句)
			}
			else
			{
				matcher.reset(mail);//为什么这里要reset呢， 这个方法的本意是将现有的matcher对象应用于新的字符串
				
			}
			//(matcher.matches()?"是":"不是")  注意这里的三元云算法，为了避免混乱，把他括号框起来了
			//matches()是要求整个目标语句完全匹配正则表达式，比较严禁的，不像lookingAt过得去就好。
			String result = mail + (matcher.matches()?"是":"不是")+"一个有效的邮件地址";//matches()，目标原文本与正则表达式匹配的话就返回true
			System.out.println(result);
		}

	}

}


/*
qwingdddddddhhhhhhhhhhhhhhdmix@gmail.com不是一个有效的邮件地址//这个超出了w{3,20}
derek.wong@qddd.com不是一个有效的邮件地址//这个多个了特殊的符号.
qwinddix@qq.com是一个有效的邮件地址
kaka@21cn.com是一个有效的邮件地址

*/











