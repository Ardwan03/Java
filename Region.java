// Gränssnittet Region representerar ett ändligt, tvådimensionellt område.
interface Region
{
    // perimeter returnerar områdets omkrets
    double perimeter ();
    // area ret    // perimeter returnerar områdets omkrets
    double perimeter ();
    // area returnerar områdets area
    double area ();urnerar områdets area
    double area ();
}

// Klassen Circle representerar en cirkel.
class Circle implements Region // implements Region betyder att vi ska använda oss av perimeter och area metoderna
{
    // cirkelns radie
    private double radius;
    public Circle (double radius)
    {
    this.radius = radius;
    }
    // koden saknas här
    public double perimeter(){ // anropa metoden. Static behövs ej eftersom vi är inuti class redan. 
        double OmkretsCirkel = 2 * Math.PI * radius; // definiera metoden
        return OmkretsCirkel; // vi ska returnera en double, då gör vi det.
    }

    public double area(){ // anropa metoden 
        return radius * radius * Math.PI; // definiera metoden
    }

}

// Klassen Rectangle representerar en rektangel.
class Rectangle implements Region
{
    // rektangelns sidlängder
    private double length;
    private double width;
    public Rectangle (double length, double width)
    {
    this.length = length;
    this.width = width;
    }
    // Koden saknas här
    public double perimeter(){ // anropa metoden
        return 2 * (length + width); // definiera metoden
    }

    public double area(){ // anropa metoden
        return width * length; // definiera metoden
    }
}

    public static Region min (Region [] a){ // Här är den static eftersom vi är inte inne i class. 
        Region minstaArean = a[0]; // sätt minsta arean til första index, Region eftersom metoden area är en Region. 
        for(int i=1; i<a.length; i++)
            if(a[i].area() < minstaArean.area()) // om nånting har mindre area än minsta
                minstaArean = a[i]; // sätt den till nya minsta arean

        return minstaArean;
    }

    Region [] CiklarOchRektanglar = {new Circle (2), new Rectangle (2, 6),new Circle (3), new Rectangle (3, 7), new Circle (4), new Rectangle (4, 7)};
    Region lagringAvMin = RegionUtil.min(CirklarOchRektanglar);


