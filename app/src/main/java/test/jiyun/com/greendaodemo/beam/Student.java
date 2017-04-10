package test.jiyun.com.greendaodemo.beam;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lenovo on 2017/4/9.
 */
@Entity
public class Student {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String sex;
    @Generated(hash = 1620742030)
    public Student(Long id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
