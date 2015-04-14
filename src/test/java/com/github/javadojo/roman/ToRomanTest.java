package com.github.javadojo.roman;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ToRomanTest {

    private final ToRoman objectToTest = new ToRoman();

    @Test(enabled = false)
    public void test1() {
        Assert.assertEquals(objectToTest.toRoman(1), "I",
            "Expected 1 to be converted into I.");
    }

    @Test(enabled = false)
    public void test3() {
        Assert.assertEquals(objectToTest.toRoman(3), "III",
            "Expected 3 to be converted into III.");
    }

    @Test(enabled = false)
    public void test5() {
        Assert.assertEquals(objectToTest.toRoman(5), "V",
            "Expected 5 to be converted into V.");
    }

    @Test(enabled = false)
    public void test4() {
        Assert.assertEquals(objectToTest.toRoman(4), "IV",
            "Expected 4 to be converted into IV.");
    }

    @Test(enabled = false)
    public void test8() {
        Assert.assertEquals(objectToTest.toRoman(8), "VIII",
            "Expected 8 to be converted into VIII.");
    }

    @Test(enabled = false)
    public void test10() {
        Assert.assertEquals(objectToTest.toRoman(10), "X",
            "Expected 10 to be converted into X.");
    }

    @Test(enabled = false)
    public void test9() {
        Assert.assertEquals(objectToTest.toRoman(9), "IX",
            "Expected 9 to be converted into IX.");
    }

    @Test(enabled = false)
    public void test13() {
        Assert.assertEquals(objectToTest.toRoman(13), "XIII",
            "Expected 13 to be converted into XIII.");
    }

    @Test(enabled = false)
    public void test14() {
        Assert.assertEquals(objectToTest.toRoman(14), "XIV",
            "Expected 14 to be converted into XIV.");
    }

    @Test(enabled = false)
    public void test29() {
        Assert.assertEquals(objectToTest.toRoman(29), "XXIX",
            "Expected 29 to be converted into XXIX.");
    }

    @Test(enabled = false)
    public void test50() {
        Assert.assertEquals(objectToTest.toRoman(50), "L",
            "Expected 50 to be converted into L.");
    }

    @Test(enabled = false)
    public void test49() {
        Assert.assertEquals(objectToTest.toRoman(49), "XLIX",
            "Expected 49 to be converted into XLIX.");
    }

    @Test(enabled = false)
    public void test44() {
        Assert.assertEquals(objectToTest.toRoman(44), "XLIV",
            "Expected 44 to be converted into XLIV.");
    }

    @Test(enabled = false)
    public void test80() {
        Assert.assertEquals(objectToTest.toRoman(80), "LXXX",
            "Expected 80 to be converted into LXXX.");
    }

    @Test(enabled = false)
    public void test100() {
        Assert.assertEquals(objectToTest.toRoman(100), "C",
            "Expected 100 to be converted into C.");
    }

    @Test(enabled = false)
    public void test90() {
        Assert.assertEquals(objectToTest.toRoman(90), "XC",
            "Expected 90 to be converted into XC.");
    }

    @Test(enabled = false)
    public void test99() {
        Assert.assertEquals(objectToTest.toRoman(99), "XCIX",
            "Expected 99 to be converted into XCIX.");
    }

    @Test(enabled = false)
    public void test150() {
        Assert.assertEquals(objectToTest.toRoman(150), "CL",
            "Expected 150 to be converted into CL.");
    }

    @Test(enabled = false)
    public void test500() {
        Assert.assertEquals(objectToTest.toRoman(500), "D",
            "Expected 500 to be converted into D.");
    }

    @Test(enabled = false)
    public void test400() {
        Assert.assertEquals(objectToTest.toRoman(400), "CD",
            "Expected 400 to be converted into CD.");
    }

    @Test(enabled = false)
    public void test440() {
        Assert.assertEquals(objectToTest.toRoman(440), "CDXL",
            "Expected 440 to be converted into CDXL.");
    }

    @Test(enabled = false)
    public void test444() {
        Assert.assertEquals(objectToTest.toRoman(444), "CDXLIV",
            "Expected 444 to be converted into CDXLIV.");
    }

    @Test(enabled = false)
    public void test490() {
        Assert.assertEquals(objectToTest.toRoman(490), "CDXC",
            "Expected 490 to be converted into CDXC.");
    }

    @Test(enabled = false)
    public void test494() {
        Assert.assertEquals(objectToTest.toRoman(494), "CDXCIV",
            "Expected 494 to be converted into CDXCIV.");
    }

    @Test(enabled = false)
    public void test499() {
        Assert.assertEquals(objectToTest.toRoman(499), "CDXCIX",
            "Expected 499 to be converted into CDXCIX.");
    }

    @Test(enabled = false)
    public void test1000() {
        Assert.assertEquals(objectToTest.toRoman(1000), "M",
            "Expected 1000 to be converted into M.");
    }

    @Test(enabled = false)
    public void test900() {
        Assert.assertEquals(objectToTest.toRoman(900), "CM",
            "Expected 900 to be converted into CM.");
    }

    @Test(enabled = false)
    public void test990() {
        Assert.assertEquals(objectToTest.toRoman(990), "CMXC",
            "Expected 990 to be converted into CMXC.");
    }

    @Test(enabled = false)
    public void test999() {
        Assert.assertEquals(objectToTest.toRoman(999), "CMXCIX",
            "Expected 999 to be converted into CMXCIX.");
    }

    @Test(enabled = false)
    public void test1999() {
        Assert.assertEquals(objectToTest.toRoman(1999), "MCMXCIX",
            "Expected 1999 to be converted into MCMXCIX.");
    }

    @Test(enabled = false)
    public void test2015() {
        Assert.assertEquals(objectToTest.toRoman(2015), "MMXV",
            "Expected 2015 to be converted into MMXV.");
    }

}
