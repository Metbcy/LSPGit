package org.howard.edu.finals.problem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    /* Key is the genre, HashSet contains associated songs */
    private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        HashSet<String> songSet = map.get(genre);
        if (songSet == null) {
            songSet = new HashSet<String>();
            map.put(genre, songSet);
        }
        songSet.add(songTitle);
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        HashSet<String> songSet = map.get(genre);
        if (songSet == null) {
            songSet = new HashSet<String>();
        }
        return songSet;
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        for (String genre : map.keySet()) {
            HashSet<String> songSet = map.get(genre);
            if (songSet.contains(songTitle)) {
                return genre;
            }
        }
        return null;
    }
}


