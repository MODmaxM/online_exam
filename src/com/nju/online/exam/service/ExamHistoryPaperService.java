package com.nju.online.exam.service;

import com.nju.online.exam.po.ExamHistoryInfo;
import com.nju.online.exam.po.ExamHistoryPaper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ExamHistoryPaperService</p>
 * <p>Description: </p>
 */

@Repository
public interface ExamHistoryPaperService {

    //查询考试历史信息，针对前台学生查询
    public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId);

    public int isAddExamHistory(Map<String, Object> map);

    public int getHistoryInfoWithIds(Map<String, Object> map);

    public List<ExamHistoryInfo> getExamHistoryToTeacher();
}
