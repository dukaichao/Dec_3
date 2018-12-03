package cn.itcast.Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 	遍历Map集合
 		1.keySet   获取键
 		2.value    获取值
 		3.entrySet 获取键和值
 */
public class Demo5 {
	public static void main(String[] args) {
		Map<String,String> mp2 = new HashMap<String,String>();
		mp2.put("张三", "李四");
		mp2.put("伯雄", "汤唯");
		mp2.put("熙来", "杨梅");
		mp2.put("计划", "汤唯");
		mp2.put("永康", "圆圆");
		mp2.put("子腾", "一线");
//		1.keySet   获取键    无法获取值，要是想获得值必须像下面一样
		Set<String> keys = mp2.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("键："+key+" 值："+mp2.get(key));
		}
//		2.value    获取值
		Collection<String> c = mp2.values();
		Iterator<String> it1 = c.iterator();
		while(it1.hasNext()) {
			System.out.println("值："+it1.next());
		}
//		3.entrySet 获取键和值
		Set<Entry<String, String>> s = mp2.entrySet();
		Iterator<Entry<String,String>> it2 = s.iterator();
		while(it2.hasNext()) {
			Entry<String,String> e = it2.next();
			System.out.println("键："+e.getKey()+" 值："+e.getValue());
		}
	}
}
