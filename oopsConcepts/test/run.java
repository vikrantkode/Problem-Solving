package oopsConcepts.test;

import oopsConcepts.inherit.multipleInheritance.humans.Child;
import oopsConcepts.inherit.multipleInheritance.humans.Parents;

public class run {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Vikrant Singh");
//        student.setAge(-2);
//        student.setSchoolName("DAV");
//        student.setGrade("11th");
//        student.setRollNo(15);
//        student.setAddress("Sector-93, Noida");
//
//        System.out.println("Name: " + student.getName());
//        System.out.println("Age: " + student.getAge());
//        System.out.println("School Name: " + student.getSchoolName());
//        System.out.println("Grade: " + student.getGrade());
//        System.out.println("Roll No: " +student.getRollNo());
//        System.out.println("Address: "+student.getAddress());
//        System.out.println("================================================");
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber(33804341);
//        bankAccount.deposit(-100);
//        bankAccount.withdraw(100);
//        bankAccount.deposit(1100);
//        bankAccount.withdraw(200);
//        System.out.println(bankAccount.getBalance());

        System.out.println("=====================================================");
        Child child = new Child();
        child.setName("Vikrant Singh");
        child.setAge(22);
        child.sayHello();
        System.out.println("Name: " + child.getName());
        System.out.println("Age: " + child.getAge());

        Parents parents = new Parents();
        parents.setName("Raj Kumar Singh");
        parents.setAge(50);
        System.out.println("Name: " + parents.getName());
        System.out.println("Age: " + parents.getAge());
    }
}
