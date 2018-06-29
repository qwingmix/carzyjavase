package crazyjavase.fanXing.ch09;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		//这里通过泛型技术，明确限制了List集合对象里边只给装String类型的东西，其他的会报错的。
		//List<String> strList = new ArrayList<String>();//最后一个String是可以省略的
		List<String> strList = new ArrayList<>();//屌了吧,java7开始， new后面调用构造器函数的时候，菱形里面可以为空，java小棉袄懂的。
		strList.add("疯狂java讲义");//这里放进去的就是String类型啊，没问题啊
		strList.add("疯狂android讲义");
		//strList.add(5);//这里就暴露问题了，哥们已经定义好了这个集合对量只能装String，你给塞个int是几个意思。 
		strList.forEach(str -> System.out.println(str.length()));
	}
}

/*

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method add(int, String) in the type List<String> is not applicable for the arguments (int)

	at crazyjavase.fanXing.ch09.GenericList.main(GenericList.java:13)
*/