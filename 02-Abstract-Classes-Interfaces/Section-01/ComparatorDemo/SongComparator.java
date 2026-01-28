import java.util.Comparator;

public class SongComparator implements Comparator<Song>
{
    @Override
    public int compare(Song s1, Song s2)
    {
        return Long.compare(s2.getTotNumPlays(), s1.getTotNumPlays());
    }
}
