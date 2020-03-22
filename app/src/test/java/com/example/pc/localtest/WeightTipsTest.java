package com.example.pc.localtest;

import com.example.pc.wighttips.BMI;
import com.example.pc.wighttips.WeightTips;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by pc on 21/03/2020.
 */

@RunWith(MockitoJUnitRunner.class)
public class WeightTipsTest {

    @Mock
    BMI bmi;

    WeightTips weightTips;

    @Before
    public void init(){
        weightTips = new WeightTips( bmi );
    }

    //Testing the normal state
    @Test
    public void getWeightTipNormalTest(){

        when(bmi.calculateBMI()).thenReturn( 19.01f );
        assertEquals( "normal weight",0,weightTips.getTipAboutYourWeight() );
        // Read personal information from
    }

    //Testing the underweight state
    @Test
    public void getWeightTipUnderWeightTest(){

        when(bmi.calculateBMI()).thenReturn( 16.1f );
        assertEquals( "underweight",-1,weightTips.getTipAboutYourWeight() );
        // Read personal information from
    }

    //Testing the overweight state
    @Test
    public void getWeightTipOverWeightTest(){

        when(bmi.calculateBMI()).thenReturn( 26.36f );
        assertEquals( "overweight",1,weightTips.getTipAboutYourWeight() );
        // Read personal information from
    }

    //Testing the obese state
    @Test
    public void getWeightTipObeseTest(){

        when(bmi.calculateBMI()).thenReturn( 32.36f );
        assertEquals( "obese",2,weightTips.getTipAboutYourWeight() );
        // Read personal information from
    }

}