package com.skan.potal.web.potal.cattle.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 송아지 기록 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table
public class HmCattleCalfRecode implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 송아지 기록 composite - id. */
	@EmbeddedId private HmCattleCalfRecodeId hmCattleCalfRecodeId;

	/** 한우(암소/수소) 개체관리기록부. */
	@ManyToOne
	@JoinColumn(name="entityDiscernNo" ,insertable=false, updatable=false)
	private HmCattleRegister hmCattleRegister;

	/** 성별. */
	private String gender;

	/** 판매여부. */
	private String sellYn;

	/** 태어난날?. */
	private Date birthday;

	/**
	 * 생성자.
	 */
	public HmCattleCalfRecode() {
	}

	/**
	 * 송아지 기록 composite - id을 설정합니다..
	 * 
	 * @param hmCattleCalfRecodeId
	 *            송아지 기록 composite - id
	 */
	public void setHmCattleCalfRecodeId(HmCattleCalfRecodeId hmCattleCalfRecodeId) {
		this.hmCattleCalfRecodeId = hmCattleCalfRecodeId;
	}

	/**
	 * 송아지 기록 composite - id을 가져옵니다..
	 * 
	 * @return 송아지 기록 composite - id
	 */
	public HmCattleCalfRecodeId getHmCattleCalfRecodeId() {
		return this.hmCattleCalfRecodeId;
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
	 * 성별을 설정합니다..
	 * 
	 * @param gender
	 *            성별
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 성별을 가져옵니다..
	 * 
	 * @return 성별
	 */
	public String getGender() {
		return this.gender;
	}

	/**
	 * 판매여부을 설정합니다..
	 * 
	 * @param sellYn
	 *            판매여부
	 */
	public void setSellYn(String sellYn) {
		this.sellYn = sellYn;
	}

	/**
	 * 판매여부을 가져옵니다..
	 * 
	 * @return 판매여부
	 */
	public String getSellYn() {
		return this.sellYn;
	}

	/**
	 * 태어난날?을 설정합니다..
	 * 
	 * @param birthday
	 *            태어난날?
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 태어난날?을 가져옵니다..
	 * 
	 * @return 태어난날?
	 */
	public Date getBirthday() {
		return this.birthday;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hmCattleCalfRecodeId == null) ? 0 : hmCattleCalfRecodeId.hashCode());
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
		HmCattleCalfRecode other = (HmCattleCalfRecode) obj;
		if (hmCattleCalfRecodeId == null) {
			if (other.hmCattleCalfRecodeId != null) {
				return false;
			}
		} else if (!hmCattleCalfRecodeId.equals(other.hmCattleCalfRecodeId)) {
			return false;
		}
		return true;
	}

}
