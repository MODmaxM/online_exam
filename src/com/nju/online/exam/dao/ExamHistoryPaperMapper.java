package com.nju.online.exam.dao;

import com.nju.online.exam.po.ExamHistoryInfo;
import com.nju.online.exam.po.ExamHistoryPaper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface ExamHistoryPaperMapper {

    //查询考试历史信息，针对前台学生查询
    public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId);

    public int isAddExamHistory(Map<String, Object> map);

    public int getHistoryInfoWithIds(Map<String, Object> map);

    //查询考试历史信息，针对后台教师查询
    public List<ExamHistoryInfo> getExamHistoryToTeacher();
}
