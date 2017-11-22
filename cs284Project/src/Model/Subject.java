package Model;

public class Subject {
	private int id;
	private String nameThai, nameEng, code, section, ownerUser, semester, year;
	private ClassList classList;
	private ExamResult exResult;
	private GradingCriteria gradeCri;
	private ExamCriteria examCri;
	private LogActivity log;

	public Subject(int id, String nameThai, String nameEng, String code, String section, String ownerUser,
			String semester, String year, ClassList classList, ExamResult exResult, GradingCriteria gradeCri,
			ExamCriteria examCri, LogActivity log) {
		this.id = id;
		this.nameThai = nameThai;
		this.nameEng = nameEng;
		this.code = code;
		this.section = section;
		this.ownerUser = ownerUser;
		this.semester = semester;
		this.year = year;
		this.classList = classList;
		this.exResult = exResult;
		this.gradeCri = gradeCri;
		this.examCri = examCri;
		this.log = log;
	}

	public String getNameThai() {
		return nameThai;
	}

	public void setNameThai(String nameThai) {
		this.nameThai = nameThai;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
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

	public ClassList getClassList() {
		return classList;
	}

	public void setClassList(ClassList classList) {
		this.classList = classList;
	}

	public ExamResult getExResult() {
		return exResult;
	}

	public void addExResult(StudentResult stuRes) {
		this.exResult.addStudentResult(stuRes);
	}

	public GradingCriteria getGradeCri() {
		return gradeCri;
	}

	public void setGradeCri(GradingCriteria gradeCri) {
		this.gradeCri = gradeCri;
	}

	public ExamCriteria getExamCri() {
		return examCri;
	}

	public void setExamCri(ExamCriteria examCri) {
		this.examCri = examCri;
	}

	public LogActivity getLog() {
		return log;
	}

	public void addLog(LogList log) {
		this.log.addLogList(log);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
