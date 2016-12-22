package edu.macalester.comp124.audiofingerprinter;

/**
 * Created by Eric on 12/6/15.
 */
public class SongMatch implements Comparable<SongMatch> { //SongMatch object for use in recognize method. Stores # of matches and songName

    private int matchCount;
    private String songName;

    /**
     * Constructor
     */
    public SongMatch(int matchCount, String songName) {
        this.matchCount = matchCount;
        this.songName = songName;
    }

    /**
     * Compares SongMatch objects by int MatchCount
     *
     * @param o
     * @return int
     */
    public int compareTo(SongMatch o) {
        return ((Integer) matchCount).compareTo(o.matchCount);
    }

    /**
     * Getters and Setters
     */
    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songID) {
        this.songName = songName;
    }

    /**
     * Returns standard toString with private variables
     *
     * @return String
     */
    public String toString() {
        return "with " + matchCount + " matches.";
    }
}
