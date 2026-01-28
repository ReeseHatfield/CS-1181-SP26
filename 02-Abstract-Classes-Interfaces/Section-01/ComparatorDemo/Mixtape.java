import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Mixtape
{
    public static void main(String[] args)
    {
        Song track1 = new Song(3.42, 2984235052L, "Mr. Brightside", "The Killers");
        Song track2 = new Song(5.03, 1191893994, "Mr. Blue Sky", "Electric Light Orchestra");
        Song track3 = new Song(5.39, 1233059009, "Piano Man", "Billy Joel");
        Song track4 = new Song(4.02, 3160349073L, "Viva La Vida", "Coldplay");
        Song track5 = new Song(3.34, 988947011, "Vienna", "Billy Joel");
        Song track6 = new Song(3.17, 1136036964, "Somebody Told Me", "The Killers");
        Song track7 = new Song(3.42, 27086936, "Feeling For You", "Milky Chance");
        Song track8 = new Song(3.42, 820332907, "Stronger", "Kelly Clarkson");
        Song track9 = new Song(3.42, 25321662, "Mr. Blue Sky", "Electric Light Orchestra");
        Song track10 = new Song(3.33, 1091542395, "Never Gonna Give You Up", "Rick Astley");

        ArrayList<Song> tracks = new ArrayList<>(Arrays.asList(track1, track2, track3, track4, track5, track6, track7, track8, track9, track10));

        Collections.sort(tracks, new SongComparator());

        System.out.println(compileTracks(tracks));
    }

    public static String compileTracks(ArrayList<Song> songs)
    {
        String mixtape = String.format("%-7s %-25s %-20s %-4s\n", "Track", "Title", "Plays", "Duration");
        int count = 1;
        for (Song s : songs)
        {
            mixtape = mixtape + String.format("%-7d %s\n\n", count, s);
            count++;
        }
        return mixtape;
    }
}
