package crazyjavase.yichang.all;

import java.util.Date;

public class NullTest {

	public static void main(String[] args) {
		Date d = null;
		try
		{
			System.out.println(d.after(new Date()));
		}
		catch(NullPointerException ne)
		{
			System.out.println("��ָ���쳣");//����С�쳣��Ӧ�þͷ���ǰ�棬���Exception�쳣������Ļ����Ͳ��ᱨ���ָ���쳣�ˡ� 
			
		}
		catch(Exception e)
		{
			System.out.println("unkonwn exception");//Exception�쳣���Ƿ��������ġ� ��д��쳣�� ����û������ 
		}

	}

}
