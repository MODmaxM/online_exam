package com.nju.online.exam.service;

import com.nju.online.exam.po.CourseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>Title: CourseInfoService</p>
 * <p>Description: </p>
 */

@Repository
public interface CourseInfoService {

    public List<CourseInfo> getCourses(CourseInfo course);

    public int isUpdateCourse(CourseInfo course);

    public int isAddCourse(CourseInfo course);

    public int isDelCourse(int courseId);

    public CourseInfo getCourseById(int courseId);
}
