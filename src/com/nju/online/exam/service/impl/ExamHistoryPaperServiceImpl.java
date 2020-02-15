package com.nju.online.exam.service.impl;

import com.nju.online.exam.dao.ExamHistoryPaperMapper;
import com.nju.online.exam.po.ExamHistoryInfo;
import com.nju.online.exam.po.ExamHistoryPaper;
import com.nju.online.exam.service.ExamHistoryPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ExamHistoryPaperServiceImpl</p>
 * <p>Description: </p>
 */

@Service
public class ExamHistoryPaperServiceImpl implements ExamHistoryPaperService {

    @Autowired
    private ExamHistoryPaperMapper examHistoryPaperMapper;

    public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId) {
        return examHistoryPaperMapper.getExamHistoryToStudent(studentId);
    }

    public int isAddExamHistory(Map<String, Object> map) {
        return examHistoryPaperMapper.isAddExamHistory(map);
    }

    public int getHistoryInfoWithIds(Map<String, Object> map) {
        return examHistoryPaperMapper.getHistoryInfoWithIds(map);
    }

    public List<ExamHistoryInfo> getExamHistoryToTeacher() {
        return examHistoryPaperMapper.getExamHistoryToTeacher();
    }

}
