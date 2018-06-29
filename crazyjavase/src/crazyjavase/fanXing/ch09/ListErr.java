package crazyjavase.fanXing.ch09;

import java.util.ArrayList;
import java.util.List;

public class ListErr {

	public static void main(String[] args) {
		List strList = new ArrayList();//这一行是说明，新建了一个list对象，但他不安全，里面什么类型都可以装。
		//这里就是通过既在集合对象里面装字符串，又装int来说明问题， 这就是集合不安全的地方，集合的缺点。所以要通过泛型来优化。
		strList.add("疯狂JAVA讲义");
		strList.add("疯狂android讲义");
		//strList.add(5);//这行会报错的，因为这是试图把一个Integer对象丢进List集合，这将导致下一行出问题。
		strList.forEach(str -> System.out.println(((String)str).length()));//上一行隐藏的话会会输出两个对象的长度。

	}

}
/*
但其实，如果把第15行注释掉的话， 14行是可以通过的。 */