package com.greglixandrao;

import org.junit.jupiter.api.*;

public class PersonalDataQueryTest {

    @BeforeAll
    public static void setupConection() {
        Database.startConnection();
    }

    @BeforeEach
    public void insertingDataForTest(){
        Database.insertData();
        System.out.println("Inseriu dados no Banco para rodar os testes");
    }

    @AfterEach
    public void deletingDataForTest(){
        Database.deleteData();
        System.out.println("Deletou os dados no Banco após rodar os testes");
    }

    @Test
    public void validateReturnData() {
        Assertions.assertTrue(true);
        System.out.println("Dados validados");
    }

    @Test
    public void validateReturnData2() {
        Assertions.assertTrue(true);
        System.out.println("Dados 2 validados");
    }

    @AfterAll
    public static void tearDownConection() {
        Database.closeConnection();
    }

}
