package crazyjavase.javaobject.superkeyword;
class creature//����ĸ���creature
{
	public creature()//���������Ǹ���ĸ���Ĺ�����
	{
		System.out.println("1.�����Ǹ���ĸ���Ĺ����� --- creature�޲����Ĺ�����");
	}
}
class Animal extends creature//����animal
{
	public Animal(String name) 
	{
		System.out.println("2.�����Ǹ���Animal�Ĺ����������ǣ��������й��������صģ��������������������Ǵ�1�������Ĺ�����," + "�ö����nameΪ"+ name);	
	}
	
	public Animal(String name,int age) 
	{
		this(name);//ʹ��this��ͬһ��������صĹ������� �����Ͳ������¶���name�����ˡ� 
		System.out.println("3.�����Ǹ���Animal�Ĺ����������ǣ��������й��������صģ��������������������Ǵ�2�������Ĺ�����," + "�ö����nameΪ"+ name+",��ageΪ"+age);
	}
}

public class Wolf extends Animal
{
	public Wolf()
	{
		super("��̫��",3);
		System.out.println("4.���������������super�����ø���Ĺ�������wolf�������޲���������");//Ϊʲô��Ҫ����������޲����������أ���ָwolf()����������𣨱��๹���� ��
	}

	public static void main(String[] args) {
		new Wolf();
	}
}
