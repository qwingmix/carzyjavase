package crazyjavase.fanXing.ch09;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		//����ͨ�����ͼ�������ȷ������List���϶������ֻ��װString���͵Ķ����������Ļᱨ��ġ�
		//List<String> strList = new ArrayList<String>();//���һ��String�ǿ���ʡ�Ե�
		List<String> strList = new ArrayList<>();//���˰�,java7��ʼ�� new������ù�����������ʱ�������������Ϊ�գ�javaС�ް����ġ�
		strList.add("���java����");//����Ž�ȥ�ľ���String���Ͱ���û���Ⱑ
		strList.add("���android����");
		//strList.add(5);//����ͱ�¶�����ˣ������Ѿ��������������϶���ֻ��װString���������int�Ǽ�����˼�� 
		strList.forEach(str -> System.out.println(str.length()));
	}
}

/*

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method add(int, String) in the type List<String> is not applicable for the arguments (int)

	at crazyjavase.fanXing.ch09.GenericList.main(GenericList.java:13)
*/