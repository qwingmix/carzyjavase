package crazyjavase.yichang.all;

//���������Ҫ�ڣ���Щ��ЩIO���Ѿ�ʵ����closable�ӿڣ����ǻ��Զ���ϵ��Դ�������㲻����ҪЩfianlly����ġ� ����������Ļ���������ʾ���ļ��򲻿��� 

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
			ps.println("ׯ�������Ժ���");
		}
		

	}

}
