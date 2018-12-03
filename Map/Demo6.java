package cn.itcast.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	 1.分析以下需求，并用代码实现：
	(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
	(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
	(3)利用四种方式遍历Map集合中的内容，格式：key::value
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
		mp.put(new Student("豆子",21), "新阳");
		mp.put(new Student("猪瑶",20), "大墙");
		mp.put(new Student("肥依依",21), "忘了");
		mp.put(new Student("土皮",20), "灵源");
		mp.put(new Student("军军",20), "新阳");
		mp.put(new Student("子腾",21), "临平");
		mp.put(new Student("子腾",21), "临平");
		
/*		System.out.println("第一种");
		Set<Student> keys = mp.keySet();
		Iterator<Student> it = keys.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("键："+s+" 值："+mp.get(s));
		}
		
		System.out.println("第二种");
		Set<Entry<Student,String>> s = mp.entrySet();
		Iterator<Entry<Student, String>> it1 = s.iterator();
		while(it1.hasNext()) {
			Entry<Student,String> e = it1.next();
			System.out.println("键："+e.getKey()+" 值："+e.getValue());
		}
		
		System.out.println("第三种");
		Collection c = mp.values();
		Iterator it2 = c.iterator();
		while(it2.hasNext()) {
			System.out.println("值:"+it2.next());
		}
		*/
		System.out.println("第四种");
		for(Map.Entry<Student, String> e:mp.entrySet()) {
			System.out.println("键："+e.getKey()+" 值："+e.getValue());
		}
	}
}
