package crazyjavase.yichang.all;
/*
̤��ģ�������Ǹ���˵finally����ʲô���������������ᱻִ�У�����������finally֮ǰ���˸��˳���������þ�û���˺ðɡ�
*/
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("a.txt");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
			return;
			//System.exit(1);//���������returnע�͵�������䣬�˳�������Ļ�����ô�����finally����Զִ���ˡ� finallyҲֻ�����ּ�������Ų�����try���汻����.
			//һ�����β�Ͷ�����ϵġ�..
		
			
			
		}
		finally
		{
			if(fis !=null)
			{
				try
				{
					fis.close();
				}
				catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
				
			}
			System.out.println("���ˣ��������淢����ʲô������������finally���鶼��ִ�У� ��ոմ򿪵�������Դ���Ѿ�����رջ�ȥ�ˡ�");
		}

	}

}
