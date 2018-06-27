package crazyjavase.jihe.set.treeset;

import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrorTest2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new String("crazy java"));
		ts.add(new Date());

	}

}


/*
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.util.Date

treeset里面放的必须是同一个类型的对象， 所以一般都要用到强制类型转换的*/。 