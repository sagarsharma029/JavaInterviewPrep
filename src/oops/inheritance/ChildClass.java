//Day 3 - Q4

package oops.inheritance;

public class ChildClass  extends ParentClass{

    public ChildClass(){
        super();
        System.out.println("This is Child Class");
    }


    @Override
    public void show(){
        super.show();
        System.out.println("Data from child class");
        System.out.println("Child class inherited " + super.text);
    }
}
