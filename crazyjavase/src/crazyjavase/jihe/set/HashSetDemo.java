package crazyjavase.jihe.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("xixi");
		hs.add("heihei");
		hs.add("hehe");
/*		hs.add("hehe");//�������ظ��ˣ�������Щ�����ᱻ�Ž�set����ȥ��
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
���н���� ע�⣬ set������ģ������㿴����ģ��ǲ��Ǹ������˳��ͬ����
heihei
xixi
hehe

*/
