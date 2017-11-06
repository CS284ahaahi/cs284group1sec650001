package Model;

import java.util.ArrayList;

public class Subject {
	private String name, code, section, ownerUser, semester, year;

	public Subject(String name, String code, String section, String ownerUser, String semester, String year) {
		super();
		this.name = name;
		this.code = code;
		this.section = section;
		this.ownerUser = ownerUser;
		this.semester = semester;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getOwnerUser() {
		return ownerUser;
	}

	public void setOwnerUser(String ownerUser) {
		this.ownerUser = ownerUser;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTableName() {
		//SJ_CS284_650001_1_2017
		return "SJ_"+code+"_"+section+"_"+semester+"_"+year;
	}
}
