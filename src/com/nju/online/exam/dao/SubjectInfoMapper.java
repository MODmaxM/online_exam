package com.nju.online.exam.dao;

import com.nju.online.exam.po.SubjectInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: SubjectInfoMapper</p>
 * <p>Description: </p>
 */

@Repository
public interface SubjectInfoMapper {

    public List<SubjectInfo> getSubjects(Map<String, Object> map);

    public SubjectInfo getSubjectWithId(int subjectId);

    public int getSubjectTotal();

    public int isAddSubject(SubjectInfo subject);

    public int isUpdateSubject(SubjectInfo subject);

    public int isDelSubject(int subjectId);

    //批量添加试题
    public int isAddSubjects(Map<String, Object> map);
}
