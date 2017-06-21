package com.skan.tms.web.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skan.tms.web.jpa.dto.CreditRatingDto;

/**
 * 
 * <pre>
 * Class Name  : CreditRatingJpaRepository.java
 * Description : 
 * Modification Information
 *
 *    수정일　　　 　　  		수정자　　　     			  수정내용
 *    ────────────   ─────────   ───────────────────────────────
 *    2016. 8. 18.        yh.Lee               최초생성
 * </pre>
 *
 * @author yh.Lee
 * @since 2016. 8. 18.
 * @version 
 *
 * Copyright (C) 2016 by SKAN Corp. All right reserved.
 */
public interface CreditRatingJpaRepository extends JpaRepository<CreditRatingDto, String>{

}