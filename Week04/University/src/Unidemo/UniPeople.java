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
public class UniPeople {
    Course course;
    int id;
    char[] name;
    
    public Course getCourse()
    {
        return course;
    }
    
    public int getId()
    {
        return id;
    }
    
    public char[] getName()
    {
        return name;
    }
    
    public void setCourse(Course person_course)
    {
        course = person_course;
    }
    
    public void setId(int person_id)
    {
        id = person_id;
    }
    
    public void setName(char[] person_name)
    {
        name = person_name;
    }
}
