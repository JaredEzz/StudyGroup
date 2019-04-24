package model;

import java.util.Date;

public class Semester {
    private String _id;
    private String _name;
    private Date _beginDate;
    private Date _endDate;

    private int _year;
    private enum Season { FALL, WINTER, SPRING, SUMMER;}
}
