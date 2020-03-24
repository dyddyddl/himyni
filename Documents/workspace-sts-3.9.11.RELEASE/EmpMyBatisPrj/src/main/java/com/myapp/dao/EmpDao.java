package com.myapp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.myapp.domain.Emp;

public class EmpDao {
	public interface EmpMapper {
		Emp selectEmp(@Param("empno") int empno);

		List<Integer> getAllEmpno();

		void insertEmp(Emp emp);

		List<Emp> getAllEmps();

		String[] getColumnNames();

		void updateEmp(Emp emp);

		void deleteEmp(int empno);
	}

	public Emp selectEmp(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getAllEmpno() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertEmp(Emp emp) {
		// TODO Auto-generated method stub
		
	}

	public List<Emp> getAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmp(int empno) {
		// TODO Auto-generated method stub
		
	}
}