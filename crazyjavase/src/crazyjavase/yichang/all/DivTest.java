package crazyjavase.yichang.all;

public class DivTest {

	public static void main(String[] args) {
		try 
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("您输入的两个数字的相除结果是："+c);
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("数组越界啦，运行程序时输入的参数个数不够");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("数据格式不对，程序只能接收证书啊");
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("算术异常");
		}
		catch(Exception e)
		{
			System.out.println("未知异常");
		}

	}

}
