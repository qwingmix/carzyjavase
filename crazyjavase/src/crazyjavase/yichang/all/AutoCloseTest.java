package crazyjavase.yichang.all;

//这个案例是要在，有些有些IO类已经实现了closable接口，他们会自动关系资源，所以你不再需要些fianlly代码的。 但我用这个的话他首先提示，文件打不开。 

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class AutoCloseTest {

	public static void main(String[] args) 
	throws Exception
	{
		try
		(
			BufferedReader br = new BufferedReader(new FileReader("NullTest.java"));
			PrintStream ps = new PrintStream(new FileOutputStream("a.txt")))
		{
			System.out.println(br.readLine());
			ps.println("庄生晓梦迷蝴蝶");
		}
		

	}

}
