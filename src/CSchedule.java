/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CS182P-BC2-13
 */
public class CSchedule {
    
    String CourseCode;
    String Section;
    int Units;
    String Schedule;
    String Professor;
    
    public CSchedule(String coursecode, String section, int units, String schedule, String professor)
    {
        this.CourseCode = coursecode;
        this.Section = section;
        this.Units = units;
        this.Schedule = schedule;
        this.Professor = professor;
        
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getSection() {
        return Section;
    }

    public int getUnits() {
        return Units;
    }

    public String getSchedule() {
        return Schedule;
    }

    public String getProfessor() {
        return Professor;
    }
    
}
