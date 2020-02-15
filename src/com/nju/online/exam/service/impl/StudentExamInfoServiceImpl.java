package com.nju.online.exam.service.impl;

import com.nju.online.exam.dao.StudentExamInfoMapper;
import com.nju.online.exam.po.StudentExamInfo;
import com.nju.online.exam.service.StudentExamInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: StudentExamInfoServiceImpl</p>
 * <p>Description: </p>
 */

@Service
public class StudentExamInfoServiceImpl implements StudentExamInfoService {

    @Autowired
    private StudentExamInfoMapper studentExamInfoMapper;

    public List<StudentExamInfo> getStudentExamCountByClassId(int classId) {
        return studentExamInfoMapper.getStudentExamCountByClassId(classId);
    }

    public List<StudentExamInfo> getStudentExamInfo(int studentId) {
        return studentExamInfoMapper.getStudentExamInfo(studentId);
    }

    public List<StudentExamInfo> getAllStudentAvgScoreCount(int classId) {
        return studentExamInfoMapper.getAllStudentAvgScoreCount(classId);
    }

}
