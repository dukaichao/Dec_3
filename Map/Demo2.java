package cn.itcast.Map;

import java.util.HashMap;
import java.util.TreeMap;

/*
 双列集合：
 	----------|Map:如果是实现了Map接口。其具有的特点是：存储数据都是以键值对存在的，键不可重复，值可以重复
	
	---------------| HashMap：底层实现哈希表
	
	---------------| TreeMap：
	
 	---------------| HashTable：
 */

class  Human{
	int age;
	String name;
	public String toString() {
		return "[name：" + name + " age：" + age + "]";
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
		mp1.put(new Human("张三",18), "李四");
		mp1.put(new Human("伯雄",78), "汤唯");
		mp1.put(new Human("熙来",68), "杨梅");
		mp1.put(new Human("计划",75), "汤唯");
		mp1.put(new Human("永康",77), "圆圆");
		mp1.put(new Human("伯雄",78), "一线");
		System.out.println(mp1);
	}
}
