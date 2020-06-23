package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//添加元素
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//普通for循环
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i).equals("c")){
//				list.remove("c");
//			}
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//foreach循环遍历
//		for(Object obj:list){
//			System.out.println((String)obj);
//		}
		//删除
//		for(Object obj: list){
//			if(obj.equals("a")){
//				list.remove(obj);//不要在foreach或迭代器里用集合的方法删除元素
//			}
//		}
//		
//		System.out.println("-------------删除后-----------");
//		//foreach循环遍历
//		for(Object obj:list){
//			System.out.println((String)obj);
//		}

		//迭代器，遍历集合
		//得到一个迭代器对象
		Iterator iterator = list.iterator();
		//集合while循环使用
		while(iterator.hasNext()){//判断是否有下一个数据
			if(iterator.next().equals("b")){//取出下一个元素
				iterator.remove();//删除元素
			}
		}
		
		
		System.out.println("-------------删除后-----------");
		//foreach循环遍历
		for(Object obj:list){
			System.out.println((String)obj);
		}
		
	}

}
