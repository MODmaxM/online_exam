package com.nju.online.exam.service;

import com.nju.online.exam.po.ExamChooseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ExamChooseInfoService</p>
 * <p>Description: </p>
 */

@Repository
public interface ExamChooseInfoService {

    public ExamChooseInfo getChooseWithIds(Map<String, Object> map);

    public int updateChooseWithIds(ExamChooseInfo examChoose);

    public int addChoose(Map<String, Object> map);

    public List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map);

    public List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map);
}
