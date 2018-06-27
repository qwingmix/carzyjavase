package crazyjavase.javaobject.chuShiHuaKuai;

public class Person {
	
	{
		int a = 6;
		if (a>4) {
			System.out.println("1.Person类的第一个初始化块，局部变量a的值大于4");
		}
		
		System.out.println("2.Person类的第二个初始化块");
	}
	
	{
		System.out.println("3.这里是Person类的第二个初始化块");
	}
	
	
	public Person() {
		System.out.println("4.这里是Person类的无参的构造器");
		
	}

	public static void main(String[] args) {
		
		new Person();

	}

}
