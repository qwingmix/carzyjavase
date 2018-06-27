package crazyjavase.jihe;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println("c集合的元素个数为 ："+c.size());
		c.remove(6);
		System.out.println("remove()后，c集合的元素个数为 ："+c.size());
		System.out.println("c集合是否包含孙悟空字符串_contains()方法的应用"+c.contains("孙悟空"));
		c.add("轻量级java ee企业应用实践");
		System.out.println("c集合的元素:"+c);
		System.out.println("=====================================================================================");
		
		Collection books = new HashSet();
		books.add("轻量级java ee企业应用实践");
		books.add("疯狂java讲义");6
		System.out.println("c集合是否完全包含books集合？"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("c集合的元素:"+c);
		c.clear();
		System.out.println("c集合的元素:"+c);
		books.retainAll(c);
		System.out.println("books集合的元素："+books );//跟空集的交集就只有空集啊；
		
	
	}

}
