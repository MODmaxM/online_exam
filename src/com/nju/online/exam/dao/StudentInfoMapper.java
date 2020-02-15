package com.nju.online.exam.dao;

import com.nju.online.exam.po.StudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: StudentInfoMapper</p>
 * <p>Description: </p>
 */

@Repository
public interface StudentInfoMapper {

    public List<StudentInfo> getStudents(Map<String, Object> map);

    public StudentInfo getStudentById(int studentId);

    public int isUpdateStudent(StudentInfo student);

    public int isDelStudent(int studentId);

    public int isAddStudent(StudentInfo student);

    public int getStudentTotal();

    public StudentInfo getStudentByAccountAndPwd(String studentAccount);

    public int isResetPwdWithStu(StudentInfo studentInfo);

    public List<StudentInfo> getStudentsByClassId(int classId);
}
