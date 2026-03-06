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

    // ===== hasCity tests =====
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

    // ===== deleteCity tests =====
    @Test
    public void testDeleteCity() {
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertEquals(0, list.getCount());
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCityNotInList() {
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.deleteCity(edmonton);
        assertTrue(list.hasCity(calgary));
    }
}