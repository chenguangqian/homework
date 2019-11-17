package com.codeless.stumsgdemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeless.stumsgdemo.mapper.StudentMapper;
import com.codeless.stumsgdemo.vo.StudentVo;

/**
 * 需求: 处理学生的业务 学生账号密码登录 根据Id或姓名查看学生信息 修改姓名或者年龄或者联系方式
 * 
 * @author CGQ
 * @version cgq.1.0
 */
@Service
public class StudentService {
	// 注入代理对象
	@Autowired
	private StudentMapper studentMapper;

	/**
	 * 学生账号密码登录
	 * @param sv
	 */
	public StudentVo selByUpService(StudentVo sv) {
		//调用登录方法
		StudentVo studentVo = studentMapper.selByUp(sv);
		//返回值
		return studentVo;

	}
	/**
	 * 根据Id或姓名查看学生信息 
	 * @param name
	 */
	public StudentVo selByUnameService(String name) {
		//调用查询方法
		StudentVo studentVo = studentMapper.selByUname(name);
		//返回值
		return studentVo;
	}
	
	/**
	 * 修改姓名或者年龄或者联系方式
	 * @param sv
	 */
	public int updByIdService(StudentVo sv) {
		//调用修改方法
		int upd1 = studentMapper.updById(sv);
		//返回值
		return upd1;
	}

}
