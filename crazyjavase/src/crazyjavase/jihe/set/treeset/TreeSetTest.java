package crazyjavase.jihe.set.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		
		System.out.println(nums);
		System.out.println(nums.first());//���ؼ������һ��Ԫ��
		System.out.println(nums.last());//���ؼ��������һ��Ԫ��
		System.out.println(nums.headSet(4));//����С��4���Ӽ���������4
		System.out.println(nums.tailSet(5));//���ش���5���Ӽ���������4
		System.out.println(nums.subSet(-3,4));

	}

}
