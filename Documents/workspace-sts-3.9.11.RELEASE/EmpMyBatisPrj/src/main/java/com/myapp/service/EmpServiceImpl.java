package com.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.dao.DeptDao;
import com.myapp.dao.EmpDao;
import com.myapp.domain.Dept;
import com.myapp.domain.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;
	@Autowired
	private DeptDao deptDao;

	public List<Dept> getAllDepts() {
		return deptDao.getAllDepts();
	}

	@Transactional
	public Emp selectEmp(int empno) {
		Emp emp = empDao.selectEmp(empno);
		return emp;
	}

	public List<Integer> getAllEmpno() {
		return empDao.getAllEmpno();
	}

	public void insertEmp(Emp emp) {
		empDao.insertEmp(emp);
	}

	public List<Emp> getAllEmps() {
		return empDao.getAllEmps();
	}

	public void updateEmp(Emp emp) {
		empDao.updateEmp(emp);
	}

	public void deleteEmp(int empno) {
		empDao.deleteEmp(empno);
	}
}