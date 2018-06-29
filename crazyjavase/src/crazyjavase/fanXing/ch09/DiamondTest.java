package crazyjavase.fanXing.ch09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondTest {

	public static void main(String[] args) {
		List<String> books = new ArrayList<>();
		books.add("疯狂java讲义");
		books.add("疯狂android讲义");
		books.forEach(ele -> System.out.println(ele.length()));
		
		System.out.println("----------------------------");
		
		Map<String, List<String>> schoolsInfo = new HashMap<>();//这是定义了一个哈希map，这个哈希map的key是String类型， value是一个String类型的列表对象
		List<String> schools = new ArrayList<>();
		schools.add("斜月三星洞");
		schools.add("西天取经路");
		schoolsInfo.put("孙悟空", schools);
		schoolsInfo.forEach((key,value) -> System.out.println(key + "--" + value));
	}
}
