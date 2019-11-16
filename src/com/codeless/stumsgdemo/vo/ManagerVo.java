package com.codeless.stumsgdemo.vo;
/**
 * 需求:
 * 		管理员实体类
 * 			属性
 * @author CGQ
 * @version cgq.1.0
 */
public class ManagerVo {
		//管理员属性
		private int mgrno;//管理员编号
		private String mgrname;//管理员姓名
		private String addr;//管理员家庭住址
		private String username;//管理员账号名称
		private int psd;//管理员账号密码
		public int getMgrno() {
			return mgrno;
		}
		public void setMgrno(int mgrno) {
			this.mgrno = mgrno;
		}
		public String getMgrname() {
			return mgrname;
		}
		public void setMgrname(String mgrname) {
			this.mgrname = mgrname;
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
			return "ManagerVo [mgrno=" + mgrno + ", mgrname=" + mgrname + ", addr=" + addr + ", username=" + username
					+ ", psd=" + psd + "]";
		}
		
}
