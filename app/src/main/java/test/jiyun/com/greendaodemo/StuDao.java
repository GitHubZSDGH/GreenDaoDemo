package test.jiyun.com.greendaodemo;

import test.jiyun.com.greendaodemo.beam.Student;
import test.jiyun.com.greendaodemo.dao.StudentDao;

/**
 * Created by lenovo on 2017/4/9.
 */

public class StuDao {
    StudentDao stuDao=App.getDaoSession().getStudentDao();

    public void  insert(Student student){
         stuDao.insert(student);
    }

}
