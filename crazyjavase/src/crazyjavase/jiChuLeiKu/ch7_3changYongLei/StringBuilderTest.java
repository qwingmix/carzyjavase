package crazyjavase.jiChuLeiKu.ch7_3changYongLei;


/**
 * @author Derek Wong
 *
 * 2018年7月1日
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("java..");
		sb.insert(0, "hello ");
		sb.replace(5, 6, ",");
		sb.delete(5, 6);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.setLength(5);
		System.out.println(sb);
		
		

	}

}
