import org.junit.Assert;
import org.junit.Test;

public class TestSuite {
    @Test
    public void task441test() {
        double actual;
        actual = Methods.task4411(11.13);
        Assert.assertEquals(18.1300, actual, 0.0001);
        actual = Methods.task4411(-7919);
        Assert.assertEquals(-7912, actual, 0.0001);
        actual = Methods.task4411(0);
        Assert.assertEquals(7.0000, actual, 0.0001);

    }

    @Test
    public void task2790test() {
        double actual;
        actual = Methods.task2790(6997);
        Assert.assertEquals(0.9205, actual, 0.0001);

    }

    @Test
    public void task3946() {
        double data;
        data = Methods.task3946(new int[]{9, 8, 9, 1, 1, 5, 1,1});
        Assert.assertEquals(4.375000, data, 0.0001);

    }
}

