package crazyjavase.jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		Collection books = new HashSet(); // �½�һ������books
		books.add("1.learning python");//�򼯺����Ԫ��
		books.add("2.���java����");
		books.add("3.learning sql");// ���������˼�� ��Ȼ�����Ҹ�����Ǻ���1,2,3������ʵset��û��˳��ġ��������ڱ�����ʱ�򲢲������˳��ġ� 
		
		Iterator it = books.iterator();//��ȡ����books��Ӧ�ĵ�����
		while(it.hasNext()) //��������ļ���Ԫ�ػ�û�б������꣬ �ͷ���true
		{
			String book= (String)it.next();//it.next()�������ص���Object���ͣ����������Ҫǿ������ת��������˵��ÿ��ѭ����������Ԫ�ظ�ֵ��book������
			System.out.println(book);
			if(book.equals("2.���java����"))// 
			{
				it.remove();//��Ȼ��ɾ�����ˣ���ÿ��ѭ�������ǻ��ӦԪ�س����� ��Ϊ��Ӧ������remove����ǰ�氡�� 
			}
			
			book = "�����ַ���";//������Ҫ˵���� ���¸�ֵ�ı���ǵ���������ֵ��ֵ�������Ǽ���Ԫ�ص�ֵ��
			
		}
		
		System.out.println("=====================================");
		System.out.println(books);// ���������Ļ��� �ͷ���2.���java�����Ѿ���remove�ˡ� 
		

	}

}


/*���н��:
3.learning sql
1.learning python
2.���java����
=====================================
[3.learning sql, 1.learning python]*/



