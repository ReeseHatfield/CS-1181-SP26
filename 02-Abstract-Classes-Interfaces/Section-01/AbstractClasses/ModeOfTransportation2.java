public abstract class ModeOfTransportation2 implements Comparable<ModeOfTransportation2>
{
    private double currPos = 0.0;
    private double speed = 0.0;

    public ModeOfTransportation2(double currPos, double speed)
    {
        this.currPos = currPos;
        this.speed = speed;
    }

    @Override
    public int compareTo(ModeOfTransportation2 o) {
        if (this.speed < o.getSpeed())
        {
            return -1;
        }
        else if (this.speed > o.getSpeed())
        {
            return 1;
        }
        else
        {
            if (this.currPos < o.getPosition())
            {
                return 1;
            }
            else if (this.currPos > o.getPosition())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }

    public void move(double disp)
    {
        currPos = currPos + disp;
    }

    public double calcTripTime(double disp)
    {
        return disp / speed;
    }

    public void setSpeed(double newSpeed)
    {
        this.speed = newSpeed;
    }

    public double getSpeed()
    {
        return this.speed;
    }

    public double getPosition()
    {
        return this.currPos;
    }
}
