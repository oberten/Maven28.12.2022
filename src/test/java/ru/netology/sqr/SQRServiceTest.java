package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTestWithFewMatches() {
        SQRService service = new SQRService();

        int actual = service.calc(10,99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }

}