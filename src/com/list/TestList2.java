package com.list;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		//����һ��Arraylist
		ArrayList list = new ArrayList();
		//��������UserInfo
		UserInfo user1 = new UserInfo();//ͨ��set������������ֵ
		user1.setUserName("����");
		user1.setUserPwd("123465");
		//ͨ�����췽����������ֵ
		UserInfo user2 = new UserInfo("����", "123456");
		UserInfo user3 = new UserInfo("������", "qwerty");
		//��UserInfo�������ArrayList
		list.add(user1);//�Զ�ת��ΪObject
		list.add(user2);
		list.add(user3);
		//ɾ��
		String name = "����";
		UserInfo u2 = null;
		for (int i = 0; i < list.size(); i++) {
			//ȡ������
			u2  = (UserInfo)list.get(i);
			if(u2.getUserName().equals(name)){
				list.remove(i);
			}
		}
		
		//��������
		for (int i = 0; i < list.size(); i++) {
			//ȡ������
			UserInfo u = (UserInfo)list.get(i);
			System.out.println(u.getUserName()+"---"+u.getUserPwd());
		}
	}
}
