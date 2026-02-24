class Point
{
    public static final Point ORIGIN = new Point (0, 0);
    // punktens koordinater
    private double x;
    private double y;
    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance (Point p)
    {
        return Math.sqrt ( (this.x - p.x) * (this.x - p.x) +
        (this.y - p.y) * (this.y - p.y) );
    }

    public static Point nearestPoint (Point [] a){
    Point nearest = a[0];
    for(int i=1; i<a.length;i++)
        if(a[i].distance(ORIGIN) < nearest.distance(ORIGIN))
            nearest = a[i];

    return nearest;
    }

    public static Point [] selectPoints (Point [] a, Point b){
        // Om A till B < 4 då return
        int minne = 0;
        for(int i=0; i<a.length; i++)
            if(a[i].distance(b) < 4)
                minne++;

        Point [] Vektor = new Point [minne];
        int index = 0;
        for(int i=0; i<a.length; i++)
            if(a[i].distance(b) < 4)
                Vektor [index++] = a[i];

        return Vektor;
    }

    Point [] punkter = {new Point (1, 2), new Point (3, 4), new Point (5, 6), new Point (7, 8), new Point (9, 10)};
    Point punkt = new Point (3, 2);

    Point lagring = nearestPoint(punkter);
    Point [] lager = selectPoints(punkter, punkt);

}