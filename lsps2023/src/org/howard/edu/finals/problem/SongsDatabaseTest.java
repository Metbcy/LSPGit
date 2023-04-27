package org.howard.edu.finals.problem;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;

public class SongsDatabaseTest {
    @Test
    public void testSongsDatabase() {
        SongsDatabase SongHash = new SongsDatabase();

        // Test adding and getting songs
        SongHash.addSong("Pop", "Love Yourself");
        SongHash.addSong("Pop", "Kill Bill");
        SongHash.addSong("Rock", "TNT");
        SongHash.addSong("Rock", "Hotel California");
        SongHash.addSong("Jazz", "What a Wonderful World");
        SongHash.addSong("Jazz", "Always There");
        SongHash.addSong("Rap", "Savage");
        SongHash.addSong("Rap", "Gin and Juice");
        assertTrue(2 == SongHash.getSongs("Pop").size());
        assertTrue(2 == SongHash.getSongs("Rock").size());
        assertTrue(2 == SongHash.getSongs("Jazz").size());
        assertTrue(2 == SongHash.getSongs("Rap").size());
        
        // Asserting True and False Pop songs
        Set<String> popSongs = SongHash.getSongs("Pop");
        assertTrue(popSongs.contains("Love Yourself"));
        assertTrue(popSongs.contains("Kill Bill"));
        assertFalse(popSongs.contains("Always There"));
        assertFalse(popSongs.contains("TNT"));
        
        
        // Asserting True and False Rock songs
        Set<String> rockSongs = SongHash.getSongs("Rock");
        assertTrue(rockSongs.contains("TNT"));
        assertTrue(rockSongs.contains("Hotel California"));
        assertFalse(rockSongs.contains("Love Yourself"));
        assertFalse(rockSongs.contains("Gin and Juice"));

        // Asserting True and False Rap songs
        Set<String> rapSongs = SongHash.getSongs("Rap");
        assertTrue(rapSongs.contains("Gin and Juice"));
        assertTrue(rapSongs.contains("Savage"));
        assertFalse(rapSongs.contains("Hotel California"));
        assertFalse(rapSongs.contains("Kill Bill"));
        
        // Asserting True and False Jazz songs
        Set<String> jazzSongs = SongHash.getSongs("Jazz");
        assertTrue(jazzSongs.contains("Always There"));
        assertTrue(jazzSongs.contains("What a Wonderful World"));
        assertFalse(jazzSongs.contains("Kill Bill"));
        assertFalse(jazzSongs.contains("TNT"));

        // Test getting genre of song
        assertEquals("Pop", SongHash.getGenreOfSong("Kill Bill"));
        assertEquals("Rock", SongHash.getGenreOfSong("TNT"));
        assertEquals("Rap", SongHash.getGenreOfSong("Savage"));
        assertNull(SongHash.getGenreOfSong("Hello"));

        // Test adding a song to a new genre
        SongHash.addSong("Reggae", "Girls Dem Sugar");
        Set<String> reggaeSongs = SongHash.getSongs("Reggae");
        assertTrue(reggaeSongs.contains("Girls Dem Sugar"));
        assertFalse(rapSongs.contains("Girls Dem Sugar"));
        assertTrue(1 == SongHash.getSongs("Reggae").size());

        // Test adding a duplicate song to the same genre
        SongHash.addSong("Pop", "Kill Bill");
        assertEquals(2, popSongs.size());
        
        //Print statements to check getGenreOfSong
        System.out.println(SongHash.getGenreOfSong("Savage")); // prints "Rap"
        System.out.println(SongHash.getGenreOfSong("Always There")); // prints "Jazz"
        System.out.println(SongHash.getGenreOfSong("TNT")); // prints "Rock"
        System.out.println(SongHash.getGenreOfSong("Kill Bill")); // prints "Pop"
        System.out.println(SongHash.getGenreOfSong("Girls Dem Sugar")); // prints "Reggae"
        
      //Print statements to check getSongs
        System.out.println(SongHash.getSongs("Rap")); // prints "Song List for Rap"
        System.out.println(SongHash.getSongs("Pop")); // prints "Song List for Pop"
        System.out.println(SongHash.getSongs("Rock")); // prints "Song List for Rock"
        System.out.println(SongHash.getSongs("Jazz")); // prints "Song List for Jazz"
        System.out.println(SongHash.getSongs("Reggae")); // prints "Song List for Reggae"
        
       
    }
}