package com.greglixandrao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PeopleTest {

    @Test
    public void ShouldCalculateAge() {
        People helo = new People("Helo", LocalDate.of(2002,1,1));
        Assertions.assertEquals(22, helo.getAge());
    }

    @Test
    public void ShouldReturnTrueIfOfLegalAge() {
        People greg = new People("Greg", LocalDate.of(1985,8,26));
        Assertions.assertTrue(greg.isOfLegalAge());

        People mabel = new People("Mabel", LocalDate.of(2021,8,9));
        Assertions.assertFalse(mabel.isOfLegalAge());
    }
}
