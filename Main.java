package lab_13122023;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Employee{
	int Id;
	String Name;
	String Address;
	String Tel;
	int NumOfDate;
	float Salary;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public int getNumOfDate() {
		return NumOfDate;
	}
	public void setNumOfDate(int numOfDate) {
		NumOfDate = numOfDate;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public int calSalary() {
		return (int) (Salary+ 3* NumOfDate);
	}
	public Employee(int id, String name, String address, String tel, int numOfDate, float salary) {
		super();
		Id = id;
		Name = name;
		Address = address;
		Tel = tel;
		NumOfDate = numOfDate;
		Salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	