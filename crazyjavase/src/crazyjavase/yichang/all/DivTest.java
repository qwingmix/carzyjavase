package crazyjavase.yichang.all;

public class DivTest {

	public static void main(String[] args) {
		try 
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("��������������ֵ��������ǣ�"+c);
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("����Խ���������г���ʱ����Ĳ�����������");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("���ݸ�ʽ���ԣ�����ֻ�ܽ���֤�鰡");
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("�����쳣");
		}
		catch(Exception e)
		{
			System.out.println("δ֪�쳣");
		}

	}

}
