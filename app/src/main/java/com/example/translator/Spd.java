package com.example.translator;

public class Spd {
    private String english_word;
    private String kiswahili_word;
    private int image,audio;

    Spd() {
    }

    Spd(String english_word, String kiswahili_word,int image,int audio ) {
        this.english_word = english_word;
        this.kiswahili_word = kiswahili_word;
        this.image=image;
        this.audio=audio;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public int getImage() {
        return image;
    }
    public void setImage(){
        this.audio=audio;
           }
    public void setEnglish_word(String english_word) {
        this.english_word = english_word;
    }

    public void setKiswahili_word(String kiswahili_word) {
        this.kiswahili_word = kiswahili_word;
    }

    public String getEnglish_word() {
        return english_word;
    }

    public String getKiswahili_word() {
        return kiswahili_word;
    }
}
