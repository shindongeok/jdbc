package db;


import beans.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcDAO {

    //JDBC관리해주는 객체를 주입받고 있다.
    //(BeanConfigClass에서 돌려받은 객체의 주소값을 db라는 필드에 넣고 있다. -> 타입기준)
    @Autowired
    private JdbcTemplate db;

    @Autowired
    private  MapperClass mapper;

    public void in_sert(TestBean testBean){
        String sql = "insert into jdbc_table(num1,str1) values(?,?)";
        db.update(sql, testBean.getNum1(), testBean.getStr1());
    }

    public List<TestBean> sel_ect(){
        String sql="select num1,str1 from jdbc_table";
        //bean에 저장한 것 반환받음
        List<TestBean> li = db.query(sql, mapper);
        return li;
    }
    public void up_date(TestBean testBean){
        String sql="update jdbc_table set str1=? where num1 = ?";
        db.update(sql,testBean.getStr1(), testBean.getNum1());
    }
    public void de_lete(int n){
        String sql="delete from jdbc_table where num1= ?";
        db.update(sql,n);
    }
}
