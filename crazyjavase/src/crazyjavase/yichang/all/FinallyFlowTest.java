package crazyjavase.yichang.all;

public class FinallyFlowTest {

	public static void main(String[] args) 
		    throws Exception //��������⣬��ûѧ����֪ʶ�㣬 ��֪��ʲô��˼�� 
		{
			Boolean a = test();
			System.out.println(a);
		}
		
		
		public static boolean test() 
		{
			try
			{
				return true;// ���exampleҪ˵����������ǣ� ������Σ�����ִ��finally�ģ� ���������˳�������Ĵ��� System.exit(1)
			}
			finally
			{
				return false;
			}
			
		}

	}
