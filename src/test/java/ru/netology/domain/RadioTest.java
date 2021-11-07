package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //    Set Current Volume Test

    @Test
    void shouldSetCurrentVolumeUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

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
    void shouldSetCurrentVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeInsideRangeLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //    Increase Current Volume Test

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
    void shouldIncreaseVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //    Decrease Current Volume Test

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
    void shouldDecreaseVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

//    Set RadioStation Test

    @Test
    void shouldSetCurrentRadioStationUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationInsideRangeLimit() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationOverMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

//    Increase RadioStation Test

    @Test
    void shouldIncreaseRadioStationInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        rad.increaseRadioStation();

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.increaseRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.increaseRadioStation();

        int expected = 0;
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

    //    Decrease RadioStation Test

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
    void shouldDecreaseRadioStationMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.decreaseRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.decreaseRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        rad.decreaseRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
}