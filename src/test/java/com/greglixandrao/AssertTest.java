package com.greglixandrao;

import org.junit.jupiter.api.Test;

// importação estática para não ficar repitindo o Assertions
import static org.junit.jupiter.api.Assertions.*;


public class AssertTest {

    @Test
    public void checkArrays() {

        int[] fisrtArray = {10, 20, 30, 40, 50};
        int[] secondArray = {10, 20, 30, 40, 50};

        // não precisa usar dessa forma por conta do import static: Assertions.assertArrayEquals(fisrtArray, secondArray);
        assertArrayEquals(fisrtArray, secondArray);
    }

    @Test
    public void checkIfIsNull(){
        People people = null;

        // retirou a palavra Assertions devido à importação estática
        assertNull(people);
    }


}
