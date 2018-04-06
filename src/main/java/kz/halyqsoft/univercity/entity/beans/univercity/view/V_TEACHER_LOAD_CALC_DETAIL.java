package kz.halyqsoft.univercity.entity.beans.univercity.view;

import kz.halyqsoft.univercity.entity.beans.univercity.catalog.SEMESTER_PERIOD;
import org.r3a.common.entity.AbstractEntity;
import org.r3a.common.entity.EFieldType;
import org.r3a.common.entity.FieldInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * @author Omarbek
 * @created Mar 15, 2016 12:07:53 PM
 */
@Entity
public class V_TEACHER_LOAD_CALC_DETAIL extends AbstractEntity {

	private static final long serialVersionUID = -2803415215554398352L;

	@FieldInfo(type = EFieldType.TEXT, max = 10, order = 3, inEdit = false, inView = false, columnWidth = 90)
	@Column(name = "SUBJECT_CODE")
	private String subjectCode;
	
	@FieldInfo(type = EFieldType.TEXT, max = 10, order = 6, inEdit = false, inView = false)
	@Column(name = "SUBJECT_NAME")
	private String subjectName;
	
	@FieldInfo(type = EFieldType.INTEGER, max = 6, order = 14, inEdit = false, inView = false, columnWidth = 80)
	@Column(name = "CREDIT")
	private Integer credit;
	
	@FieldInfo(type = EFieldType.TEXT, order = 3, inEdit = false, inView = false, columnWidth = 90)
	@Column(name = "FORMULA")
	private String formula;
	
	@FieldInfo(type = EFieldType.FK_DIALOG, order = 18)
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "SEMESTER_PERIOD_ID", referencedColumnName = "ID")})
    private SEMESTER_PERIOD semesterPeriod;
	
	@FieldInfo(type = EFieldType.TEXT, order = 19)
	@Column(name = "SEMESTER_PERIOD_NAME")
	private String semesterPeriodName;
	
	@FieldInfo(type = EFieldType.INTEGER, order = 20)
	@Column(name = "STUDENT_COUNT")
	private Integer studentCount;
	
	@FieldInfo(type = EFieldType.INTEGER, order = 21)
	@Column(name = "LC_COUNT")
	private Integer lcCount;
	
	@FieldInfo(type = EFieldType.INTEGER, order = 22)
	@Column(name = "LB_COUNT")
	private Integer lbCount;
	
	@FieldInfo(type = EFieldType.INTEGER, order = 23)
	@Column(name = "PR_COUNT")
	private Integer prCount;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 24)
	@Column(name = "LC_HOUR")
	private Double lcHour;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 25)
	@Column(name = "LC_HOUR_TOTAL")
	private Double lcHourTotal;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 26)
	@Column(name = "LB_HOUR")
	private Double lbHour;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 27)
	@Column(name = "LB_HOUR_TOTAL")
	private Double lbHourTotal;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 28)
	@Column(name = "PR_HOUR")
	private Double prHour;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 29)
	@Column(name = "PR_HOUR_TOTAL")
	private Double prHourTotal;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 30)
	@Column(name = "TOTAL_HOUR")
	private Double totalHour;
	
	@FieldInfo(type = EFieldType.DOUBLE, order = 31)
	@Column(name = "TOTAL_CREDIT")
	private Double totalCredit;
	
	public V_TEACHER_LOAD_CALC_DETAIL() {
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public SEMESTER_PERIOD getSemesterPeriod() {
		return semesterPeriod;
	}

	public void setSemesterPeriod(SEMESTER_PERIOD semesterPeriod) {
		this.semesterPeriod = semesterPeriod;
	}

	public String getSemesterPeriodName() {
		return semesterPeriodName;
	}

	public void setSemesterPeriodName(String semesterPeriodName) {
		this.semesterPeriodName = semesterPeriodName;
	}

	public Integer getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(Integer studentCount) {
		this.studentCount = studentCount;
	}

	public Integer getLcCount() {
		return lcCount;
	}

	public void setLcCount(Integer lcCount) {
		this.lcCount = lcCount;
	}

	public Integer getLbCount() {
		return lbCount;
	}

	public void setLbCount(Integer lbCount) {
		this.lbCount = lbCount;
	}

	public Integer getPrCount() {
		return prCount;
	}

	public void setPrCount(Integer prCount) {
		this.prCount = prCount;
	}

	public Double getLcHour() {
		return lcHour;
	}

	public void setLcHour(Double lcHour) {
		this.lcHour = lcHour;
	}

	public Double getLcHourTotal() {
		return lcHourTotal;
	}

	public void setLcHourTotal(Double lcHourTotal) {
		this.lcHourTotal = lcHourTotal;
	}

	public Double getLbHour() {
		return lbHour;
	}

	public void setLbHour(Double lbHour) {
		this.lbHour = lbHour;
	}

	public Double getLbHourTotal() {
		return lbHourTotal;
	}

	public void setLbHourTotal(Double lbHourTotal) {
		this.lbHourTotal = lbHourTotal;
	}

	public Double getPrHour() {
		return prHour;
	}

	public void setPrHour(Double prHour) {
		this.prHour = prHour;
	}

	public Double getPrHourTotal() {
		return prHourTotal;
	}

	public void setPrHourTotal(Double prHourTotal) {
		this.prHourTotal = prHourTotal;
	}

	public Double getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(Double totalHour) {
		this.totalHour = totalHour;
	}

	public Double getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(Double totalCredit) {
		this.totalCredit = totalCredit;
	}
}
