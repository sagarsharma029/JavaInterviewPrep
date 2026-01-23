//Day 1 - Q4

package oops.encapsulation;

public class Employee {

    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        if(salary>0){
            this.salary = salary;
        }
        else{
            System.out.println("Salary Invalid!");
        }
    }

}
