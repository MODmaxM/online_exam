package com.nju.online.exam.service;

import com.nju.online.exam.po.ExamSubjectMiddleInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ExamSubjectMiddleInfoService</p>
 * <p>Description: </p>
 */

@Repository
public interface ExamSubjectMiddleInfoService {

    public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(ExamSubjectMiddleInfo esm);

    public int isAddESM(Map<String, Object> map);

    public int removeSubjectWithExamPaper(Map<String, Object> map);

    public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm);
}
