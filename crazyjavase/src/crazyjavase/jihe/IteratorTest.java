package crazyjavase.jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		Collection books = new HashSet(); // 新建一个集合books
		books.add("1.learning python");//向集合添加元素
		books.add("2.疯狂java讲义");
		books.add("3.learning sql");// 这里很有意思， 虽然这里我给他标记好了1,2,3，但其实set是没有顺序的。所以他在遍历的时候并不是这个顺序的。 
		
		Iterator it = books.iterator();//获取集合books对应的迭代器
		while(it.hasNext()) //如果迭代的集合元素还没有被遍历完， 就返回true
		{
			String book= (String)it.next();//it.next()方法返回的是Object类型，因此这里需要强制类型转换；就是说，每次循环都给他把元素赋值给book变量。
			System.out.println(book);
			if(book.equals("2.疯狂java讲义"))// 
			{
				it.remove();//虽然是删除掉了，但每次循环，还是会答应元素出来， 因为答应方法在remove方法前面啊。 
			}
			
			book = "测试字符串";//这里是要说明， 重新赋值改变的是迭代器返回值的值，而不是集合元素的值。
			
		}
		
		System.out.println("=====================================");
		System.out.println(books);// 这里来看的话， 就发现2.疯狂java讲义已经被remove了。 
		

	}

}


/*运行结果:
3.learning sql
1.learning python
2.疯狂java讲义
=====================================
[3.learning sql, 1.learning python]*/



