package com.tca.repository;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
//@ToString
//@Setter
//@Getter
@Data
public class Student 
{
	private Integer rno;
	private String name;
	private Double per;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(per, other.per) && Objects.equals(rno, other.rno);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, per, rno);
	}
}



interface A{ 
	void show();
}

interface B{
	void disp();
}

interface D extends A,B
{
	
}

class P implements D
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}


