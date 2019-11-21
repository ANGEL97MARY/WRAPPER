package com.Spring.bean.admin.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="SPRING_STUDENT_TB")

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="STU_SEQ")
	@ SequenceGenerator(sequenceName="SPRING_SEQUENCE",allocationSize=1,name="STU_SEQ")
	
	
private int id;
private String name;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
