package com.news;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestNews {
	//创建一个集合，存储新闻
	ArrayList list = new ArrayList();
	
	//main方法
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//创建本类对象
		TestNews t = new TestNews();
		//选择的功能
		int  choose = 0;
		//ID
		int newsId = 0;
		//让程序反复执行
		while(true){
			//打印菜单
			System.out.println("<<<<<<<<<<<<<<<<<<使用ArrayList实现新闻管理系统>>>>>>>>>>>>>>>>>>>");
			System.out.println("1.查询新闻\n2.添加新闻\n3.删除新闻\n4.退出\n请选择功能(1,2,3)");
			//选择功能
			choose = sc.nextInt();
			//判断是什么功能
			switch (choose) {
			case 1:
				//调用查询的方法
				t.showAllNews();
				break;
			case 2:
				//添加新闻
				//提示用户输入
				System.out.println("请输入新闻的ID：");
				newsId = sc.nextInt();//ＩＤ  101
				
				
				System.out.println("请输入新闻标题：");
//				sc = new Scanner(System.in);//解决读取之前的空格
				String newsTitle = sc.next();
				
				System.out.println("请输入内容");
				String newsContent = sc.next();
				//获取当前时间
				Date  d = new Date();
				//创建一个NewsInfo对象
				NewsInfo news = new NewsInfo(newsId, newsTitle, newsContent, d.toLocaleString());
				//调用添加方法
				t.addNews(news);
				break;
			case 3:
				//提示用户输入一个ID
				System.out.println("请输入你要删除的新闻ID");
				newsId = sc.nextInt();
				//调用删除的方法
				t.deleteNews(newsId);
				break;
			case 4:
				return;
			default:
				break;
			}
			
		}
	}
	
	
	//查询全部新闻
	public void showAllNews(){
		//标题
		System.out.println("编号\t标题\t内容\t发布时间");
		//从集合取数据
		if(list.size()==0){
			System.out.println("没有新闻内容");
		}else{
			//取数据
			for (int i = 0; i < list.size(); i++) {
				//取出对象，强制类型转换
				NewsInfo user = (NewsInfo)list.get(i);
				//取出数据
				System.out.println(user.getNewsId()+"\t"+user.getNewsTitle()+"\t"+user.getNewsContent()+"\t"+user.getNewsDate());
			}
		}
		
		System.out.println("\n\n");
	}
	
	//添加新闻
	public void addNews(NewsInfo news){
		//把这个对象存入到集合中
		list.add(news);
	}
	
	//删除新闻
	public void deleteNews(int newsId){
		//是否找到
		boolean flag = false;
		//找到对应的对象
		for (int i = 0; i < list.size(); i++) {
			//从集合取出对象
			NewsInfo news = (NewsInfo)list.get(i);
			//判断新闻编号
			if(news.getNewsId() == newsId){
				//删除
				list.remove(i);
				System.out.println("删除成功");
				//更改状态
				flag = true;
				break;
			}
		}
		//如果没找到则提示
		if(flag == false){
			System.out.println("没有找到该编号！");
		}
		
	}
	
	
}
