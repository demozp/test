package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个ArrayList对象
		ArrayList list = new ArrayList();
		//子类指向父类或接口的方式创建对象
		List l = new ArrayList();
		//指定大小
		ArrayList list2 = new ArrayList(2);
		//初始化集合
		ArrayList list3 = new ArrayList(list);
		// 
		List<Integer> asList = Arrays.asList(1,2,3,2,3,24,3,3);
		
		//添加数据
		list.add("a");//把数据自动的转换为了Object
		list.add("b");
		list.add("c");
		list.add("c");
		list.add(123);
		//指定位置添加
		list.add(0, "z");
		//替换
		list.set(1, "p");
		//删除
		list.remove(0);//下标
		list.remove("c");//通过对象
		
		//System.out.println(list.size());
		//循环输出
		for (int i = 0; i < list.size(); i++) {
			//根据下标得到某个元素
			System.out.println(list.get(i));
		}
		

	}

}
