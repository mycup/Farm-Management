package com.skan.potal.web.potal.accountbook.dto;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.skan.potal.web.potal.application.model.CmtbUser;

/**
 * 개인코드 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table
public class PersonalCode implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** code. */
	@Id
	private String code;
	
	/** 상위코드. */
	@Column(nullable=true)
	private String upperCode;

	/** code_seq. */
	private Integer codeSeq;

	/** code_name. */
	private String codeName;

	/** code_comments. */
	private String codeComment;
	
	
	/////////////////////////////////////////////////////
	// Association 관계
	////////////////////////////////////////////////////

	/** 개인코드. */
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="upperCode", insertable=false, updatable=false , columnDefinition="",nullable=true)})
	private PersonalCode upperPersonalCode;
	
	/** cmtb_user. */
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns(
    		{
    				@JoinColumn(name="userId")
    			}
    		
    		)
	private CmtbUser cmtbUser;


	/**
	 * 생성자.
	 */
	public PersonalCode() {
	}

	/**
	 * code을 설정합니다..
	 * 
	 * @param code
	 *            code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * code을 가져옵니다..
	 * 
	 * @return code
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * cmtb_user을 설정합니다..
	 * 
	 * @param cmtbUser
	 *            cmtb_user
	 */
	public void setCmtbUser(CmtbUser cmtbUser) {
		this.cmtbUser = cmtbUser;
	}

	/**
	 * cmtb_user을 가져옵니다..
	 * 
	 * @return cmtb_user
	 */
	public CmtbUser getCmtbUser() {
		return this.cmtbUser;
	}

	/**
	 * code_seq을 설정합니다..
	 * 
	 * @param codeSeq
	 *            code_seq
	 */
	public void setCodeSeq(Integer codeSeq) {
		this.codeSeq = codeSeq;
	}

	/**
	 * code_seq을 가져옵니다..
	 * 
	 * @return code_seq
	 */
	public Integer getCodeSeq() {
		return this.codeSeq;
	}

	/**
	 * code_name을 설정합니다..
	 * 
	 * @param codeName
	 *            code_name
	 */
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	/**
	 * code_name을 가져옵니다..
	 * 
	 * @return code_name
	 */
	public String getCodeName() {
		return this.codeName;
	}

	/**
	 * code_comments을 설정합니다..
	 * 
	 * @param codeComments
	 *            code_comments
	 */
	public void setCodeComment(String codeComment) {
		this.codeComment = codeComment;
	}

	/**
	 * code_comments을 가져옵니다..
	 * 
	 * @return code_comments
	 */
	public String getCodeComment() {
		return this.codeComment;
	}

	/**
	 * 개인코드을 설정합니다..
	 * 
	 * @param upperPersonalCode
	 *            개인코드
	 */
	public void setUpperPersonalCode(PersonalCode upperPersonalCode) {
		this.upperPersonalCode = upperPersonalCode;
	}

	/**
	 * 개인코드을 가져옵니다..
	 * 
	 * @return 개인코드
	 */
	public PersonalCode getUpperPersonalCode() {
		return this.upperPersonalCode;
	}
	

	public String getUpperCode() {
		return upperCode;
	}

	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		PersonalCode other = (PersonalCode) obj;
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		return true;
	}

}
