package com.udea.countries.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DataControllerTest {

    @Autowired
    DataController dataController;

    @Test
    void getRoot() {
        String root = dataController.getRoot();
        System.out.println(root);
        assertEquals("AppCountries", dataController.getRoot());
    }

    @Test
    void getVersion() {
        assertEquals("0.0.1", dataController.getVersion());
    }

    @Test
    void getRandomNationsLength() {
        assertEquals(10, dataController.getRandomNations(10).size());
    }

    @Test
    void getRandomCurrenciesLength() {
        assertEquals(10, dataController.getRandomCurrencies(10).size());
    }
}