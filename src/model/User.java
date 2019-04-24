package model;

import java.util.ArrayList;

public class User {
    private String _id;
    private String _username;
    private String _password;
    private ArrayList<Class> _previouslyTakenClasses;
    private ArrayList<Class> _currentlyTakingClasses;
    private ArrayList<Class> _plannedClasses;
    private Major _major;
    private ArrayList<Major> _prevMajors;
    enum GradProgress { FRESHMAN, SOPHOMORE, JUNIOR, SENIOR }
    private double _creditHours;
}
