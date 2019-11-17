package com.codeless.stumsgdemo.mapper;

import com.codeless.stumsgdemo.vo.StudentVo;

/**
 * 需求：
 * 		学生业务管理
 * 			根据账号密码登录
 * 			根据账号名查看学生信息
 *          修改姓名或者年龄或者联系方式
 * @author CGQ
 * @version cgq.1.0
 */
public interface StudentMapper {
		/**
		 * 根据账号密码登录
		 * @param StudentVo
		 * @return StudentVo
		 */
		public StudentVo selByUp(StudentVo sv);
		
		/**
		 * 根据账号名查看学生信息
		 * @param string
		 * @return StudentVo
		 * 
		 */
		public StudentVo selByUname(String username);
		
		/**
		 * 根据账号名修改姓名或者年龄或者联系方式
		 * @param sv
		 * @return int
		 */
		public int updById(StudentVo sv);
}
