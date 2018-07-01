package crazyjavase.jiChuLeiKu.ch7_5zhenZeBiaoDaShi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */


/*
 * 他这里主要是讲replaceAll方法的应用，讲目标字符串数组里面所有由re开头的数组，都改成了哈哈做替换。
 */


public class ReplaceTest {

	public static void main(String[] args) {
		String[] msgs = 
			{
					"java has regular expressions in 1.4",
					"regular expressions now expressing in Java",
					"Java represses oracular expressions"
			};
		Pattern p = Pattern.compile("re\\w*");
		Matcher matcher = null;
		for(int i=0;i<msgs.length;i++)
		{
			if(matcher == null)
			{
				matcher = p.matcher(msgs[i]);//这里就是最经典的啦 p.matcher(目标原文本)
			}
			else
			{
				matcher.reset(msgs[i]);
			}
			System.out.println(matcher.replaceAll("哈哈"));
		}
	}

}

/*
java has 哈哈 exp哈哈 in 1.4
哈哈 exp哈哈 now exp哈哈 in Java
Java 哈哈 oracular exp哈哈
*/


