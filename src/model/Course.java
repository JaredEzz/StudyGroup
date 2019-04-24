package model;


import java.util.ArrayList;

//a course that is offered at a university. e.g. CS240, ENG316, etc.
public class Course {
    private String _id;
    private ArrayList<Semester> _semestersOffered;
    private String _courseTitle;
    private String _description;
    private double _creditHours;
}
