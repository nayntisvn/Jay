/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CS182P-BC2-13
 */
public class Schedule {
    
    String CourseCode;
    String Section;
    String Day;
    String Time;
    String Room;
    String Professor;
    
    public Schedule(String coursecode, String Section, String day, String time, String room, String Professor)
    {
        this.CourseCode = coursecode;
        this.Section = Section;
        this.Day = day;
        this.Time = time;
        this.Room = room;
        this.Professor = Professor;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getSection() {
        return Section;
    }

    public String getDay() {
        return Day;
    }

    public String getTime() {
        return Time;
    }
    
    public String getRoom() {
        return Room;
    }

    public String getProfessor() {
        return Professor;
    }
}
