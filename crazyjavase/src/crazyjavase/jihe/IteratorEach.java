package crazyjavase.jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {

	public static void main(String[] args) {
		Collection books = new HashSet(); // �½�һ������books
		books.add("1.learning python");//�򼯺����Ԫ��
		books.add("2.���java����");
		books.add("3.learning sql");// ���������˼�� ��Ȼ�����Ҹ�����Ǻ���1,2,3������ʵset��û��˳��ġ��������ڱ�����ʱ�򲢲������˳��ġ� 
		
		Iterator it = books.iterator();//��ȡ����books��Ӧ�ĵ�����
		it.forEachRemaining(obj -> System.out.println("ʹ��lambda���ʽ���� - ��������Ԫ�أ�"+obj));
	
	}

}

/*
ʹ��lambda���ʽ���� - ��������Ԫ�أ�3.learning sql
ʹ��lambda���ʽ���� - ��������Ԫ�أ�1.learning python
ʹ��lambda���ʽ���� - ��������Ԫ�أ�2.���java����
*/