package crazyjavase.fanXing.ch09;

import java.util.ArrayList;
import java.util.List;

public class ListErr {

	public static void main(String[] args) {
		List strList = new ArrayList();//��һ����˵�����½���һ��list���󣬵�������ȫ������ʲô���Ͷ�����װ��
		//�������ͨ�����ڼ��϶�������װ�ַ�������װint��˵�����⣬ ����Ǽ��ϲ���ȫ�ĵط������ϵ�ȱ�㡣����Ҫͨ���������Ż���
		strList.add("���JAVA����");
		strList.add("���android����");
		//strList.add(5);//���лᱨ��ģ���Ϊ������ͼ��һ��Integer���󶪽�List���ϣ��⽫������һ�г����⡣
		strList.forEach(str -> System.out.println(((String)str).length()));//��һ�����صĻ���������������ĳ��ȡ�

	}

}
/*
����ʵ������ѵ�15��ע�͵��Ļ��� 14���ǿ���ͨ���ġ� */