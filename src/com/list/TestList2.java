package com.list;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		//创建一个Arraylist
		ArrayList list = new ArrayList();
		//创建几个UserInfo
		UserInfo user1 = new UserInfo();//通过set方法设置属性值
		user1.setUserName("张三");
		user1.setUserPwd("123465");
		//通过构造方法设置属性值
		UserInfo user2 = new UserInfo("李四", "123456");
		UserInfo user3 = new UserInfo("网麦子", "qwerty");
		//把UserInfo对象存入ArrayList
		list.add(user1);//自动转换为Object
		list.add(user2);
		list.add(user3);
		//删除
		String name = "张三";
		UserInfo u2 = null;
		for (int i = 0; i < list.size(); i++) {
			//取出对象
			u2  = (UserInfo)list.get(i);
			if(u2.getUserName().equals(name)){
				list.remove(i);
			}
		}
		
		//遍历集合
		for (int i = 0; i < list.size(); i++) {
			//取出对象
			UserInfo u = (UserInfo)list.get(i);
			System.out.println(u.getUserName()+"---"+u.getUserPwd());
		}
	}
}
