package com.map;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		//创建一个HashMap
		HashMap  map  = new HashMap();
		//添加元素
		map.put(1001, "张三");
		map.put(1002, "李四");
		//map.put(1001, "王五");//如果键相同，则替换
		//得到
		String str = (String) map.get(1001);
		System.out.println(str);
		
		//删除
		map.remove(1001);
		
		System.out.println("大小："+map.size());
	}

}
