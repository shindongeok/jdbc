package main;



import beans.TestBean;
import config.BeanConfigClass;
import db.JdbcDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        JdbcDAO dao = ctx2.getBean(JdbcDAO.class);

//        TestBean t1 = new TestBean();
//        t1.setNum1(1);
//        t1.setStr1("하성");
//        dao.in_sert(t1);

//        TestBean t2 = new TestBean();
//        t2.setNum1(1);
//        t2.setStr1("왕휘");
//        dao.up_date(t2);

//        List<TestBean> li=dao.sel_ect();
//        for(TestBean t:li){
//            System.out.println(t.getNum1());
//            System.out.println(t.getStr1());
//        }

        dao.de_lete(1);





    }
}
