package db;

import beans.TestBean;
import org.springframework.stereotype.Component;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MapperClass implements RowMapper<TestBean> {
//데이터베이서 쿼리 결과를 TestBean으로 매핑하는 역할
    @Override
    public TestBean mapRow(ResultSet rs, int rowNum) throws SQLException{
        TestBean bean = new TestBean();

        bean.setNum1(rs.getInt("num1"));
        bean.setStr1(rs.getString("str1"));

        return bean;
    }
}
