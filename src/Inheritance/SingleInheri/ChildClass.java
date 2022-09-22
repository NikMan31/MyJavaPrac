package Inheritance.SingleInheri;

public class ChildClass extends ParentClass{
    public static void main(String[] args) {
        ChildClass c1=new ChildClass();
        c1.number();
        System.out.println("Substraction is " + (c1.firstNum- c1.secNum));
        c1.add();
    }
}
