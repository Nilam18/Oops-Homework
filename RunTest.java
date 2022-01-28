package com.school;

public class RunTest {

    public static void main(String[] args) {

        Teacher teacher= new Teacher();
        teacher.teacherName();
        teacher.Subject();
        teacher.day();

        English english=new English();
        english.speaking();
        english.Spelling();
        english.Reading();
        english.Writing();

        Timetable timetable=new Timetable();
        timetable.teacherName();
        timetable.Subject();
        timetable.day();

        Maths maths =new Maths();
        maths.addition();
        maths.subtraction();
        maths.multiplication();
        maths.division();



    }

}
