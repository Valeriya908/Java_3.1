package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentVolumeUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeOverMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentInsideRangeLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);

        rad.increaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOverMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);

        rad.decreaseVolume();

        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationOverMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationInsideRangeLimit() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(6);

        rad.increaseRadioStation();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        rad.increaseRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        rad.increaseRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);

        rad.decreaseRadioStation();

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(12);

        rad.decreaseRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-3);

        rad.decreaseRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
}