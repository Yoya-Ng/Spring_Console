package hello.spring.test;

import hello.spring.beans.ILottoSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LottoText {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ILottoSpring lotto = (ILottoSpring)context.getBean("lotto5");
        //ILottoSpring lotto2 = (ILottoSpring)context.getBean("lotto2");
        lotto.print();
        //lotto2.print();
    }
}
