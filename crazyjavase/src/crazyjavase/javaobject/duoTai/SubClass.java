package crazyjavase.javaobject.duoTai;

//好的，基本上搞懂了。  

class BaseClass//本例的父类
{
	public int book = 6;
	public void base()
	{
		System.out.println("这里是父类的普通方法-base()");
	}
	public void test()
	{
		System.out.println("这里是父类的普通方法-test（），备注，他在子类将被覆盖");
	}
}

public class SubClass extends BaseClass//本例的子类
{
	public String book = "《轻量级javaEE》";
	public void test()
	{
		System.out.println("这里覆盖了父类的test方法");
	}
	
	public void sub()
	{
		System.out.println("这里是子类的普通方法sub");
	}

	public static void main(String[] args) {
		System.out.println("======下面实例化一个父类===============");
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);//父类的book
		bc.base();//父类的base()
		bc.test();//父类的test()
		
		System.out.println("======下面实例化一个子类===============");
		SubClass sc = new SubClass();
		System.out.println(sc.book);//子类自己重新定义的book
		sc.base();//子类从父类继承过来的base()
		sc.test();//子类覆盖过后的test()

		System.out.println("========多态的情况，其实是上面父类和子类实例化的综合，仔细研究一下=============");
		
		BaseClass ploymophicBc = new SubClass();
		System.out.println(ploymophicBc.book);//变量没有多态特性， 这里只会是出现编译时类型BaseClass类的实例变量的book
		ploymophicBc.base();//实际上这里就是多态了吧， 这里是用的子类从父类继承过来的base()
		ploymophicBc.test();//这里就是多态把， 因为这里的test是子类的test
		//ploymophicBc.sub();//因为他的编译时类型为BaseClass，而这个BC类没有sub方法；
		
		System.out.println("======下面来一个非父类的情况===============");
		
		
		
	}

}

//所以，下个定义：相同的变量，调用同一个方法时呈现出多种不同的行为特征，这就是多态。 
