package cn.itcast.Map;
/*˫�м��ϣ�
 	----------|Map:�����ʵ����Map�ӿڡ�����е��ص��ǣ��洢���ݶ����Լ�ֵ�Դ��ڵģ��������ظ���ֵ�����ظ�
	
	---------------| HashMap���ײ�ʵ�ֹ�ϣ��
	
	---------------| TreeMap�����ں���������ݽṹʵ�ֵġ�  �ص㣺���Ԫ�ؽ�������,���ݼ�����
	
	TreeMapע�����
		1.��TreeMap���Ԫ�ص�ʱ�����Ԫ�صļ��߱���Ȼ˳�����Խ�������洢
		2.��TreeMap���Ԫ�ص�ʱ�����Ԫ�صļ����߱���Ȼ˳�����ԣ���ô�ü���������ʵ��Comparable�ӿ�
	
 	---------------| HashTable��jdk1.0����   
*/
import java.util.Comparator;
import java.util.TreeMap;

class Preson implements Comparable<Preson>{
	String name;
	int age;
	public Preson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int compareTo(Preson o) {
		
		return this.age - o.age;
	}
	public String toString() {
		return "[name��" + name + " age��" + age + "]";
	}

}
class myComparator implements Comparator<Preson>{

	
	public int compare(Preson p1, Preson p2) {
		
		return p2.age - p1.age;
	}
	
}
public class Demo3 {
	public static void main(String[] args) {
		myComparator mc = new myComparator();
		TreeMap<Preson,String> mp2 = new TreeMap<Preson,String>(mc);
		mp2.put(new Preson("����",18), "����");
		mp2.put(new Preson("����",78), "��Ψ");
		mp2.put(new Preson("����",68), "��÷");
		mp2.put(new Preson("�ƻ�",75), "��Ψ");
		mp2.put(new Preson("����",77), "ԲԲ");
		mp2.put(new Preson("����",78), "һ��");
		System.out.println(mp2);
	}
}
