package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //    Volume

    //    Set Current Volume Test

    @Test
    void shouldSetCurrentVolumeInsideRangeLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(30);

        int expected = 30;
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
    void shouldSetCurrentVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

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

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //    Increase Current Volume Test

    @Test
    void shouldIncreaseVolumeInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(25);

        rad.increaseVolume();

        int expected = 26;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOverMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //    Decrease Current Volume Test

    @Test
    void shouldDecreaseVolumeInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        rad.decreaseVolume();

        int expected = 49;
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

    @Test
    void shouldDecreaseVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.decreaseVolume();

        int expected = 99;
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

    //    RadioStation

    //    Set RadioStation Test Base Modify

    @Test
    void shouldSetCurrentRadioStationBaseModifyInsideRange() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationBaseModifyMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationBaseModifyUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationBaseModifyMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationBaseModifyOverMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    //    Set RadioStation Test User Modify

    @Test
    void shouldSetCurrentRadioStationUserModifyInsideRange() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(15);

        int expected = 15;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationUserModifyMin() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationUserModifyUnderMin() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(-10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationUserModifyMax() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(24);

        int expected = 24;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationUserModifyOverMax() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(27);

        int expected = 24;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    //    Increase RadioStation Test Base Modify

    @Test
    void shouldIncreaseRadioStationBaseModifyInsideRangeLimit() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(6);

        rad.increaseRadioStation();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationBaseModifyMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        rad.increaseRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationBaseModifyMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        rad.increaseRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationBaseModifyOverMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        rad.increaseRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    //    Increase RadioStation Test User Modify

    @Test
    void shouldIncreaseRadioStationUserModifyInsideRangeLimit() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(16);

        rad.increaseRadioStation();

        int expected = 17;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationUserModifyMin() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(0);

        rad.increaseRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationUserModifyMax() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(24);

        rad.increaseRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadioStationUserModifyOverMax() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(25);

        rad.increaseRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    //    Decrease RadioStation Test Base Modify

    @Test
    void shouldDecreaseRadioStationBaseModifyInsideRangeLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);

        rad.decreaseRadioStation();

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationBaseModifyMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.decreaseRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationBaseModifyMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.decreaseRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationBaseModifyUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        rad.decreaseRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    //    Decrease RadioStation Test User Modify

    @Test
    void shouldDecreaseRadioStationUserModifyInsideRangeLimit() {
        Radio rad = new Radio(25);
        rad.setCurrentRadioStation(16);

        rad.decreaseRadioStation();

        int expected = 15;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationUserModifyMin() {
        Radio rad = new Radio(25);
        rad.setCurrentRadioStation(0);

        rad.decreaseRadioStation();

        int expected = 24;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationUserModifyMax() {
        Radio rad = new Radio(25);
        rad.setCurrentRadioStation(24);

        rad.decreaseRadioStation();

        int expected = 23;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadioStationUserModifyUnderMin() {
        Radio rad = new Radio(25);
        rad.setCurrentRadioStation(-1);

        rad.decreaseRadioStation();

        int expected = 24;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
}
