package crazyjavase.yichang.all;
/*
主要在说明， 多类型异常的变量不能被重新赋值， 因为他是有被final隐式修饰的。
但，单类型异常又是可以的。 
*/
public class MultiExceptionTest {
	public static void main(String[] args) {
		try 
		{
			int a = Integer.parseInt(args[0]);//Integer.parseInt(String)就是将String字符类型数据转换为Integer整型数据
			//这里尝试把数组转换成int，报错。 下面这行就对的。
			//int a = Integer.parseInt("5");
			int b = Integer.parseInt(args[1]);
			//int b = Integer.parseInt("5");
			int c = a / b;
			System.out.println("您输入的两个数字的相除结果是："+c);
		}
		catch(IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie)
		{
			System.out.println("程序发生了数组越界，数据格式遗产个，算术异常之一");
			ie = new ArithmeticException("test");//这行会报错， 因为，多类型异常的变量，ie，是隐式被final修饰的， 这里会爆出The parameter ie of a multi-catch block cannot be assigned编译异常
		}
		catch(Exception e)
		{
			System.out.println("unkown exception");
			e = new RuntimeException("test");//但是这里又是可以的， 因为这个是单类型异常
		}
	}

}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The parameter ie of a multi-catch block cannot be assigned

	at crazyjavase.yichang.all.MultiExceptionTest.main(MultiExceptionTest.java:22)
*/