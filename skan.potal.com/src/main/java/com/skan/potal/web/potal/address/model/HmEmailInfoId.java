package com.skan.potal.web.potal.address.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 이메일 정보 composite - id 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Embeddable
public class HmEmailInfoId implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	
	/** 주소록 관리. */
	@ManyToOne
	@JoinColumn(name="hmMgNum")
	private HmMngAddress hmMngAddress;

	/** 순번. */
	private Long hmEmNo;

	/**
	 * 생성자.
	 */
	public HmEmailInfoId() {
	}

	/**
	 * 주소록 관리을 설정합니다..
	 * 
	 * @param hmMngAddress
	 *            주소록 관리
	 */
	public void setHmMngAddress(HmMngAddress hmMngAddress) {
		this.hmMngAddress = hmMngAddress;
	}

	/**
	 * 주소록 관리을 가져옵니다..
	 * 
	 * @return 주소록 관리
	 */
	public HmMngAddress getHmMngAddress() {
		return this.hmMngAddress;
	}

	/**
	 * 순번을 설정합니다..
	 * 
	 * @param hmEmNo
	 *            순번
	 */
	public void setHmEmNo(Long hmEmNo) {
		this.hmEmNo = hmEmNo;
	}

	/**
	 * 순번을 가져옵니다..
	 * 
	 * @return 순번
	 */
	public Long getHmEmNo() {
		return this.hmEmNo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hmMngAddress == null) ? 0 : hmMngAddress.hashCode());
		result = prime * result + ((hmEmNo == null) ? 0 : hmEmNo.hashCode());
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
		HmEmailInfoId other = (HmEmailInfoId) obj;
		if (hmMngAddress == null) {
			if (other.hmMngAddress != null) {
				return false;
			}
		} else if (!hmMngAddress.equals(other.hmMngAddress)) {
			return false;
		}
		if (hmEmNo == null) {
			if (other.hmEmNo != null) {
				return false;
			}
		} else if (!hmEmNo.equals(other.hmEmNo)) {
			return false;
		}
		return true;
	}

}
