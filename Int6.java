class Int
{
    public static final Int ONE = new Int (1);
    private int value;
    public Int (int value)
    {
        this.value = value;
    }

    public boolean lessThan (Int n)
    {
        return this.value < n.value;
    }

    public static Int maxInt (Int [] a) {

    Int Största = a[0];
    for (int i = 1; i < a.length; i++)
        if (Största.lessThan(a[i]))
            Största = a[i];

    return Största;
    }

    public static Int [] positiveInts (Int [] a) {

    int minnet = 0;
    for (int i = 0; i < a.length; i++)
        if (!a[i].lessThan(ONE))
            minnet++;

    Int [] PositivaHeltal = new Int [minnet];
    int index = 0;

    for (int i = 0; i < a.length; i++)
        if (!a[i].lessThan(ONE))
            PositivaHeltal[index++] = a[i];

    return PositivaHeltal;
    }

    Int [] heltal = {new Int (1), new Int (2), new Int (3), new Int (4), new Int (5), new Int (6), new Int (7), new Int (8), new Int (9), new Int (10)};
    Int lagring = maxInt(heltal);
    Int [] lager = positiveInts(heltal);


}