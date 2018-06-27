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
		System.out.println(nums.first());//返回集合里第一个元素
		System.out.println(nums.last());//返回集合里最后一个元素
		System.out.println(nums.headSet(4));//返回小于4的子集，不包含4
		System.out.println(nums.tailSet(5));//返回大于5的子集，不包含4
		System.out.println(nums.subSet(-3,4));

	}

}
