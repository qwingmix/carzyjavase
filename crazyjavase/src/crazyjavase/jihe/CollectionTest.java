package crazyjavase.jihe;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("�����");
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ ��"+c.size());
		c.remove(6);
		System.out.println("remove()��c���ϵ�Ԫ�ظ���Ϊ ��"+c.size());
		System.out.println("c�����Ƿ����������ַ���_contains()������Ӧ��"+c.contains("�����"));
		c.add("������java ee��ҵӦ��ʵ��");
		System.out.println("c���ϵ�Ԫ��:"+c);
		System.out.println("=====================================================================================");
		
		Collection books = new HashSet();
		books.add("������java ee��ҵӦ��ʵ��");
		books.add("���java����");6
		System.out.println("c�����Ƿ���ȫ����books���ϣ�"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ��:"+c);
		c.clear();
		System.out.println("c���ϵ�Ԫ��:"+c);
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�"+books );//���ռ��Ľ�����ֻ�пռ�����
		
	
	}

}
