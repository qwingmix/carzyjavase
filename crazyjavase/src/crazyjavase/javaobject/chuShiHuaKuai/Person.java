package crazyjavase.javaobject.chuShiHuaKuai;

public class Person {
	
	{
		int a = 6;
		if (a>4) {
			System.out.println("1.Person��ĵ�һ����ʼ���飬�ֲ�����a��ֵ����4");
		}
		
		System.out.println("2.Person��ĵڶ�����ʼ����");
	}
	
	{
		System.out.println("3.������Person��ĵڶ�����ʼ����");
	}
	
	
	public Person() {
		System.out.println("4.������Person����޲εĹ�����");
		
	}

	public static void main(String[] args) {
		
		new Person();

	}

}
