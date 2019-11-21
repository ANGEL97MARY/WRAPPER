package com.Spring.bean.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Spring.bean.admin.beans.Student;

import java.util.List;

@Repository
public interface studentRepo  extends JpaRepository<Student,Integer>{
List<Student> findByName(String name);
List<Student> findByIdBetween(Integer start,Integer stop);
@Query("select u from u where u.password=?1")
Student findByPassword(String password);
}
