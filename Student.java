/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSet;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Student implements Comparable<Student> 
{
    private String name;
    private int age;
    private String address;
    public Student() 
    {
        
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
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
@Override
    public String toString() 
    {
    return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }
    void nhap ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ten: ");
        name=sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        age=sc.nextInt();
        System.out.println("Nhap vao dia chi: ");
        address=sc.nextLine();
    }
    void xuat ()
    {
        System.out.println("ten" + name);
        System.out.println("tuoi" + age);
        System.out.println("dia chi" + address);
    }
 @Override
    public int compareTo(Student student) 
    {
       return this.getName().compareTo(student.getName());
    }
}
