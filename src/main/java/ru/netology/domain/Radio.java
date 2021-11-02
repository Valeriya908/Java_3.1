package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    private int currentRadioStation;
    private int minValue = 0;
    private int maxValue = 9;

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minValue) {
            currentRadioStation = maxValue;
        }
        if (currentRadioStation > maxValue) {
            currentRadioStation = minValue;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation > minValue && currentRadioStation < maxValue) {
            currentRadioStation++;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > minValue && currentRadioStation < maxValue) {
            currentRadioStation--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
}