package ex.ex13;

import java.util.ArrayList;
import java.util.List;

class Branch {
    //Branch=支店クラス（従業員クラスをさらに分割)
    private String name;
    private List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee(1,"やまだ","男",35));
        employees.add(new Employee(2,"たけだ","女",22));
        employees.add(new Employee(3,"はまだ","男",42));

        initSales(employees.get(0),100);
        initSales(employees.get(1),300);
        initSales(employees.get(2),200);
    }

    public static void initSales(Employee employee,int value) {
        for (int i = 1; i <= 12; i++) {
            employee.setSales(i,value);
        }
    }

    public Branch(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Employee> getEmployees(){
        return new ArrayList<Employee>(employees);
    }
}