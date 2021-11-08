package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentRadioStation;
    private int minValue = 0;
    private int quantityRadioStation = 10;
//    private int maxValue = 9;

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

    public Radio() {
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= minValue) {
            currentRadioStation = minValue;
        }
        if (currentRadioStation >= quantityRadioStation - 1) {
            currentRadioStation = quantityRadioStation - 1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation == quantityRadioStation - 1) {
            currentRadioStation = minValue;
        }
        else {
            currentRadioStation++;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation == minValue) {
            currentRadioStation = quantityRadioStation - 1;
        }
        else {
            currentRadioStation--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
}

