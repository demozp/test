package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//���Ԫ��
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//��ͨforѭ��
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i).equals("c")){
//				list.remove("c");
//			}
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//foreachѭ������
//		for(Object obj:list){
//			System.out.println((String)obj);
//		}
		//ɾ��
//		for(Object obj: list){
//			if(obj.equals("a")){
//				list.remove(obj);//��Ҫ��foreach����������ü��ϵķ���ɾ��Ԫ��
//			}
//		}
//		
//		System.out.println("-------------ɾ����-----------");
//		//foreachѭ������
//		for(Object obj:list){
//			System.out.println((String)obj);
//		}

		//����������������
		//�õ�һ������������
		Iterator iterator = list.iterator();
		//����whileѭ��ʹ��
		while(iterator.hasNext()){//�ж��Ƿ�����һ������
			if(iterator.next().equals("b")){//ȡ����һ��Ԫ��
				iterator.remove();//ɾ��Ԫ��
			}
		}
		
		
		System.out.println("-------------ɾ����-----------");
		//foreachѭ������
		for(Object obj:list){
			System.out.println((String)obj);
		}
		
	}

}
