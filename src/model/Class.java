package model;

import java.util.Date;

//a specific instance of a course. example: Prof. Wood's CS 356 class on MWF from 12:00-1:50pm
public class Class {
    private String _id;
    private Professor _professor;
    private Semester _semester;
    private String _classTitle;
    private String _description;
    private String _dayTime;
    private Date _begin;
    private Date _end;
    private Course _course;
}
