package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enity.Department;

public interface DepartmentJpa extends JpaRepository<Department, Integer> {

}
