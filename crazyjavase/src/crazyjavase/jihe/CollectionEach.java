package crazyjavase.jihe;

//ʾ����ʹ��lambda���ʽ����������Ԫ�أ�

import java.util.*;

public class CollectionEach {

	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("learning java");
		books.add("learning python");
		books.add("learning sql");
		
		books.forEach(obj -> System.out.println("��������Ԫ�أ�"+obj));

	}

}
