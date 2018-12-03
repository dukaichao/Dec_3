package cn.itcast.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	 1.�����������󣬲��ô���ʵ�֣�
	(1)����һ��ѧ����Student���������ԣ�����(String name)������(int age)
	(2)����Map���ϣ���Student������Ϊkey�����ַ���(�˱�ʾ��ʾѧ����סַ)��Ϊvalue
	(3)�������ַ�ʽ����Map�����е����ݣ���ʽ��key::value
*/ 
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name:" + name + " age:" + age + "]";
	}

}
public class Demo6 {
	public static void main(String[] args) {
		Map<Student,String> mp = new HashMap<Student,String>();
		mp.put(new Student("����",21), "����");
		mp.put(new Student("����",20), "��ǽ");
		mp.put(new Student("������",21), "����");
		mp.put(new Student("��Ƥ",20), "��Դ");
		mp.put(new Student("����",20), "����");
		mp.put(new Student("����",21), "��ƽ");
		mp.put(new Student("����",21), "��ƽ");
		
/*		System.out.println("��һ��");
		Set<Student> keys = mp.keySet();
		Iterator<Student> it = keys.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("����"+s+" ֵ��"+mp.get(s));
		}
		
		System.out.println("�ڶ���");
		Set<Entry<Student,String>> s = mp.entrySet();
		Iterator<Entry<Student, String>> it1 = s.iterator();
		while(it1.hasNext()) {
			Entry<Student,String> e = it1.next();
			System.out.println("����"+e.getKey()+" ֵ��"+e.getValue());
		}
		
		System.out.println("������");
		Collection c = mp.values();
		Iterator it2 = c.iterator();
		while(it2.hasNext()) {
			System.out.println("ֵ:"+it2.next());
		}
		*/
		System.out.println("������");
		for(Map.Entry<Student, String> e:mp.entrySet()) {
			System.out.println("����"+e.getKey()+" ֵ��"+e.getValue());
		}
	}
}
