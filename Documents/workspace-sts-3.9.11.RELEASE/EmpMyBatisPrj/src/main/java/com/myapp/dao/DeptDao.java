package com.myapp.dao;

import java.util.List;
import com.myapp.domain.Dept;

public class DeptDao {
	public interface DeptMapper {
		List<Dept> getAllDepts();

		Dept getDept(int deptno);
	}

	public List<Dept> getAllDepts() {
		// TODO Auto-generated method stub
		return null;
	}
}