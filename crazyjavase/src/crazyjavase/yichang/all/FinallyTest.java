package crazyjavase.yichang.all;
/*
踏马的，这里就是跟你说finally无论什么天打雷劈的情况都会被执行，除非尼玛在finally之前搞了个退出虚拟机，拿就没辙了好吧。
*/
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("a.txt");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
			return;
			//System.exit(1);//如果把上面return注释掉，用这句，退出虚拟机的话，那么下面的finally就永远执行了。 finally也只有这种极端情况才不会在try后面被屏蔽.
			//一般这个尾巴都会带上的。..
		
			
			
		}
		finally
		{
			if(fis !=null)
			{
				try
				{
					fis.close();
				}
				catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
				
			}
			System.out.println("好了，不管上面发生了什么，反正这里是finally语句块都会执行， 你刚刚打开的物理资源，已经给你关闭回去了。");
		}

	}

}
