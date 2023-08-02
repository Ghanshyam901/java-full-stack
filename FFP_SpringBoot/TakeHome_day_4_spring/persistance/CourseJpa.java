package com.example.demo.persistance;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Course;


public interface CourseJpa extends JpaRepository<Course, Integer> {

	

	@Query("from Course where course_id=?1")
	public Course findCourseByCourseId(int id);
	
	
	  @Query("from Course where course_name=?1")
	    public Course searchCourseByName(String name);
	  
//	  @Query("from Course where course_name=?1")
//	  public boolean searchCourseByName2(String name);
	
}
