package com.careerdevs.objectfactory;

public class SongFactory {
    public String title;
    public String artist;
    public String genre;
    public int seconds;


    //constructor
    SongFactory(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }

}
