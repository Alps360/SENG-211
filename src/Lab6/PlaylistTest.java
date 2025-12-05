package Lab6;

import java.util.ArrayList;

public class PlaylistTest {
    public static void main(String[] args) {
        Playlist pl = new Playlist("My Favourite Songs");
        
        pl.addSong("Fakemink - Music and Me");
        pl.addSong("Kino - pachka sigaret");
        pl.addSong("Bladee - Be Nice to Me");

        pl.printSongs();
        System.out.println("Total songs: " +  pl.getSongCount());

        pl.removeSong("Bladee - Be Nice to Me");
        
        pl.printSongs();
        System.out.println("Total songs: " +  pl.getSongCount());
    }
}
