package crazyjavase.yichang.all;

public class FinallyFlowTest {

	public static void main(String[] args) 
		    throws Exception //这里很特殊，还没学到的知识点， 不知道什么意思。 
		{
			Boolean a = test();
			System.out.println(a);
		}
		
		
		public static boolean test() 
		{
			try
			{
				return true;// 这个example要说明的问题就是， 无论如何，都会执行finally的， 除非你有退出虚拟机的代码 System.exit(1)
			}
			finally
			{
				return false;
			}
			
		}

	}
