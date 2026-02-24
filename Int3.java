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

    public Int abs ()
    {
        return new Int(Math.abs(value));
    }

    public static Int [] absInts (Int [] a){
        Int [] AbsolutVärden = new Int [a.length];

        for(int i=0; i<a.length;i++)
            AbsolutVärden [i] = a[i].abs();

        return AbsolutVärden;
    }

    public static Int [] oddInts (Int [] a){

        int UddaTal = 0;
        for (int i =0; i<a.length; i++)
            if(a[i].isEven())
                continue;
            else 
                UddaTal++;

        Int [] NyArray = new Int [UddaTal];
        int index = 0;
        for(int i=0;i<a.length;i++)
            if(a[i].isEven())
                continue;
            else 
                NyArray [index++] = a[i];

        return NyArray;
    }

    Int [] heltal = {new Int (1), new Int (2), new Int (3), new Int (4), new Int (5), new Int (6), new Int (7), new Int (8), new Int (9), new Int (10)};
    Int [] ett = IntUtil.absInts(heltal);
    Int [] två = IntUtil.oddInts(heltal);
}