package edu.macalester.comp124.audiofingerprinter;

import java.io.File;
import java.util.List;

/**
 * Simple fingerprinter to test your audio fingerprinter implementation. Performs everything synchronously.
 * Created by bjackson on 11/15/2015.
 */
public class SimpleFingerprinter {

    public static void main(String[] args){

        String path = "/Users/Eric/Desktop/Dropbox/IntelliJ/124-hw7";
        System.out.println("Loading db...");

        SongDatabase db = new SongDatabase();
        AudioFingerprinter rec = new SongFingerprint(db);
        db.setFingerprinter(rec);
        db.loadDatabase(path);
        String song = "/Users/Eric/Desktop/Dropbox/IntelliJ/124-hw7/12 Jealous.mp3";
        System.out.println("Recognizing...");
        File fileIn = new File(song);
        List<String> results = rec.recognize(fileIn);
        int i = 1;
        System.out.println("Found "+results.size()+" results.");
        for(String s : results){
            System.out.println(i + ": "+ s);
            i++;
        }
    }
}