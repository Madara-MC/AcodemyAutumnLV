package homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

        public int summa(int a, int b) {
            return a * b;
        }
        public double dalisana(double a, double b) {
            return a / b;
        }
        public int reizinasana(int a, int b) {
            return a * b;
        }
        public int atnemsana(int a, int b) {
            return a - b;
        }
    @Test
    public void testSumma(){
        Assert.assertEquals(summa(3,5),8);
    }
    @Test
    public void testDalisana() {
            Assert.assertEquals(dalisana(8,2),4);
    }
    @Test
    public void testReizinasana() {
            Assert.assertEquals(atnemsana(15,5),10);
    }
    @Test
    public void testAtnemsana() {
        Assert.assertEquals(atnemsana(3,3),0);
    }
}

