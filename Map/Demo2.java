package cn.itcast.Map;

import java.util.HashMap;
import java.util.TreeMap;

/*
 ˫�м��ϣ�
 	----------|Map:�����ʵ����Map�ӿڡ�����е��ص��ǣ��洢���ݶ����Լ�ֵ�Դ��ڵģ��������ظ���ֵ�����ظ�
	
	---------------| HashMap���ײ�ʵ�ֹ�ϣ��
	
	---------------| TreeMap��
	
 	---------------| HashTable��
 */

class  Human{
	int age;
	String name;
	public String toString() {
		return "[name��" + name + " age��" + age + "]";
	}
	public Human(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.age;
	}
	@Override
	public boolean equals(Object obj) {
		Human other = (Human) obj;
		return this.age == other.age;
	}
}
public class Demo2 {
	public static void main(String[] args) {
		HashMap<Human,String> mp1 = new HashMap<Human,String>();
		mp1.put(new Human("����",18), "����");
		mp1.put(new Human("����",78), "��Ψ");
		mp1.put(new Human("����",68), "��÷");
		mp1.put(new Human("�ƻ�",75), "��Ψ");
		mp1.put(new Human("����",77), "ԲԲ");
		mp1.put(new Human("����",78), "һ��");
		System.out.println(mp1);
	}
}
