/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidemo;

/**
 *
 * @author dlaskey1
 */
public class Course {
    char[] code;
    Lecturer teacher;
    char[] coursework;
    char[] room;
    
    Course(char[] place, char[] course_code)
    {
        room = place;
        code = course_code;
    }
    
    public char[] getCode()
    {
        return code;
    }
    public Lecturer getTeacher()
    {
        return teacher;
    }
    public char[] getCourseWork()
    {
        return coursework;
    }
    public char[] getRoom()
    {
        return room;
    }
    
    public void setCode(char[] course_code)
    {
        code = course_code;
    }
    public void setTeacher(Lecturer course_teacher)
    {
        teacher  = course_teaxher;
    }
    public void setCourseWork(char[] course_work)
    {
        coursework = course_work;
    }
    public void setRoom(char[] course_room)
    {
        room = course_room;
    }
}
