package com.codeless.stumsgdemo.test;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeless.stumsgdemo.service.ManagerService;
import com.codeless.stumsgdemo.service.StudentService;
import com.codeless.stumsgdemo.vo.ManagerVo;
import com.codeless.stumsgdemo.vo.StudentVo;

/**
 * 需求: 测试类
 * 
 * @author CGQ
 * @version cgq.1.0
 */
public class JunitTest {
	/**
	 * 
	 */
	@Test
	public void getTest() {
		Scanner input = new Scanner(System.in);
		// int i=input.nextInt();
		// 获取spring核心配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		// 获取spring管理类的对象
		StudentService stus = context.getBean("studentService", StudentService.class);
		ManagerService mans =context.getBean("managerService",ManagerService.class);
		//提示信息
		System.out.println("==请问你是管理员还是学生==");
		System.out.println("=======1.学生=======");
		System.out.println("=======2.管理员======");
		System.out.println("请输入你的选择");
		int index=input.nextInt();
		if(index==1){
		// 提示信息
		System.out.println("欢迎来到学生用户界面面");
		System.out.println("!!!请先输入账号名和密码!!!");
		System.out.println("请输入账号名:");
		// 获取账号名
		String uname = input.next();
		// 提示信息
		System.out.println("请输入密码:");
		// 获取密码
		int password = input.nextInt();
		// 创建学生对象
		StudentVo sv = new StudentVo();
		// 设置参数
		sv.setUsername(uname);
		sv.setPsd(password);	
		// 调用登录方法
		StudentVo svlogin=stus.selByUpService(sv);
		while(true){
		if (svlogin!=null) {
			/**
			 * 1.根据账号名查看学生信息 2.修改姓名或者年龄或者联系方式
			 * 
			 */
			// 提示
			System.out.println("============登录成功============");
			System.out.println("===========1.查看您的信息==========");
			System.out.println("===========2.修改姓名或者年龄或者联系方式==========");
			System.out.println("===========3.退出学生界面==========");
			// 获取操作
			int i = input.nextInt();
			// 判断操作
			if (i == 1) {
				// 调用查看信息的方法
				StudentVo svshow=stus.selByUnameService(svlogin.getUsername());
				System.out.println(svshow);
			} else if (i == 2) {
				// 提示
				System.out.println("请输入修改信息(姓名、年龄或联系方式)");
				System.out.println("请输入姓名");
				// 获取姓名
				String sname = input.next();
				System.out.println("请输入年龄");
				// 获取年龄
				int age = input.nextInt();
				System.out.println("请输入联系方式");
				// 获取电话号码
				double tele = input.nextDouble();
				// 创建学生对象
				StudentVo svupd= new StudentVo();
				//设置参数
				svupd.setSname(sname);
				svupd.setAge(age);
				svupd.setTele(tele);
				svupd.setUsername(uname);
				// 调用修改方法
				stus.updByIdService(svupd);
				// 显示结果
				System.out.println("修改成功结果为:" );
				//调用显示
				StudentVo studentVo=stus.selByUnameService(uname);
				//输出
				System.out.println(studentVo);
			} else if (i == 3) {
				// 提示
				System.out.println("==退出学生界面==");
				// 退出
				break;
			}
		} else {
			// 提示
			System.out.println("账号名或密码错误!!!");
			System.out.println("再见");
			// 退出
			break;
		}
		}//while循环
		}else if(index==2){
			// 提示信息
			System.out.println("欢迎来到管理员用户界面面");
			System.out.println("!!!请先输入账号名和密码!!!");
			System.out.println("请输入账号名:");
			// 获取账号名
			String uname = input.next();
			// 提示信息
			System.out.println("请输入密码:");
			// 获取密码
			int password = input.nextInt();
			// 创建学生对象
			ManagerVo mv= new ManagerVo();
			// 设置参数
			mv.setUsername(uname);
			mv.setPsd(password);	
			// 调用登录方法
			ManagerVo mvlogin=mans.selByUpService(mv);
			while(true){
			if (mvlogin!=null) {
				/**
				 *  1.查看所有学生信息 
				 *  2.根据id或者名字查询学生信息
				 *  3.可以删除学生信息
				 *  4.退出学生界面
				 */
				// 提示
				System.out.println("============登录成功============");
				System.out.println("===========1.查看所有学生信息 ==========");
				System.out.println("===========2.根据编号或者名字查询学生信息==========");
				System.out.println("===========3.根据编号删除学生信息==========");
				System.out.println("===========4.退出管理员界面==========");
				// 获取操作
				int i = input.nextInt();
				// 判断操作
				if (i == 1) {
					System.out.println("以下为所有学生信息:");
					// 调用查看所有学生信息的方法
					List<StudentVo> sl=mans.selAllService();
					for (StudentVo sVo : sl) {
						System.out.println(sVo);
					}
				} else if (i == 2) {
					// 提示
					System.out.println("请输入编号或者名字查询学生信息");
					System.out.println("请输入姓名");
					// 获取姓名
					String sname = input.next();
					System.out.println("请输入编号");
					// 获取年龄
					int stuno = input.nextInt();
					// 创建学生对象
					StudentVo svsel= new StudentVo();
					//设置参数
					svsel.setSname(sname);
					svsel.setStuno(stuno);
					// 调用根据编号或者名字查询学生信息方法
					StudentVo svshow=mans.selByIdNameService(svsel);
					// 显示结果
					System.out.println("查询结果为:"+svshow);
				} else if (i == 3) {
					// 提示
					System.out.println("请输入删除学生信息的编号");
					//获取ID
					int stuno=input.nextInt();
					//调用根据编号删除学生信息
					int del=mans.delByIdService(stuno);
					System.out.println("删除"+del+"次");
				}else if(i == 4){
					// 提示
					System.out.println("==退出管理员界面==");
					// 退出
					break;
				}
			} else {
				// 提示
				System.out.println("账号名或密码错误!!!");
				System.out.println("再见");
				// 退出
				break;
			}
			}//while循环
		}
	}
}
