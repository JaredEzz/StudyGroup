package model;

import java.util.ArrayList;

public class Major {
    private String _id;
    private University _university;
    private String _name;
    private String _nameWithUniversity;
    private ArrayList<Class> _requiredClasses;
    private ArrayList<Emphasis> _emphases;
    private ArrayList<Minor> _commonRelatedMinors;
    private int _requiredCreditHours;
}
