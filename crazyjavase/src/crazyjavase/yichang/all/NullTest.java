package crazyjavase.yichang.all;

import java.util.Date;

public class NullTest {

	public static void main(String[] args) {
		Date d = null;
		try
		{
			System.out.println(d.after(new Date()));
		}
		catch(NullPointerException ne)
		{
			System.out.println("空指针异常");//这是小异常，应该就放在前面，如果Exception异常放这里的话，就不会报告空指针异常了。 
			
		}
		catch(Exception e)
		{
			System.out.println("unkonwn exception");//Exception异常总是放在最后面的。 这叫大异常。 是在没找啦。 
		}

	}

}
