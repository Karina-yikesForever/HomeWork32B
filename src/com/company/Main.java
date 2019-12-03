package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Song s=new Song("Best part","H.E.R","R&B","You don't know bae,when you kiss me slowly it's a sweetest thing...");
        FileWriter fileWriter=new FileWriter("Best part.txt");
        fileWriter.write("Name:"+"\n");
        fileWriter.write("Singer :"+"\n");
        fileWriter.write("Genre :"+"\n");
        fileWriter.write("Lyrics: ");
        fileWriter.close();
    }
}
class Song{
    String name;
    String singer;
    String genre;
    String lyrics;

    public Song(String name, String singer, String genre, String lyrics) {
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.lyrics = lyrics;
    }
}
