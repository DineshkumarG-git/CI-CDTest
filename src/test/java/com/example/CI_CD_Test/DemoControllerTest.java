package com.example.CI_CD_Test;

import com.example.CI_CD_Test.controllers.DemoController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoControllerTest {

    @Test
    public void simpleTest() {

        var demoController = new DemoController();
         var result  = demoController.multiplier(2 , 3);
        assertEquals(6, result);

    }

    @Test
    public void multiplierTest() {
        var  demoController = new DemoController();
        var result = demoController.multiplier(3,3);
        assertEquals(9, result);

    }

}
