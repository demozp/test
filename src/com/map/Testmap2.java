package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Testmap2 {

	public static void main(String[] args) {
		// 创建一个HashMap
		HashMap map = new HashMap();
		// 添加元素
		map.put(1001, "张三");
		map.put(1002, "李四");
		map.put(1003, "王五");
		
		// 遍历map集合
		// 得到所有的键key的集合
		Set keys = map.keySet();
		// 遍历键的集合
		Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			// 取出键
			Integer key = (Integer) iterator.next();
			// 通过这个键取取值
			String str = (String) map.get(key);
			System.out.println(str);
		}

	}

}
