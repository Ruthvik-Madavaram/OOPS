package com.demo;

class College{
    College(String cname){
        System.out.println("Studying in " + cname);
    }
    
}

interface Interests{
    void educationalSkills(String skill);
    void extraCurricularSkills(String skill);
}

class Address{
    String street,state,country;
    Address(String street, String state, String country){
        this.street = street;
        this.state = state;
        this.country = country;
    }
}

class Student extends College implements Interests{
    String name,cname;
    int sid;
    Address addr;
    private String branch;
    
    Student(String name, int sid, String cname, Address addr){
        super(cname);
        this.name = name;
        this.sid = sid;
        this.addr = addr;
    }
    
    public void setBranch(String branch){
        this.branch = branch;
    }
    public void getDetails(){
        System.out.println("Student name : " + name);
        System.out.println("Student id : " + sid);
        System.out.println("Student branch : " + branch);
        System.out.println("Student address : " + addr.street + " " + addr.state + " " + addr.country);
    }
    public void educationalSkills(String skill){
        System.out.println("Interested in " + skill + " Programming");
    }
    public void extraCurricularSkills(String skill){
        System.out.println("Interested in " + skill);
    }
    void grade(double cgpa){
        System.out.println(name +"'s cgpa: "+ cgpa);
    }
    void grade(double cgpa,int marks){
        System.out.println(name+"'s cgpa: "+ cgpa + "marks: " + marks); 
    }
}



public class Demo{

     public static void main(String []args){
        //Student-1
    	System.out.println("Student-1");
        Student s1 = new Student("Rahul",1,"MVSR",new Address("xyz","Telangana","India"));
        s1.setBranch("CSE");
        s1.getDetails();
        s1.educationalSkills("JAVA");
        s1.extraCurricularSkills("Cricket");
        s1.grade(7.5);
        //Student-2
        System.out.println("Student-2");
        Student s2 = new Student("John",1,"MIT",new Address("abc","Florida","USA"));
        s2.setBranch("ECE");
        s2.getDetails();
        s2.educationalSkills("PYTHON");
        s2.extraCurricularSkills("Playing music");
        s2.grade(7.5,540);
     }
}