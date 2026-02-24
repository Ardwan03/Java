class Int
{
    public static final Int ZERO = new Int(0);
    private int value;
    public Int (int value)
    {
        this.value = value;
    }

    public int compareTo (Int n)
    {
        int comp = 0;
        if (this.value < n.value)
            comp = -1;
        else if (this.value == n.value)
            comp = 0;
        else
            comp = 1;
        return comp;
    }

    public static int indexOf (Int [] a, Int b){
        for(int i=0;i<a.length;i++)
            if(a[i].compareTo(b) == 0)
                return i;
        return -1;
    }

    public static Int [] positiveInts (Int [] a){
        int minne =0;
        for(int i=0;i<a.length;i++)
            if(a[i].compareTo(ZERO) > 0)
                minne++;

        int index =0;
        Int [] VektorPositiva = new Int [minne];
        for(int i=0;i<a.length;i++)
            if(a[i].compareTo(ZERO) > 0)
                VektorPositiva [index++] = a[i];
        return VektorPositiva;
    }

    Int [] heltal = {new Int (1), new Int (2), new Int (3), new Int (4), new Int (5),};
    Int tal = new Int (3);

    int lagring = IntUtil.indexOf(heltal, tal);
    Int [] lagra = IntUtil.positiveInts(heltal);
}