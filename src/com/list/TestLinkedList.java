package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//���Ԫ��
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		//��һ��λ�����
//		list.addFirst("z");
//		list.addLast("o");
		
		//���
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println(list.contains("a"));
	}

}
