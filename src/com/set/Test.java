package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		//����һ��HashSet����
		HashSet s = new HashSet();
		//�������
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("a");
		s.add(1);
		
		//������
		Iterator iterator = s.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+"\t");
		}
		
		System.out.println("\n---------------------------------");
		//����һ��TreeSet
		TreeSet s2 = new TreeSet();
		s2.add("c");
		s2.add("a");
		s2.add("b");
		//s2.add(1);//TreeSetֻ�ܴ��ͬһ����
		
		//������
		Iterator i = s2.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+"\t");
		}
		
	}

}
