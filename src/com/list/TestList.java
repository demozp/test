package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ��ArrayList����
		ArrayList list = new ArrayList();
		//����ָ�����ӿڵķ�ʽ��������
		List l = new ArrayList();
		//ָ����С
		ArrayList list2 = new ArrayList(2);
		//��ʼ������
		ArrayList list3 = new ArrayList(list);
		// 
		List<Integer> asList = Arrays.asList(1,2,3,2,3,24,3,3);
		
		//�������
		list.add("a");//�������Զ���ת��Ϊ��Object
		list.add("b");
		list.add("c");
		list.add("c");
		list.add(123);
		//ָ��λ�����
		list.add(0, "z");
		//�滻
		list.set(1, "p");
		//ɾ��
		list.remove(0);//�±�
		list.remove("c");//ͨ������
		
		//System.out.println(list.size());
		//ѭ�����
		for (int i = 0; i < list.size(); i++) {
			//�����±�õ�ĳ��Ԫ��
			System.out.println(list.get(i));
		}
		

	}

}
