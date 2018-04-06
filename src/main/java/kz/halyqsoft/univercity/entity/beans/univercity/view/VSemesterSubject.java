package kz.halyqsoft.univercity.entity.beans.univercity.view;

import org.r3a.common.entity.AbstractEntity;
import org.r3a.common.entity.EFieldType;
import org.r3a.common.entity.FieldInfo;

/**
 * @author Dinassil Omarbek
 * @created Apr 28, 2017 3:44:32 PM
 */
public final class VSemesterSubject extends AbstractEntity {

	private static final long serialVersionUID = 9078213114619790341L;

	@FieldInfo(type = EFieldType.TEXT, order = 2, columnWidth = 130)
	private String code;

	@FieldInfo(type = EFieldType.TEXT, order = 3)
	private String subjectName;

	@FieldInfo(type = EFieldType.TEXT, order = 4, columnWidth = 200)
	private String chairName;

	@FieldInfo(type = EFieldType.TEXT, order = 5, columnWidth = 120)
	private String levelName;

	@FieldInfo(type = EFieldType.TEXT, order = 6, columnWidth = 120)
	private String controlType;

	@FieldInfo(type = EFieldType.INTEGER, order = 7, columnWidth = 100)
	private int credit;

	@FieldInfo(type = EFieldType.TEXT, order = 8, columnWidth = 120)
	private String formula;

	public VSemesterSubject() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getChairName() {
		return chairName;
	}

	public void setChairName(String chairName) {
		this.chairName = chairName;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getControlType() {
		return controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

}
