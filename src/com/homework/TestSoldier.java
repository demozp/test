package com.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestSoldier {
	public static void main(String[] args) {
		//����Scanner����
		Scanner sc = new Scanner(System.in);
		//����һ������
		ArrayList list = new ArrayList(); 
		//����ѡ��
		int choose = 0;
		//�Ƿ����
		String isGo = "n";
		//��ʼ����
		while(true){
			System.out.println("\n\n************�б�����ϵͳ***********");
			System.out.println("1�����\n2��ɾ��\n3����ѯ\n4���˳�\n��ѡ���ܣ�");
			choose = sc.nextInt();
			//�жϹ���
			switch (choose) {
			case 1:
				do{
					//���
					System.out.println("���֣�");
					String name = sc.next();
					System.out.println("���ܣ�");
					String skill = sc.next();
					System.out.println("������");
					String enginery = sc.next();
					//��װΪSoldier��Ķ���
					Soldier so = new Soldier(name, skill, enginery);
					//��Soldier������뼯��
					list.add(so);
					System.out.println("��ӳɹ���\n");
					//�Ƿ����
					System.out.println("�Ƿ��������Y������");
					isGo = sc.next();
				}while(isGo.equalsIgnoreCase("y"));
				
				break;
			case 2:
				//ɾ��
				System.out.println("��������Ҫɾ����ʿ�����֣�");
				String name = sc.next();
				//����һ����������ʾ�Ƿ����
				boolean flag = false;
				//�õ�����������
				Iterator iterator = list.iterator();
				while(iterator.hasNext()){
					//ȡ��Soldier
					Soldier s = (Soldier) iterator.next();
					//�ж������Ƿ���ͬ
					if(s.getName().equals(name)){
						flag = true;
						//��������ɾ������
						iterator.remove();
						System.out.println("ɾ���ɹ���");
					}
				}
				
				//�ж��Ƿ��ҵ�
				if(flag == false){
					System.out.println("û�д��ˣ�");
				}
				
				break;
			case 3:
				//��ѯ��������ȡ�����е�����
				System.out.println("\n\n����\t����\t����\n");
				if(list.size() == 0){
					System.out.println("û�б�");
				}else{
					//�õ�����������
					Iterator i = list.iterator();
					while(i.hasNext()){
						//ȡ��Soldier
						Soldier s = (Soldier) i.next();
						//��Ϣ��ӡ
						System.out.println(s.getName()+"\t"+s.getSkill()+"\t"+s.getEnginery());
					}
				}
				
				
				break;
			case 4:
				System.out.println("��лʹ�ã������˳�......");
				return;
			default:
				break;
			}
			
		}

	}
}






