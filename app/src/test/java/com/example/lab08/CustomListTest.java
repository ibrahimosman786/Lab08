package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void setUp() {
        list = new CustomList();
    }

    @Test
    public void testHasCityTrue() {
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testHasCityFalse() {
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testHasCityEmptyList() {
        City city = new City("Vancouver", "BC");
        assertFalse(list.hasCity(city));
    }
}