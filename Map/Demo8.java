package cn.itcast.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//遍历Map集合
public class Demo8 {
	public static void main(String[] args) {
		Map<String,String> mp = new HashMap<String,String>();
		mp.put("凯", "腾");
		mp.put("豆", "子");
		mp.put("依", "依");
		mp.put("土", "皮");
		mp.put("猪", "瑶");
		mp.put("军", "军");
		/*Set<Entry<String,String>> entry = mp.entrySet();
		Iterator<Entry<String,String>> it = entry.iterator();
		while(it.hasNext()) {
			Entry<String,String> e = it.next();
			System.out.println("键："+e.getKey()+" 值："+e.getValue());
		}*/
		/*for(Map.Entry<String, String> e:mp.entrySet()) {
			System.out.println("键："+e.getKey()+" 值："+e.getValue());
		}*/
		Set<String> s = mp.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println("键："+s1+" 值："+mp.get(s1));
		}
	}
}
