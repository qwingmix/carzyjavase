package crazyjavase.javaobject.superkeyword;
class creature//父类的父类creature
{
	public creature()//所以这里是父类的父类的构造器
	{
		System.out.println("1.这里是父类的父类的构造器 --- creature无参数的构造器");
	}
}
class Animal extends creature//父类animal
{
	public Animal(String name) 
	{
		System.out.println("2.这里是父类Animal的构造器，但是，父类是有构造器重载的，他有两个构造器。这是带1个参数的构造器," + "该动物的name为"+ name);	
	}
	
	public Animal(String name,int age) 
	{
		this(name);//使用this调同一个类的重载的构造器， 这样就不用重新定义name变量了。 
		System.out.println("3.这里是父类Animal的构造器，但是，父类是有构造器重载的，他有两个构造器。这是带2个参数的构造器," + "该动物的name为"+ name+",其age为"+age);
	}
}

public class Wolf extends Animal
{
	public Wolf()
	{
		super("灰太狼",3);
		System.out.println("4.所以这个子类是用super来调用父类的构造器，wolf本身是无参数构造器");//为什么他要把这里叫做无参数构造器呢，是指wolf()这个构造器吗（本类构造器 ）
	}

	public static void main(String[] args) {
		new Wolf();
	}
}
