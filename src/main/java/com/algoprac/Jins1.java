package com.algoprac;

import java.util.ArrayList;
import java.util.Scanner;

public class Jins1<list> {

    public static class Student {
        private String name;
        private String no;

        public Student(String name, String no) {
            this.name = name;
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        Student st1 = new Student("손오공", "1682");
        Student st2 = new Student("손오반", "2828");
        Student st3 = new Student("손오천", "1414");

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student stu : list) {
            System.out.println(stu.getName());
            System.out.println(stu.getNo());
        }

        System.out.println("계속 검색하려면 y, 종료하려면 n을 누르세요");

        String input = stdIn.next();

        while (input.equals("y")) {


        }
        System.out.println("종료되었습니다. ");
    }
    

}
