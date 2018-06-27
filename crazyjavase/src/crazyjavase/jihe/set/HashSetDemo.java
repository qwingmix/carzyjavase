package crazyjavase.jihe.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("xixi");
		hs.add("heihei");
		hs.add("hehe");
/*		hs.add("hehe");//跟上面重复了，所以这些都不会被放进set里面去的
		hs.add("hehe");
		hs.add("hehe");
		*/
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
/*
运行结果， 注意， set是无序的，所以你看下面的，是不是跟代码的顺序不同啊。
heihei
xixi
hehe

*/
