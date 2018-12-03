package cn.itcast.Map;
/*双列集合：
 	----------|Map:如果是实现了Map接口。其具有的特点是：存储数据都是以键值对存在的，键不可重复，值可以重复
	
	---------------| HashMap：底层实现哈希表
	
	---------------| TreeMap：基于红黑树的数据结构实现的。  特点：会对元素进行排序,根据键排序
	
	TreeMap注意事项：
		1.往TreeMap添加元素的时候，如果元素的键具备自然顺序特性进行排序存储
		2.往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性，那么该键所属的类实现Comparable接口
	
 	---------------| HashTable：jdk1.0出现   
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
		return "[name：" + name + " age：" + age + "]";
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
		mp2.put(new Preson("张三",18), "李四");
		mp2.put(new Preson("伯雄",78), "汤唯");
		mp2.put(new Preson("熙来",68), "杨梅");
		mp2.put(new Preson("计划",75), "汤唯");
		mp2.put(new Preson("永康",77), "圆圆");
		mp2.put(new Preson("子腾",78), "一线");
		System.out.println(mp2);
	}
}
