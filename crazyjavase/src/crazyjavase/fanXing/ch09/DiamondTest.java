package crazyjavase.fanXing.ch09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondTest {

	public static void main(String[] args) {
		List<String> books = new ArrayList<>();
		books.add("���java����");
		books.add("���android����");
		books.forEach(ele -> System.out.println(ele.length()));
		
		System.out.println("----------------------------");
		
		Map<String, List<String>> schoolsInfo = new HashMap<>();//���Ƕ�����һ����ϣmap�������ϣmap��key��String���ͣ� value��һ��String���͵��б����
		List<String> schools = new ArrayList<>();
		schools.add("б�����Ƕ�");
		schools.add("����ȡ��·");
		schoolsInfo.put("�����", schools);
		schoolsInfo.forEach((key,value) -> System.out.println(key + "--" + value));
	}
}
