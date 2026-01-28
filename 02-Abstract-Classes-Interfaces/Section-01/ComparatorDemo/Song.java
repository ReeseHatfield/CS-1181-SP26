public class Song implements Comparable<Song>
{
    private double duration = 0.0;
    private long totNumPlays = 0;
    private String songName = "";
    private String artistName = "";

    public Song(double dur, long plays, String songName, String artistName)
    {
        this.duration = dur;
        this.totNumPlays = plays;
        this.songName = songName;
        this.artistName = artistName;
    }

    @Override
    public int compareTo(Song o)
    {
        if (this.songName.equals(o.songName))
        {
            if (this.artistName.equals(o.artistName))
            {
                if (this.duration == o.duration)
                {
                    return Long.compare(this.totNumPlays, o.totNumPlays);
                }
                else
                {
                    return Double.compare(o.duration, this.duration);
                }
            }
            else
            {
                return this.artistName.compareTo(o.artistName);
            }
        }
        else
        {
            return this.songName.compareTo(o.songName);
        }
    }

    public String toString()
    {
        return String.format("%-25s %-,20d %-4.2f\n%8s\033[3m- %-20s\033[0m", songName, totNumPlays, duration, " ", artistName);
    }

    public long getTotNumPlays()
    {
        return totNumPlays;
    }
}
