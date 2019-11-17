package com.codeless.stumsgdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeless.stumsgdemo.mapper.ManagerMapper;
import com.codeless.stumsgdemo.vo.ManagerVo;
import com.codeless.stumsgdemo.vo.StudentVo;

/**
 * 需求: 处理管理员业务 可以查看所有学生信息 根据id或者名字查询学生信息 可以删除学生信息
 * 
 * @author CGQ
 * @version cgq.1.0
 */
@Service
public class ManagerService {
	// 注入代理对象
	@Autowired
	private ManagerMapper managerMapper;

	/**
	 * 管理员账号密码登录
	 * @param sv
	 * @return ManagerVo
	 */
	public ManagerVo selByUpService(ManagerVo mv) {
		// 调用登录方法
		ManagerVo managerVo = managerMapper.selByUp(mv);
		// 返回值
		return managerVo;

	}

	/**
	 * 可以查看所有学生信息
	 * 
	 * @return List<StudentVo>
	 */
	public List<StudentVo> selAllService() {
		// 调用查看所有学生信息方法
		List<StudentVo> sl = managerMapper.selAll();
		// 返回值
		return sl;
	}

	/**
	 * 根据id或者名字查询学生信息
	 * 
	 * @param sv
	 * @return StudentVo
	 */
	public StudentVo selByIdNameService(StudentVo sv) {
		// 调用根据id或者名字查询学生信息方法
		StudentVo stu = managerMapper.selByIdName(sv);
		// 返回值
		return stu;
	}

	/**
	 * 根据id删除学生信息
	 * 
	 * @param id
	 * @return int
	 */
	public int delByIdService(int id) {
		// 电泳根据id删除学生信息方法
		int del = managerMapper.delById(id);
		// 返回值
		return del;
	}
}
