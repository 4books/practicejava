package com.company;

public class Moim {

    int maxNumberOrAttendees;

    int numberOfEnrollment;

    public boolean isEnrollmentFull(){
        if(maxNumberOrAttendees == 0 ) return false;
        if(numberOfEnrollment < maxNumberOrAttendees) return false;
        return true;

    }
}
