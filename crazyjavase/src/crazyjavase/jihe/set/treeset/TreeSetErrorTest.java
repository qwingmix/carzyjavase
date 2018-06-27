package crazyjavase.jihe.set.treeset;

import java.util.TreeSet;

class Err{}


public class TreeSetErrorTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Err());
		ts.add(new Err());

	}

}
/*

报错， 试图把一个对象添加到TreeSet时候，这个对象的类必须实现comparable接口，不然程序就会爆出ClassCastException异常

Exception in thread "main" java.lang.ClassCastException: crazyjavase.jihe.set.treeset.Err cannot be cast to java.lang.Comparable
at java.util.TreeMap.compare(Unknown Source)
at java.util.TreeMap.put(Unknown Source)
at java.util.TreeSet.add(Unknown Source)
at crazyjavase.jihe.set.treeset.TreeSetErrorTest.main(TreeSetErrorTest.java:12)
*/