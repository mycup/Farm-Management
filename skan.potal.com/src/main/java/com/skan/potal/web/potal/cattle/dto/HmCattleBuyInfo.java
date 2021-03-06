package com.skan.potal.web.potal.cattle.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 구입기록 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table
@IdClass(HmCattlePK.class)
public class HmCattleBuyInfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 구 입 처. */
	private String buyStoreName;

	/** 구 입 일 자. */
	private Date buyDate;

	/** 비 고. */
	private String buyNote;

	/** 구입 연락처. */
	private String buyPhoneNumber;

	@Id
	private String entityDiscernNo;
	
	/** 한우(암소/수소) 개체관리기록부. */
	@ManyToOne
	@JoinColumn(name="entityDiscernNo" ,insertable = false, updatable = false, referencedColumnName="entityDiscernNo")
	private HmCattleRegister hmCattleRegister;

	/**
	 * 생성자.
	 */
	public HmCattleBuyInfo() {
	}
	
	public String getEntityDiscernNo() {
		return entityDiscernNo;
	}

	public void setEntityDiscernNo(String entityDiscernNo) {
		this.entityDiscernNo = entityDiscernNo;
	}



	/**
	 * 구 입 처을 설정합니다..
	 * 
	 * @param buyStoreName
	 *            구 입 처
	 */
	public void setBuyStoreName(String buyStoreName) {
		this.buyStoreName = buyStoreName;
	}

	/**
	 * 구 입 처을 가져옵니다..
	 * 
	 * @return 구 입 처
	 */
	public String getBuyStoreName() {
		return this.buyStoreName;
	}

	/**
	 * 구 입 일 자을 설정합니다..
	 * 
	 * @param buyDate
	 *            구 입 일 자
	 */
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	/**
	 * 구 입 일 자을 가져옵니다..
	 * 
	 * @return 구 입 일 자
	 */
	public Date getBuyDate() {
		return this.buyDate;
	}

	/**
	 * 비 고을 설정합니다..
	 * 
	 * @param buyNote
	 *            비 고
	 */
	public void setBuyNote(String buyNote) {
		this.buyNote = buyNote;
	}

	/**
	 * 비 고을 가져옵니다..
	 * 
	 * @return 비 고
	 */
	public String getBuyNote() {
		return this.buyNote;
	}

	/**
	 * 구입 연락처을 설정합니다..
	 * 
	 * @param buyPhoneNumber
	 *            구입 연락처
	 */
	public void setBuyPhoneNumber(String buyPhoneNumber) {
		this.buyPhoneNumber = buyPhoneNumber;
	}

	/**
	 * 구입 연락처을 가져옵니다..
	 * 
	 * @return 구입 연락처
	 */
	public String getBuyPhoneNumber() {
		return this.buyPhoneNumber;
	}

	/**
	 * 한우(암소/수소) 개체관리기록부을 설정합니다..
	 * 
	 * @param hmCattleRegister
	 *            한우(암소/수소) 개체관리기록부
	 */
	public void setHmCattleRegister(HmCattleRegister hmCattleRegister) {
		this.hmCattleRegister = hmCattleRegister;
	}

	/**
	 * 한우(암소/수소) 개체관리기록부을 가져옵니다..
	 * 
	 * @return 한우(암소/수소) 개체관리기록부
	 */
	public HmCattleRegister getHmCattleRegister() {
		return this.hmCattleRegister;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hmCattleRegister == null) ? 0 : hmCattleRegister.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		HmCattleBuyInfo other = (HmCattleBuyInfo) obj;
		if (hmCattleRegister == null) {
			if (other.hmCattleRegister != null) {
				return false;
			}
		} else if (!hmCattleRegister.equals(other.hmCattleRegister)) {
			return false;
		}
		return true;
	}

}
