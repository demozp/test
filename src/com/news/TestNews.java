package com.news;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestNews {
	//����һ�����ϣ��洢����
	ArrayList list = new ArrayList();
	
	//main����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�����������
		TestNews t = new TestNews();
		//ѡ��Ĺ���
		int  choose = 0;
		//ID
		int newsId = 0;
		//�ó��򷴸�ִ��
		while(true){
			//��ӡ�˵�
			System.out.println("<<<<<<<<<<<<<<<<<<ʹ��ArrayListʵ�����Ź���ϵͳ>>>>>>>>>>>>>>>>>>>");
			System.out.println("1.��ѯ����\n2.�������\n3.ɾ������\n4.�˳�\n��ѡ����(1,2,3)");
			//ѡ����
			choose = sc.nextInt();
			//�ж���ʲô����
			switch (choose) {
			case 1:
				//���ò�ѯ�ķ���
				t.showAllNews();
				break;
			case 2:
				//�������
				//��ʾ�û�����
				System.out.println("���������ŵ�ID��");
				newsId = sc.nextInt();//�ɣ�  101
				
				
				System.out.println("���������ű��⣺");
//				sc = new Scanner(System.in);//�����ȡ֮ǰ�Ŀո�
				String newsTitle = sc.next();
				
				System.out.println("����������");
				String newsContent = sc.next();
				//��ȡ��ǰʱ��
				Date  d = new Date();
				//����һ��NewsInfo����
				NewsInfo news = new NewsInfo(newsId, newsTitle, newsContent, d.toLocaleString());
				//������ӷ���
				t.addNews(news);
				break;
			case 3:
				//��ʾ�û�����һ��ID
				System.out.println("��������Ҫɾ��������ID");
				newsId = sc.nextInt();
				//����ɾ���ķ���
				t.deleteNews(newsId);
				break;
			case 4:
				return;
			default:
				break;
			}
			
		}
	}
	
	
	//��ѯȫ������
	public void showAllNews(){
		//����
		System.out.println("���\t����\t����\t����ʱ��");
		//�Ӽ���ȡ����
		if(list.size()==0){
			System.out.println("û����������");
		}else{
			//ȡ����
			for (int i = 0; i < list.size(); i++) {
				//ȡ������ǿ������ת��
				NewsInfo user = (NewsInfo)list.get(i);
				//ȡ������
				System.out.println(user.getNewsId()+"\t"+user.getNewsTitle()+"\t"+user.getNewsContent()+"\t"+user.getNewsDate());
			}
		}
		
		System.out.println("\n\n");
	}
	
	//�������
	public void addNews(NewsInfo news){
		//�����������뵽������
		list.add(news);
	}
	
	//ɾ������
	public void deleteNews(int newsId){
		//�Ƿ��ҵ�
		boolean flag = false;
		//�ҵ���Ӧ�Ķ���
		for (int i = 0; i < list.size(); i++) {
			//�Ӽ���ȡ������
			NewsInfo news = (NewsInfo)list.get(i);
			//�ж����ű��
			if(news.getNewsId() == newsId){
				//ɾ��
				list.remove(i);
				System.out.println("ɾ���ɹ�");
				//����״̬
				flag = true;
				break;
			}
		}
		//���û�ҵ�����ʾ
		if(flag == false){
			System.out.println("û���ҵ��ñ�ţ�");
		}
		
	}
	
	
}
