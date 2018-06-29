package crazyjavase.fanXing.biXiangDong;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add("haha");
		al.add(4);
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			String str = (string)it.next();
			System.out.println(str);
		}
		
	}

}
