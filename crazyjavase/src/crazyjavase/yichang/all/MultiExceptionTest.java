package crazyjavase.yichang.all;
/*
��Ҫ��˵���� �������쳣�ı������ܱ����¸�ֵ�� ��Ϊ�����б�final��ʽ���εġ�
�����������쳣���ǿ��Եġ� 
*/
public class MultiExceptionTest {
	public static void main(String[] args) {
		try 
		{
			int a = Integer.parseInt(args[0]);//Integer.parseInt(String)���ǽ�String�ַ���������ת��ΪInteger��������
			//���ﳢ�԰�����ת����int������ �������оͶԵġ�
			//int a = Integer.parseInt("5");
			int b = Integer.parseInt(args[1]);
			//int b = Integer.parseInt("5");
			int c = a / b;
			System.out.println("��������������ֵ��������ǣ�"+c);
		}
		catch(IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie)
		{
			System.out.println("������������Խ�磬���ݸ�ʽ�Ų����������쳣֮һ");
			ie = new ArithmeticException("test");//���лᱨ�� ��Ϊ���������쳣�ı�����ie������ʽ��final���εģ� ����ᱬ��The parameter ie of a multi-catch block cannot be assigned�����쳣
		}
		catch(Exception e)
		{
			System.out.println("unkown exception");
			e = new RuntimeException("test");//�����������ǿ��Եģ� ��Ϊ����ǵ������쳣
		}
	}

}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The parameter ie of a multi-catch block cannot be assigned

	at crazyjavase.yichang.all.MultiExceptionTest.main(MultiExceptionTest.java:22)
*/