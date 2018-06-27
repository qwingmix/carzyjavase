package crazyjavase.jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {

	public static void main(String[] args) {
		Collection books = new HashSet(); // 新建一个集合books
		books.add("1.learning python");//向集合添加元素
		books.add("2.疯狂java讲义");
		books.add("3.learning sql");// 这里很有意思， 虽然这里我给他标记好了1,2,3，但其实set是没有顺序的。所以他在遍历的时候并不是这个顺序的。 
		
		Iterator it = books.iterator();//获取集合books对应的迭代器
		it.forEachRemaining(obj -> System.out.println("使用lambda表达式遍历 - 迭代集合元素："+obj));
	
	}

}

/*
使用lambda表达式遍历 - 迭代集合元素：3.learning sql
使用lambda表达式遍历 - 迭代集合元素：1.learning python
使用lambda表达式遍历 - 迭代集合元素：2.疯狂java讲义
*/