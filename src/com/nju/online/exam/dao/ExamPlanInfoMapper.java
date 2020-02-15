package com.nju.online.exam.dao;

import com.nju.online.exam.po.ExamPlanInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface ExamPlanInfoMapper {

    public List<ExamPlanInfo> getExamPlans(Map<String, Object> map);

    public int isAddExamPlan(ExamPlanInfo examPlan);

    public int isUpdateExamPlan(ExamPlanInfo examPlan);

    public ExamPlanInfo getExamPlanById(int examPlanId);

    //查询学生待考信息
    public List<ExamPlanInfo> getStudentWillExam(Map<String, Object> map);

    public int isRemoveExamPlan(int examPlanId);
}
