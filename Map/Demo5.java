package cn.itcast.Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 	����Map����
 		1.keySet   ��ȡ��
 		2.value    ��ȡֵ
 		3.entrySet ��ȡ����ֵ
 */
public class Demo5 {
	public static void main(String[] args) {
		Map<String,String> mp2 = new HashMap<String,String>();
		mp2.put("����", "����");
		mp2.put("����", "��Ψ");
		mp2.put("����", "��÷");
		mp2.put("�ƻ�", "��Ψ");
		mp2.put("����", "ԲԲ");
		mp2.put("����", "һ��");
//		1.keySet   ��ȡ��    �޷���ȡֵ��Ҫ������ֵ����������һ��
		Set<String> keys = mp2.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("����"+key+" ֵ��"+mp2.get(key));
		}
//		2.value    ��ȡֵ
		Collection<String> c = mp2.values();
		Iterator<String> it1 = c.iterator();
		while(it1.hasNext()) {
			System.out.println("ֵ��"+it1.next());
		}
//		3.entrySet ��ȡ����ֵ
		Set<Entry<String, String>> s = mp2.entrySet();
		Iterator<Entry<String,String>> it2 = s.iterator();
		while(it2.hasNext()) {
			Entry<String,String> e = it2.next();
			System.out.println("����"+e.getKey()+" ֵ��"+e.getValue());
		}
	}
}
