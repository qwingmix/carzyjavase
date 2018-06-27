package crazyjavase.jihe.set.treeset;

import java.util.TreeSet;

/*
treeset的自然排序时根据集合元素的大小进行的升序排序，如果需要实现如降序排序这样的需求的话， 就要弄个定制排序
*/
class M
{
	int age;

	public M(int age) {
		super();
		this.age = age;
	}
	
	public String toString()
	{
		return "M [age:" + age + "]";
		
	}
	
}

public class TreeSetTest4 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet((o1,o2) -> 
		{
			M m1 = (M)o1;//这里的(M)是强制类型转换把。 
			M m2 = (M)o2;
			return m1.age > m2.age ? -1 : m1.age < m2.age ?1:0;
			});
		
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
		
	}

}
