import org.junit.jupiter.api.Test;

public class QaFirstTest {

    @Test//anotation
    public void firstTest() {
        System.out.println("Hello, corona!");

      int sum = sumTwoDigits(17, 85);
        System.out.println(sum);

        System.out.println(sumTwoDigits(9,13));
    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
    }


}
