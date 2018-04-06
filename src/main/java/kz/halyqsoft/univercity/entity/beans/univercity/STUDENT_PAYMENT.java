package kz.halyqsoft.univercity.entity.beans.univercity;

import org.r3a.common.entity.AbstractEntity;
import org.r3a.common.entity.EFieldType;
import org.r3a.common.entity.FieldInfo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Omarbek
 * @created Apr 3, 2017 3:14:15 PM
 */
@Entity
public class STUDENT_PAYMENT extends AbstractEntity {

	private static final long serialVersionUID = -7691848287100727089L;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID", nullable = false) })
	private STUDENT student;

	@FieldInfo(type = EFieldType.DATETIME, order = 2)
	@Column(name = "PAYMENT_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date paymentDate;

	@FieldInfo(type = EFieldType.DOUBLE, order = 3)
	@Column(name = "PAYMENT_SUM", nullable = false)
	private Double paymentSum;

	@Column(name = "CREATED", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	public STUDENT_PAYMENT() {
	}

	public STUDENT getStudent() {
		return student;
	}

	public void setStudent(STUDENT student) {
		this.student = student;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getPaymentSum() {
		return paymentSum;
	}

	public void setPaymentSum(Double paymentSum) {
		this.paymentSum = paymentSum;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
