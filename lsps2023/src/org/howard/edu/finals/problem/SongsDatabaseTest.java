package org.howard.edu.finals.problem;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;

public class SongsDatabaseTest {
    @Test
    public void testSongsDatabase() {
        SongsDatabase db = new SongsDatabase();

        // Test adding and getting songs
        db.addSong("Pop", "Love Yourself");
        db.addSong("Pop", "Kill Bill");
        db.addSong("Rock", "TNT");
        db.addSong("Rock", "Hotel California");
        db.addSong("Jazz", "What a Wonderful World");
        db.addSong("Jazz", "Always There");
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        
        // Asserting True and False Pop songs
        Set<String> popSongs = db.getSongs("Pop");
        assertTrue(popSongs.contains("Love Yourself"));
        assertTrue(popSongs.contains("Kill Bill"));
        assertFalse(popSongs.contains("Always There"));
        assertFalse(popSongs.contains("TNT"));
        
        // Asserting True and False Rock songs
        Set<String> rockSongs = db.getSongs("Rock");
        assertTrue(rockSongs.contains("TNT"));
        assertTrue(rockSongs.contains("Hotel California"));
        assertFalse(rockSongs.contains("Love Yourself"));
        assertFalse(rockSongs.contains("Gin and Juice"));

        // Asserting True and False Rap songs
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Gin and Juice"));
        assertTrue(rapSongs.contains("Savage"));
        assertFalse(rapSongs.contains("Hotel California"));
        assertFalse(rapSongs.contains("Kill Bill"));
        
        // Asserting True and False Jazz songs
        Set<String> jazzSongs = db.getSongs("Jazz");
        assertTrue(jazzSongs.contains("Always There"));
        assertTrue(jazzSongs.contains("What a Wonderful World"));
        assertFalse(jazzSongs.contains("Kill Bill"));
        assertFalse(jazzSongs.contains("TNT"));

        // Test getting genre of song
        assertEquals("Pop", db.getGenreOfSong("Kill Bill"));
        assertEquals("Rock", db.getGenreOfSong("TNT"));
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertNull(db.getGenreOfSong("Hello"));

        // Test adding a song to a new genre
        db.addSong("Reggae", "Girls Dem Sugar");
        Set<String> countrySongs = db.getSongs("Reggae");
        assertTrue(countrySongs.contains("Girls Dem Sugar"));
        assertFalse(rapSongs.contains("Girls Dem Sugar"));

        // Test adding a duplicate song to the same genre
        db.addSong("Pop", "Kill Bill");
        assertEquals(2, popSongs.size());
        
        //Print statements to check the code
        System.out.println(db.getGenreOfSong("Savage")); // prints "Rap"
        System.out.println(db.getGenreOfSong("Always There")); // prints "Jazz"
        System.out.println(db.getGenreOfSong("Kill Bill")); // prints "Pop"
        System.out.println(db.getGenreOfSong("Girls Dem Sugar")); // prints "Reggae"
    }
}