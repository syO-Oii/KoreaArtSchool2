package com.maximum.koreaartschool.service;

import com.maximum.koreaartschool.dao.ApplicantMapper;
import com.maximum.koreaartschool.dto.Applicant;
import com.maximum.koreaartschool.dto.EvaluateScore;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantMapper applicantMapper;

    @Transactional
    public List<EvaluateScore> getAllApplicant(){
        return applicantMapper.selectAll();
    }

    // 평가위원별 대상자 평가
    @Transactional
    public List<EvaluateScore> getSelectedApplicant(String year, String rcrt, String dept, String deptNo){
        return applicantMapper.selectApplicantByOption(rcrt, deptNo);
    }

    @Transactional
    public List<EvaluateScore> getApplicantByDeptno(int deptNo){
        return applicantMapper.selectApplicantByDeptno(deptNo);
    }

}
