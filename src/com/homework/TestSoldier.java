package com.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestSoldier {
	public static void main(String[] args) {
		//创建Scanner对象
		Scanner sc = new Scanner(System.in);
		//创建一个集合
		ArrayList list = new ArrayList(); 
		//功能选择
		int choose = 0;
		//是否继续
		String isGo = "n";
		//开始程序
		while(true){
			System.out.println("\n\n************招兵买马系统***********");
			System.out.println("1、添加\n2、删除\n3、查询\n4、退出\n请选择功能：");
			choose = sc.nextInt();
			//判断功能
			switch (choose) {
			case 1:
				do{
					//添加
					System.out.println("名字：");
					String name = sc.next();
					System.out.println("技能：");
					String skill = sc.next();
					System.out.println("武器：");
					String enginery = sc.next();
					//封装为Soldier类的对象
					Soldier so = new Soldier(name, skill, enginery);
					//这Soldier对象存入集合
					list.add(so);
					System.out.println("添加成功！\n");
					//是否继续
					System.out.println("是否继续，按Y继续？");
					isGo = sc.next();
				}while(isGo.equalsIgnoreCase("y"));
				
				break;
			case 2:
				//删除
				System.out.println("请输入需要删除的士兵名字：");
				String name = sc.next();
				//定义一个变量，表示是否存在
				boolean flag = false;
				//得到迭代器对象
				Iterator iterator = list.iterator();
				while(iterator.hasNext()){
					//取出Soldier
					Soldier s = (Soldier) iterator.next();
					//判断名字是否相同
					if(s.getName().equals(name)){
						flag = true;
						//迭代器的删除方法
						iterator.remove();
						System.out.println("删除成功！");
					}
				}
				
				//判断是否找到
				if(flag == false){
					System.out.println("没有此人！");
				}
				
				break;
			case 3:
				//查询，集合中取出所有的数据
				System.out.println("\n\n姓名\t技能\t武器\n");
				if(list.size() == 0){
					System.out.println("没有兵");
				}else{
					//得到迭代器对象
					Iterator i = list.iterator();
					while(i.hasNext()){
						//取出Soldier
						Soldier s = (Soldier) i.next();
						//信息打印
						System.out.println(s.getName()+"\t"+s.getSkill()+"\t"+s.getEnginery());
					}
				}
				
				
				break;
			case 4:
				System.out.println("感谢使用，正在退出......");
				return;
			default:
				break;
			}
			
		}

	}
}






