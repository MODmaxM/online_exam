package com.nju.online.exam.test;

import com.nju.online.exam.po.ClassInfo;
import com.nju.online.exam.po.StudentInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Title: TeacherInfoTest</p>
 * <p>Description: 学生测试</p>
 */

@SuppressWarnings("all")
public class StudentInfoTest {

    private SqlSessionFactory sqlSessionFactory;

    public void init() throws Exception {
        InputStream is = Resources.getResourceAsStream("test/SqlMapConfig-test.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void test2() throws Exception {
        init();

        StudentInfo student = new StudentInfo();
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClassId(1);
        student.setClassInfo(classInfo);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("student", student);
        map.put("startIndex", 0);
        map.put("pageShow", 3);

        SqlSession session = sqlSessionFactory.openSession();
        List<StudentInfo> students = session.selectList("getStudents", map);
        System.out.println(students);

        session.close();
    }
}
