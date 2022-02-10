package com.project.codeClass.manager;

import java.util.List;

public class DatabaseClass extends Class {

	private static final String[] DATABASE_CLASS_STUDENTS = { "Vitor Hugo Lima", "Esther Rodrigues",
			"Nathan Nascimento", "Lavínia Cunha", "Natália Gomes", "Dra. Lavínia Lopes", "Yago Ramos", "Letícia Cunha",
			"Luiz Miguel Azevedo", "Srta. Ana Júlia Ramos", "Thales Farias", "Dra. Alana Porto" };

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
