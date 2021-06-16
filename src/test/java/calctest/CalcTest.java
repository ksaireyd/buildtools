package calctest;

import calculator.Calculator;
import jdk.jfr.StackTrace;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    Calculator calculator = new Calculator();


    @Test
    public void checkAdding(){
        Assert.assertEquals(calculator.addByModule(3,12,7),1);
    }
}

