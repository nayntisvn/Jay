/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CS182P-BC2-13
 */
public class Course {
    
    String CourseCode;
    String CourseTitle;
    int Units;
    private double TuitionFee;
    private double LFDFee;
    
    public Course(String coursecode, String courseTitle, int units, double tuition, double LFD)
    {
        this.CourseCode = coursecode;
        this.CourseTitle = courseTitle;
        this.Units = units;
        this.TuitionFee = tuition;
        this.LFDFee = LFD;
        
    }
    
    public String getCourseCode() {
        return CourseCode;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public int getUnits() {
        return Units;
    }

    /**
     * @return the TuitionFee
     */
    public double getTuitionFee() {
        return TuitionFee;
    }

    /**
     * @return the LFDFee
     */
    public double getLFDFee() {
        return LFDFee;
    }
    
    

}
