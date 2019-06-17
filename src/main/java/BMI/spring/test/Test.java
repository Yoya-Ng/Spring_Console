package BMI.spring.test;

import BMI.spring.beans.IBMI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IBMI bmi = (IBMI)context.getBean("bmi");
        System.out.println("BMI = " +bmi.setHW(178,70));
    }
}
