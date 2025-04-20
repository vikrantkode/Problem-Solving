package oopsConcepts.test;

public class Student {
     private String name;
     private int age;
     private String schoolName;
     private String grade;
     private int rollNo;
     private String address;

     public Student(){
          this.age = 10;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          if(age < 0){
               System.out.println("Invalid Age");
          } else {
               this.age = age;
          }
     }

     public String getSchoolName() {
          return schoolName;
     }

     public void setSchoolName(String schoolName) {
          this.schoolName = schoolName;
     }

     public String getGrade() {
          return grade;
     }

     public void setGrade(String grade) {
          this.grade = grade;
     }

     public int getRollNo() {
          return rollNo;
     }

     public void setRollNo(int rollNo) {
          this.rollNo = rollNo;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }
}
