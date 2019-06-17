package hello.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloSpring implements IHelloSpring {

    private List list;
    private Set set;
    private Map map;

    public HelloSpring() {
    }

    public HelloSpring(List list) {
        this.list = list;
    }

    public HelloSpring(Set set) {
        this.set = set;
    }

    public HelloSpring(Map map) {
        this.map = map;
    }

    @Override
    public void print() {
        System.out.println("Hello Spring");
       
    }

}
