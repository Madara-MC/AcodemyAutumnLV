package lekcijaPieci;

import lekcijaCetri.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void myFirstTest(){
        Circle rinkis = new Circle();
        rinkis.r=17;
        double laukums = rinkis.calculateArea();
        double diametrs = rinkis.calculateDiameter();

        Assert.assertEquals(laukums,908);
        Assert.assertEquals(diametrs,34);
    }
}
