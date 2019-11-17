package com.codeless.stumsgdemo.mapper;

import java.util.List;

import com.codeless.stumsgdemo.vo.ManagerVo;
import com.codeless.stumsgdemo.vo.StudentVo;

/**
 * 需求: 管理员业务管理 可以查看所有学生信息 根据id或者名字查询学生信息 可以删除学生信息
 * 
 * @author CGQ
 * @version cgq.1.0
 */
public interface ManagerMapper {
	/**
	 * 根据账号密码登录
	 * @param ManagerVo
	 * @return ManagerVo
	 */
	public ManagerVo selByUp(ManagerVo sv);
	
	/**
	 * 查看所有学生信息
	 * 
	 * @param uname
	 * @return List<StudentVo>
	 */
	public List<StudentVo> selAll();

	/**
	 * 根据id或者名字查询学生信息
	 * 
	 * @param sv
	 * @return StudentVo
	 */
	public StudentVo selByIdName(StudentVo sv);
	
	/**
	 * 根据ID删除学生信息
	 * 
	 * @param id
	 * @return int 
	 */
	public int delById(int id);
}
