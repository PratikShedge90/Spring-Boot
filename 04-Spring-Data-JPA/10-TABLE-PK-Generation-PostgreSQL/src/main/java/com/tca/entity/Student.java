package com.tca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	
	@Id
	@TableGenerator(name="id_generator",
					pkColumnName = "gen_name",
					valueColumnName = "gen_value",
					pkColumnValue = "student_id",
					allocationSize = 100
					)
	@GeneratedValue(strategy= GenerationType.TABLE,
					generator = "id_generator")
	private Long id;
	
	private String name;
	
	private Double per;

	@Enumerated(EnumType.STRING)
	private Gender gender;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPer() {
		return per;
	}

	public void setPer(Double per) {
		this.per = per;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	

}
