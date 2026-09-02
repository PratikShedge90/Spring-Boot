package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="Student.findAllByGreaterThanPerAndGender", 
			query="select s from Student s where s.per>= :per and s.gender=:gender")

@NamedQuery(name="Student.updateName", 
			query="update Student s set s.name=:userName where s.rno=:UserRno")

@NamedQuery(name= "Student.findGenderAndName",
			query= "select s.name,s.gender from Student s")

@NamedQuery(name= "Student.countByGender",
			query="select s.gender, count(s) from Student s group by s.gender")
public class Student 
{
	@Id
	private Integer rno;
	private String name;
	private Double per;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private LocalDate birthDate;
}
