package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.enity.Employee;

public interface EmployeeJpa extends JpaRepository<Employee, Integer> {
	
	
	@Query("from Employee where dept_id=?1")
	public List<Employee> findEmpByDeptId(int id);
    
    //search of employee based on first_name or last_name
    @Query("from Employee where first_name=?1 or last_name=?2")
    public List<Employee> searchEmployees(String fname,String lname );
    
    
	@Query("from Employee where id=?1")
	public Employee findEmpById(int id);
	
}
