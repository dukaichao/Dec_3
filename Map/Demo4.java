package cn.itcast.Map;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;
import java.text.ParseException;

/*
 
 	需求：定义一个TreeMap，键值存储书对象，值存储书店名，按出版日期输出
 */

class Book{
	String name;
	String date;
	public Book(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		return "[name:" + name + " date:" + date + "]";
	}
}
class Comp implements Comparator<Book>{
	public int compare(Book o1, Book o2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = null;
		Date d2 = null;
		try {
			d1 = sdf.parse(o1.date);
			d2 = sdf.parse(o2.date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return d1.compareTo(d2);
		//return o1.date.compareTo(o2.date);
	}
	
}
public class Demo4 {
	public static void main(String[] args) {
		Comp c = new Comp();
		TreeMap<Book,String> t = new TreeMap<Book,String>(c);
		t.put(new Book("c语言从精通到不会","2018-9-8"), "新华书店");
		t.put(new Book("数据库从删库到跑路","2018-8-8"), "新华书店");
		t.put(new Book("Java数据结构和算法","2017-9-8"), "人民书店");
		t.put(new Book("Java从入门到精通","2018-7-8"), "第一书店");
		System.out.println(t);
		
	}
}
