package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Testmap2 {

	public static void main(String[] args) {
		// ����һ��HashMap
		HashMap map = new HashMap();
		// ���Ԫ��
		map.put(1001, "����");
		map.put(1002, "����");
		map.put(1003, "����");
		
		// ����map����
		// �õ����еļ�key�ļ���
		Set keys = map.keySet();
		// �������ļ���
		Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			// ȡ����
			Integer key = (Integer) iterator.next();
			// ͨ�������ȡȡֵ
			String str = (String) map.get(key);
			System.out.println(str);
		}

	}

}
