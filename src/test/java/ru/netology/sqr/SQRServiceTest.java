package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv.txt"})
    public void shouldCalculateSqrAndCompareWithRange(int lowLimit, int highLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrCount(lowLimit, highLimit);
        Assertions.assertEquals(expected, actual);
    }
}
