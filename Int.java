class Int
{
    public static final Int ZERO = new Int(0);
    private int value;
    public Int (int value)
    {
    this.value = value;
    }

    public Int add (Int n)
    {
    return new Int(this.value + n.value);
    }

    public boolean lessThan (Int n)
    {
    return this.value < n.value;
    }

    public static Int sum(Int [] a){
        // Tar emot en vektor, returnerar summan av heltalen. 
        Int Summa = ZERO;
        for(int i=0;i<a.length;i++)
            Summa = Summa.add(a[i]);
        return Summa;
    }

    public static Int [] lessThanInts (Int [] a, Int b){
        // returnera de tal som är mindre än b
        int minnet = 0;
        for(int i=0;i<a.length;i++)
            if(a[i].lessThan(b))
                minnet++;

        Int [] vektor = new Int [minnet];
        int index =0;
        for(int i=0;i<a.length;i++)
            if(a[i].lessThan(b))
                vektor [index++] = a[i];

        return vektor;
    }

    Int [] heltal = {new Int (1), new Int (2), new Int (3), new Int (4), new Int (5)};
    Int tal = new Int (3);

    Int lagringEtt = IntUtil.sum(heltal);
    Int [] lagringTvå = IntUtil.lessThanInts(heltal, tal);
}
