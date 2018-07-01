package crazyjavase.jiChuLeiKu.ch7_5zhenZeBiaoDaShi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */

/*
 * 主要是在讲matcher对象的start方法和end方法
 */

public class StartEnd {

	public static void main(String[] args) {
		String regStr = "java is very easy!";//下面要搞的事情是讲这条字符串按照标点符号类分割 
		System.out.println("目标字符串是 ："+ regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);//\w+是匹配所有的
		while(m.find())//按照你给的正则表达式给目标原文本做一次匹配
		{
			System.out.println(m.group()+"子字符串的起始位置是"+m.start()+",其结束位置是:"+m.end());//start方法和end方法分别是找出目标字符，在整条字符串里面的位置
		}

	}

}
