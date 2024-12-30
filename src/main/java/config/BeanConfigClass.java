package config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"beans","db"})
public class BeanConfigClass {

    @Bean
    public BasicDataSource source(){
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/sde");
        source.setUsername("root");
        source.setPassword("12345");

        return source; //스프링컨테이너에 빈으로 등록
    }

    @Bean
    public JdbcTemplate db(BasicDataSource source){
        //sql쿼리 실행 단순화해줌
        JdbcTemplate db = new JdbcTemplate(source);
        return db;
    }
}
