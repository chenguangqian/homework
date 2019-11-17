package com.codeless.stumsgdemo.vo;
/**
 * 需求:	
 * 		学生实体类
 * 			学生属性
 * @author CGQ
 * @version cgq.1.0
 */
public class StudentVo {
		//学生属性
		private int stuno;//学生编号
		private String sname;//学生名字
		private int age;//学生年龄
		private double tele;//学生电话号码
		private String addr;//学生家庭地址
		private String username;//学生账号名称
		private int psd;//学生账号密码

		public int getStuno() {
			return stuno;
		}

		public void setStuno(int stuno) {
			this.stuno = stuno;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getTele() {
			return tele;
		}

		public void setTele(double tele) {
			this.tele = tele;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public int getPsd() {
			return psd;
		}

		public void setPsd(int psd) {
			this.psd = psd;
		}

		@Override
		public String toString() {
			return "StudentVo [stuno=" + stuno + ", sname=" + sname + ", age=" + age + ", tele=" + tele + ", addr="
					+ addr + ", username=" + username + ", psd=" + psd + "]";
		}

		
	
		
}
