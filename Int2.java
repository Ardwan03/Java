class Int
{
    private int value;
    public Int (int value)
    {
        this.value = value;
    }

    public boolean isEven ()
    {
        return value % 2 == 0;
    }

    public boolean lessThan (Int n)
    {
        return this.value < n.value;
    }

    public static Int [] evenInts (Int [] a){
        int minne =0;
        for(int i=0;i<a.length;i++)
            if(a[i].isEven())
                minne++;

        Int [] VektorJämna = new Int [minne];
        int index = 0;
        for(int i=0;i<a.length;i++)
            if(a[i].isEven())
                VektorJämna [index++] = a[i]; 
        return VektorJämna;
    }

    public static Int minEvenInt(Int[] a) {
    Int x = null; // Null kan bara refereras till objekt. 

    for (int i = 0; i < a.length; i++)
        if (a[i].isEven() && (x == null || a[i].lessThan(x))) // om talet är jämnt och (x är null (bara första varvet) eller talet är mindre än x)
            x = a[i];
    return x;
    }

    Int [] heltal = {new Int (1), new Int (2), new Int (3), new Int (4), new Int (5), new Int (6), new Int (7), new Int (8), new Int (9), new Int (10)};
    Int [] vektor = IntUtil.evenInts(heltal);
    Int VektorTvå = IntUtil.minEvenInt(heltal);
}