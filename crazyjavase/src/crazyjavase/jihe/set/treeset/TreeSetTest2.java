package crazyjavase.jihe.set.treeset;
/*

��Ȼ�����У�����ʵ��������ġ� ����z1���񱻼ӽ���set����ȥ�޴���һ��Ԫ�ص����Ե�ʱ�򣬵ڶ���Ԫ��Ҳ�������ˣ� ˵����ָ����ͬһ������;
������������һ���û��Ū���ף������Ǹ���дeuqals��compareTo�����йء�  

*/


import java.util.TreeSet;

class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	
	//��дequals���������Ƿ���true
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
		
		//�ڶ������ͬһ���������true,������ӳɹ�
		System.out.println(set.add(z1));
		System.out.println(set);
		
		
		//Z��ʼ����ʱ�����ֵ��6�����濪ʼ���ı�Ԫ�ص�ֵ��
		System.out.println(((Z)set.first()).age);
		
		
		
		
		//��age�ĳ�9
		((Z)set.first()).age = 9;
		System.out.println(((Z)set.first()).age+"============"+((Z)set.last()).age);
		//����ͱ�¶�������˰ɣ� ���޸ĵ��ǵ�һ��Ԫ�أ�Ϊʲô��ڶ���Ԫ�ص�ֵҲ���ű�����
		
		
		
		
	}

}

/*

true
[crazyjavase.jihe.set.treeset.Z@70dea4e, crazyjavase.jihe.set.treeset.Z@70dea4e]
6
9============9
*/
