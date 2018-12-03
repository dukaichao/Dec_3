package cn.itcast.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//需求：统计字符串个数
public class Demo9 {
	public static void main(String[] args) {
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		String str = "agdagsgsgdhshsasas";
		char[] c = str.toCharArray();
		for(int i = 0;i<str.length();i++) {
			int count = 1;
			if(!mp.containsKey(c[i])) {
				mp.put(c[i], count);
				for(int j = i+1;j<str.length();j++) {
					if(c[i] == c[j]) {
						mp.put(c[j], ++count);
					}
				}
			}
			else continue;
			
		}
		for(Map.Entry<Character, Integer> e:mp.entrySet()) {
			System.out.println(e.getKey()+" 出现"+e.getValue()+"次");
		}
		
	}
}
