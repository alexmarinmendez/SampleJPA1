package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_no;
	private String birth_date;
	private String first_name;
	private String last_name;
	private char gender;
	private String hire_date;
	
	public Employees() {
	}

	public Employees(int emp_no, String birth_date, String first_name, String last_name, char gender,
			String hire_date) {
		this.emp_no = emp_no;
		this.birth_date = birth_date;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.hire_date = hire_date;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	@Override
	public String toString() {
		return "Employees [emp_no=" + emp_no + ", birth_date=" + birth_date + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", gender=" + gender + ", hire_date=" + hire_date + "]";
	}
}
