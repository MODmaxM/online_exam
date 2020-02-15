package com.nju.online.exam.dao;

import com.nju.online.exam.po.ExamSubjectMiddleInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface ExamSubjectMiddleInfoMapper {

    public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(ExamSubjectMiddleInfo esm);

    public int isAddESM(Map<String, Object> map);

    public int removeSubjectWithExamPaper(Map<String, Object> map);

    public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm);
}
