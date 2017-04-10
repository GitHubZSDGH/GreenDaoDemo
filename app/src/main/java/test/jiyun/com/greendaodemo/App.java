package test.jiyun.com.greendaodemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import test.jiyun.com.greendaodemo.dao.DaoMaster;
import test.jiyun.com.greendaodemo.dao.DaoSession;

/**
 * Created by lenovo on 2017/4/9.
 */

public class App extends Application {
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper=new DaoMaster.DevOpenHelper(getApplicationContext(),"stu.db",null);
        SQLiteDatabase  database=helper.getWritableDatabase();
        DaoMaster  daoMaster=new DaoMaster(database);
        daoSession=daoMaster.newSession();
    }
    public  static  DaoSession getDaoSession(){
        return  daoSession;
    }
}
