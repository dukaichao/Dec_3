package cn.itcast.Map;

import java.util.HashMap;
import java.util.Map;

/*
 	˫�м��ϣ�
 	----------|Map:�����ʵ����Map�ӿڡ�����е��ص��ǣ��洢���ݶ����Լ�ֵ�Դ��ڵģ��������ظ���ֵ�����ظ�
	---------------|TreeMap��	
	---------------|HashMap��
 	---------------|HashTable��
 	
 	
 	
 	Map�ӿڵķ�����
 		��ӣ�
 			put(K key, V value)  
 			
 			putAll(Map<? extends K,? extends V> m) 
 		ɾ����
 			clear() 
 			remove(Object key)
 		��ȡ��
 			get(Object key) 
 			size() 
 		�жϣ�
 			containsValue(Object value)
 			containsKey(Object key) 
 			isEmpty() 
 		������
 			values() 
 			keySet() 
 			entrySet() 
 */
public class Demo1 {
	public static void main(String[] args) {
		Map<String,String> mp1 = new HashMap<String,String>();
		mp1.put("����", "����");
		mp1.put("����", "��Ψ");
		mp1.put("����", "��÷");
		mp1.put("�ƻ�", "��Ψ");
		mp1.put("����", "ԲԲ");
		System.out.println(mp1.put("����", "һ��"));//���֮ǰû�д��ڸü�ֵ����ô����null�����ڵĻ����᷵�ؼ���Ӧ����ǰ��ֵ
		System.out.println("�ü���Ԫ��Ϊ��"+mp1);
/*		���
		Map<String,String> mp2 = new HashMap<String,String>();
		mp2.put("����", "һ��");
		mp2.put("�ź�", "��Ψ");
		mp2.put("��ƽ", "����");
		mp1.putAll(mp2);
		System.out.println(mp1);
		
		ɾ��
		System.out.println("ɾ��������Ϊ��"+mp1.remove("�ƻ�"));
		System.out.println(mp1);
		mp1.clear();
		System.out.println(mp1);
		
		��ȡ
		System.out.println("��ȡ��ֵ��Ӧ��ֵ��"+mp1.get("����"));
		System.out.println("�ü��ϴ�СΪ��"+mp1.size());
		
		�ж�
		System.out.println("Map�����Ƿ�����˼�"+mp1.containsKey("����"));
		System.out.println("Map�����Ƿ�����˼�"+mp1.containsKey("����"));
		System.out.println("Map�����Ƿ������ֵ"+mp1.containsValue("��Ψ"));
		System.out.println("Map�����Ƿ������ֵ"+mp1.containsValue("����"));
		System.out.println(mp1.isEmpty());
		*/
		//����
	}
}
