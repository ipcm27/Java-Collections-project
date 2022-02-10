package com.project.codeClass.manager;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Class> classByName = new HashMap<String, Class>();

		Class javaClass = new JavaClass("Class1");
		classByName.put("Class1", javaClass);

		Class databaseClass = new DatabaseClass("Class2");
		classByName.put("Class2", javaClass);

		printClass(javaClass);
		printClass(databaseClass);

		printSchoolStudentsNames(classByName);
	}

	private static void printClass(Class pClass) {
		try {
			BufferedWriter br = getBufferedWritter(pClass.getClassName());

			if (br != null) {
				br.write(pClass.getClassName());
				br.newLine();
				br.write(pClass.getStudentsList().size());
				for (Student student : pClass.getStudentsList()) {
					br.write(student.getName());
				}
				br.newLine();
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void printSchoolStudentsNames(Map<String, Class> pClassByName) {
		List<String> schoolStudentsNames = getSchoolStudentsNames(pClassByName);
		Collections.sort(schoolStudentsNames);

		BufferedWriter br = getBufferedWritter("LetsCode School");
		try {
			if (br != null) {
				for (String studentName : schoolStudentsNames) {
					br.write(studentName);
					br.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<String> getSchoolStudentsNames(Map<String, Class> pClassByName) {
		List<String> schoolStudentsNames = new ArrayList<String>();
		for (Map.Entry<String, Class> iterator : pClassByName.entrySet()) {
			for (Student student : iterator.getValue().getStudentsList()) {
				if (!schoolStudentsNames.contains(student.getName())) {
					schoolStudentsNames.add(student.getName());
				}
			}
		}
		return schoolStudentsNames;
	}

	private static BufferedWriter getBufferedWritter(String fileName) {
		OutputStream os;
		Writer wr;
		BufferedWriter br = null;
		try {
			os = new FileOutputStream(fileName + ".txt");
			wr = new OutputStreamWriter(os);
			br = new BufferedWriter(wr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return br;
	}
}
