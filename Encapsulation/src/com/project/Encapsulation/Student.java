package com.project.Encapsulation;

public class Student extends Teacher {
	int id;
	String name;
	String add;
	int marks;
	void setid(int id) {
		this.id=id;
	}
int getid() {
	return id;
}
	void setname(String name) {
		this.name=name;
	}
	String getname() {
		return name;
	}
	void setadd(String add) {
		this.add=add;
	}
	String getadd() {
		return add;
	}
	void setmarks(int marks) {
		this.marks=marks;
	}
	int getmarks() {
		return marks;
	}
}
