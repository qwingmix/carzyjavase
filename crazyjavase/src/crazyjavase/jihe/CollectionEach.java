package crazyjavase.jihe;

//示范，使用lambda表达式来遍历集合元素；

import java.util.*;

public class CollectionEach {

	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("learning java");
		books.add("learning python");
		books.add("learning sql");
		
		books.forEach(obj -> System.out.println("迭代几何元素："+obj));

	}

}
