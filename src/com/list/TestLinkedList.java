package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//添加元素
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		//第一个位置添加
//		list.addFirst("z");
//		list.addLast("o");
		
		//输出
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println(list.contains("a"));
	}

}
