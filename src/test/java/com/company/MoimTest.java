package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MoimTest {

    @Test
    public void isFull(){
        Moim moim = new Moim();
        moim.maxNumberOrAttendees = 100;
        moim.numberOfEnrollment = 10;
        Assert.assertFalse(moim.isEnrollmentFull());
        
    }
}