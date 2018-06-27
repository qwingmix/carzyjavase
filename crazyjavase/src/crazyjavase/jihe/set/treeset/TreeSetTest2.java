package crazyjavase.jihe.set.treeset;
/*

虽然能运行，但其实是有问题的。 两个z1对像被加进了set，但去修带第一个元素的属性的时候，第二个元素也出问题了， 说明是指向了同一个对象;
但这里的问题我还是没有弄明白，好像是跟改写euqals和compareTo方法有关。  

*/


import java.util.TreeSet;

class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	
	//重写equals方法，总是返回true
	public boolean equals(Object obj)
	{
		return true;
	}
	
	public int compareTo(Object obj)
	{
		return 1;
	}
	
	
}


public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		
		//第二次添加同一个对象，输出true,表面添加成功
		System.out.println(set.add(z1));
		System.out.println(set);
		
		
		//Z初始化的时候传入的值是6，下面开始来改变元素的值啦
		System.out.println(((Z)set.first()).age);
		
		
		
		
		//把age改成9
		((Z)set.first()).age = 9;
		System.out.println(((Z)set.first()).age+"============"+((Z)set.last()).age);
		//这里就暴露出问题了吧， 我修改的是第一个元素，为什么你第二个元素的值也跟着变了呢
		
		
		
		
	}

}

/*

true
[crazyjavase.jihe.set.treeset.Z@70dea4e, crazyjavase.jihe.set.treeset.Z@70dea4e]
6
9============9
*/
