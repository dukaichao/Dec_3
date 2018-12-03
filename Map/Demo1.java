package cn.itcast.Map;

import java.util.HashMap;
import java.util.Map;

/*
 	双列集合：
 	----------|Map:如果是实现了Map接口。其具有的特点是：存储数据都是以键值对存在的，键不可重复，值可以重复
	---------------|TreeMap：	
	---------------|HashMap：
 	---------------|HashTable：
 	
 	
 	
 	Map接口的方法：
 		添加：
 			put(K key, V value)  
 			
 			putAll(Map<? extends K,? extends V> m) 
 		删除：
 			clear() 
 			remove(Object key)
 		获取：
 			get(Object key) 
 			size() 
 		判断：
 			containsValue(Object value)
 			containsKey(Object key) 
 			isEmpty() 
 		迭代：
 			values() 
 			keySet() 
 			entrySet() 
 */
public class Demo1 {
	public static void main(String[] args) {
		Map<String,String> mp1 = new HashMap<String,String>();
		mp1.put("张三", "李四");
		mp1.put("伯雄", "汤唯");
		mp1.put("熙来", "杨梅");
		mp1.put("计划", "汤唯");
		mp1.put("永康", "圆圆");
		System.out.println(mp1.put("伯雄", "一线"));//如果之前没有存在该键值，那么返回null，存在的话，会返回键对应的以前的值
		System.out.println("该集合元素为："+mp1);
/*		添加
		Map<String,String> mp2 = new HashMap<String,String>();
		mp2.put("伯雄", "一线");
		mp2.put("才厚", "汤唯");
		mp2.put("近平", "丽媛");
		mp1.putAll(mp2);
		System.out.println(mp1);
		
		删除
		System.out.println("删除的数据为："+mp1.remove("计划"));
		System.out.println(mp1);
		mp1.clear();
		System.out.println(mp1);
		
		获取
		System.out.println("获取键值对应的值："+mp1.get("伯雄"));
		System.out.println("该集合大小为："+mp1.size());
		
		判断
		System.out.println("Map集合是否包含此键"+mp1.containsKey("伯雄"));
		System.out.println("Map集合是否包含此键"+mp1.containsKey("子腾"));
		System.out.println("Map集合是否包含此值"+mp1.containsValue("汤唯"));
		System.out.println("Map集合是否包含此值"+mp1.containsValue("伯雄"));
		System.out.println(mp1.isEmpty());
		*/
		//迭代
	}
}
