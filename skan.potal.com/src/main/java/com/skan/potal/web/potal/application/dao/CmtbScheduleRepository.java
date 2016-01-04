package com.skan.potal.web.potal.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skan.potal.web.potal.application.model.CmtbSchedule;
import com.skan.potal.web.potal.application.model.CmtbSchedulePK;

public interface CmtbScheduleRepository extends JpaRepository<CmtbSchedule, CmtbSchedulePK> {

	public List<CmtbSchedule> findByUserId (String userId) throws Exception;
	public List<CmtbSchedule> findByUserIdAndCmtbSchedulePK(String userId, CmtbSchedulePK cmtbSchedulePK) throws Exception;
	public List<CmtbSchedule> findByUserIdAndStdDate (String userId, String stdDate) throws Exception;
	
}
