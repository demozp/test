package com.map;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		//����һ��HashMap
		HashMap  map  = new HashMap();
		//���Ԫ��
		map.put(1001, "����");
		map.put(1002, "����");
		//map.put(1001, "����");//�������ͬ�����滻
		//�õ�
		String str = (String) map.get(1001);
		System.out.println(str);
		
		//ɾ��
		map.remove(1001);
		
		System.out.println("��С��"+map.size());
	}

}
