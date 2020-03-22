package com.example.pc.localtest;

import com.example.pc.wighttips.BMI;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pc on 21/03/2020.
 */

public class BMITest {

    private BMI bmi;

    //To initialize bmi before starting the test
    @Before
    public void init(){
        bmi = new BMI( 68, 1.67f );
    }
    @Test
    public void testCalculateBMI(){
       float expectedValue = 24.38f;
        assertEquals("BMI calculating is correct ", expectedValue, bmi.calculateBMI(), 0.01);

    }
}
