package CreationalPattern.PrototypePattern;

import java.util.List;

/*
* JAVA/Design Pattern
[생성 패턴] 프로토타입 패턴(Prototype Pattern) 이해 및 예제

프로토타입은 주로 실제 제품을 만들기에 앞서 대략적인 샘플 정도의 의미로 사용되는 단어입니다.

프로토타입 패턴은 객체를 생성하는 데 비용(시간과 자원)이 많이 들고, 비슷한 객체가 이미 있는 경우에 사용되는 생성 패턴 중 하나입니다.

프로토타입 패턴은 Original 객체를 새로운 객체에 복사하여 우리의 필요에 따라 수정하는 메커니즘을 제공합니다.
* */
public class PrototypePatternTest {
    //main psvm
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees cloneNew = (Employees) emps.clone();
        Employees cloneNew1 = (Employees) emps.clone();

        List<String> list = cloneNew.getEmpList();
        list.add("John");
        List<String> list1 = cloneNew1.getEmpList();
        list1.remove("Pankaj");

        //sout
        System.out.println("emps List : " + emps.getEmpList());
        System.out.println("empsNew List : " + list);
        System.out.println("empsNew1 List : " + list1);

    }
}
