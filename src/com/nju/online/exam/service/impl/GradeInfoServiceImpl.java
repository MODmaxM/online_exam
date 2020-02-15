package com.nju.online.exam.service.impl;

import com.nju.online.exam.dao.GradeInfoMapper;
import com.nju.online.exam.po.GradeInfo;
import com.nju.online.exam.service.GradeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: GradeInfoServiceImpl</p>
 * <p>Description: </p>
 */

@Service
public class GradeInfoServiceImpl implements GradeInfoService {

    @Autowired
    private GradeInfoMapper gradeInfoMapper;

    public List<GradeInfo> getGrades() {
        return gradeInfoMapper.getGrades();
    }

    public int isAddGrade(GradeInfo grade) {
        return gradeInfoMapper.isAddGrade(grade);
    }

    public int isDelGrade(int gradeId) {
        return gradeInfoMapper.isDelGrade(gradeId);
    }

    public int isUpdateGrade(GradeInfo grade) {
        return gradeInfoMapper.isUpdateGrade(grade);
    }

    public GradeInfo getGradeById(int gradeId) {
        return gradeInfoMapper.getGradeById(gradeId);
    }

}
