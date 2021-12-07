package CreationalPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void setEmpList(List<String> empList) {
        this.empList = empList;
    }

    @Override
    protected Employees clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.empList) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}


