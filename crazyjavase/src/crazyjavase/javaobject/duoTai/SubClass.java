package crazyjavase.javaobject.duoTai;

//�õģ������ϸ㶮�ˡ�  

class BaseClass//�����ĸ���
{
	public int book = 6;
	public void base()
	{
		System.out.println("�����Ǹ������ͨ����-base()");
	}
	public void test()
	{
		System.out.println("�����Ǹ������ͨ����-test��������ע���������ཫ������");
	}
}

public class SubClass extends BaseClass//����������
{
	public String book = "��������javaEE��";
	public void test()
	{
		System.out.println("���︲���˸����test����");
	}
	
	public void sub()
	{
		System.out.println("�������������ͨ����sub");
	}

	public static void main(String[] args) {
		System.out.println("======����ʵ����һ������===============");
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);//�����book
		bc.base();//�����base()
		bc.test();//�����test()
		
		System.out.println("======����ʵ����һ������===============");
		SubClass sc = new SubClass();
		System.out.println(sc.book);//�����Լ����¶����book
		sc.base();//����Ӹ���̳й�����base()
		sc.test();//���า�ǹ����test()

		System.out.println("========��̬���������ʵ�����游�������ʵ�������ۺϣ���ϸ�о�һ��=============");
		
		BaseClass ploymophicBc = new SubClass();
		System.out.println(ploymophicBc.book);//����û�ж�̬���ԣ� ����ֻ���ǳ��ֱ���ʱ����BaseClass���ʵ��������book
		ploymophicBc.base();//ʵ����������Ƕ�̬�˰ɣ� �������õ�����Ӹ���̳й�����base()
		ploymophicBc.test();//������Ƕ�̬�ѣ� ��Ϊ�����test�������test
		//ploymophicBc.sub();//��Ϊ���ı���ʱ����ΪBaseClass�������BC��û��sub������
		
		System.out.println("======������һ���Ǹ�������===============");
		
		
		
	}

}

//���ԣ��¸����壺��ͬ�ı���������ͬһ������ʱ���ֳ����ֲ�ͬ����Ϊ����������Ƕ�̬�� 
