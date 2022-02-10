package com.project.codeClass.manager;

import java.util.List;




public class JavaClass extends Class {

	private static final String[] JAVA_CLASS_STUDENTS = { "Alexandre Martins", "Vitor Hugo Lima", "Esther Rodrigues",
			"Lav�nia Cunha", "Nat�lia Gomes", "Yago Ramos", "Let�cia Cunha", "Srta. Ana J�lia Ramos", "Pietra Martins",
			"Thomas Peixoto", "Thales Farias" };

	private String className;
	private List<Student> studentsList;

	public JavaClass(String className) {
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
		for (String studentName : JavaClass.JAVA_CLASS_STUDENTS) {
			this.studentsList.add(new Student(studentName));
		}
		this.studentsList = studentsList;
	}
}
