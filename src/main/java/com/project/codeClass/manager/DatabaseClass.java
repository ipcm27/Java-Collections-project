package com.project.codeClass.manager;

import java.util.List;

public class DatabaseClass extends Class {

	private static final String[] DATABASE_CLASS_STUDENTS = { "Vitor Hugo Lima", "Esther Rodrigues",
			"Nathan Nascimento", "Lav�nia Cunha", "Nat�lia Gomes", "Dra. Lav�nia Lopes", "Yago Ramos", "Let�cia Cunha",
			"Luiz Miguel Azevedo", "Srta. Ana J�lia Ramos", "Thales Farias", "Dra. Alana Porto" };

	private String className;
	private List<Student> studentsList;

	public DatabaseClass(String className) {
		super();
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getStudentsList() {
		if (this.studentsList.isEmpty()) {
			this.setStudentsList(studentsList);
		}
		return studentsList;
	}

	public void setStudentsList(List<Student> studentsList) {
		for (String studentName : DatabaseClass.DATABASE_CLASS_STUDENTS) {
			this.studentsList.add(new Student(studentName));
		}
		this.studentsList = studentsList;
	}
}
