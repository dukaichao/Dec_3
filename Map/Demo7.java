package cn.itcast.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*(1)���ü���¼�룬����һ���ַ���
(2)ͳ�Ƹ��ַ����и����ַ�������
(3)�磺
	�û������ַ���"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
	������������-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
	 */
public class Demo7 {
	public static void main(String[] args) {
		System.out.println("�������ַ�����");
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		print(s1);
	}
	public static void print(String s) {
		char[] c = s.toCharArray();
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(int i = 0;i<c.length;i++) {
			int count = 1;
			if(!mp.containsKey(c[i])) {
				mp.put(c[i], count);
				for(int j = i+1;j<c.length;j++) {
					if(c[i] == c[j])
						mp.put(c[j], ++count);
				}
			}
			else continue;
		}
		for(Map.Entry<Character, Integer> e : mp.entrySet()) {
			System.out.println(e.getKey()+" ����"+e.getValue()+"��");
		}
	}
}
