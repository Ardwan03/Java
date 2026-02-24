class Circle
{
    // cirkelns radie och färg
    private double r;
    private String color;
    public Circle (double r, String color)
    {
        this.r = r;
        this.color = color;
    }

    public String getColor ()
    {
        return color;
    }

    public double area ()
    {
        return r * r * Math.PI;
    }

    public static Circle [] extremeCircles (Circle [] a){
        // returnera minsta och största cirkeln.
        Circle max = a[0];
        for(int i=1;i<a.length;i++)
            if(a[i].area() > max.area())
                max = a[i];

        Circle min = a[0];
        for(int i=1;i<a.length;i++)
            if(a[i].area() < min.area())
                min = a[i];

        Circle [] Vektor = {max, min};
        // Circle [] Vektor = new Circle [2];
        // Vektor [0] = max;
        // Vektor [1] = min;

        return Vektor;
    }

    public static Circle [] selectCircles (Circle [] a, String b){
        int minne = 0;
        for(int i=0; i<a.length;i++)
            if(a[i].getColor().equals(b))
                minne++;

        Circle [] Vektor = new Circle[minne];
        int index = 0;
        for(int i =0;i<a.length;i++)
            if(a[i].getColor().equals(b))
                Vektor [index++] = a[i];

        return Vektor;
    }

    Circle [] circles = { new Circle (3, "yellow"),
                    new Circle (1, "blue"),
                    new Circle (2, "yellow"),
                    new Circle (5, "red"),
                    new Circle (4, "yellow") };

    Circle[] extrCircles = extremeCircles (circles);
    Circle[] selCircles = selectCircles (circles, "yellow");


}