package test.jiyun.com.greendaodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import test.jiyun.com.greendaodemo.beam.Student;

public class MainActivity extends AppCompatActivity {
  private  StuDao  stu=new StuDao();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Student  student=new Student();
        student.setName("张硕");
        student.setSex("男");
        stu.insert(student);
    }
}
