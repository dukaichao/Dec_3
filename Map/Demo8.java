package cn.itcast.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//����Map����
public class Demo8 {
	public static void main(String[] args) {
		Map<String,String> mp = new HashMap<String,String>();
		mp.put("��", "��");
		mp.put("��", "��");
		mp.put("��", "��");
		mp.put("��", "Ƥ");
		mp.put("��", "��");
		mp.put("��", "��");
		/*Set<Entry<String,String>> entry = mp.entrySet();
		Iterator<Entry<String,String>> it = entry.iterator();
		while(it.hasNext()) {
			Entry<String,String> e = it.next();
			System.out.println("����"+e.getKey()+" ֵ��"+e.getValue());
		}*/
		/*for(Map.Entry<String, String> e:mp.entrySet()) {
			System.out.println("����"+e.getKey()+" ֵ��"+e.getValue());
		}*/
		Set<String> s = mp.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println("����"+s1+" ֵ��"+mp.get(s1));
		}
	}
}
