class Int
{
    private int value;
    public Int (int value)
    {
        this.value = value;
    }

    public boolean lessThan (Int n)
    {
        return this.value < n.value;
    }

    public boolean isPrime ()
    {
        boolean prime = false;
        if (value >= 2)
        {
            prime = true;
            int i = 2;
            while (prime && i <= Math.sqrt(value))
                if (value % i == 0)
                    prime = false;
                else
            i++;
        }
        return prime;
    }

    public static boolean contains (Int [] a, Int b) {
    for (int i = 0; i < a.length; i++)
        if (!a[i].lessThan(b) && !b.lessThan(a[i]))
            return true;

    return false;
    }

    public static Int [] primeInts (Int [] a) {

    int minne = 0;
    for (int i = 0; i < a.length; i++)
        if (a[i].isPrime())
            minne++;

    Int [] NyArray = new Int [minne];
    int index = 0;

    for (int i = 0; i < a.length; i++)
        if (a[i].isPrime())
            NyArray[index++] = a[i];

    return NyArray;
    }

    Int [] heltal = {new Int (1), new Int (2), new Int (3), new Int (4), new Int (5), new Int (6), new Int (7), new Int (8), new Int (9), new Int (10)};
    Int tecken = new Int (5);
    boolean lagring = IntUtil.contains(heltal, tecken);
    Int [] lager = IntUtil.primeInts(heltal);
    // VadSkaReturneras namn = class.metoden(VadSkaHämtas);  (OBS!! class måste inte finnas, kan vara utan, om inte annat anges, som IntUtil)


}