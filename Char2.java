class Char
{
    private char ch;
    public Char (char ch)
    {
        this.ch = ch;
    }

    public boolean isDigit ()
    {
        return 48 <= ch && ch <= 57;
    }

    public int compareTo (Char c)
    {
        int comp = 0;
        if (this.ch < c.ch)
            comp = -1;
        else if (this.ch == c.ch)
            comp = 0;
        else
            comp = 1;
        return comp;
    }

    public static Index lastIndexOf (Char [] a, Char b){
        for(int i=a.length-1; i>=0;i--)
            if(a[i].compareTo(b) == 0)
                return i;
        return -1;
    }

    public static Char [] getDigits (Char [] a){
        int minnet =0;
        for(int i=0;i<a.length;i++)
            if(a[i].isDigit())
                minnet++;

        Char [] Vektor = new Char [minnet];
        int index =0;
        for(int i=0;i<a.length;i++)
            if(a[i].isDigit())
                Vektor [index++] = a[i];
        return Vektor;
    }

    // skapa en vektor med tecken
    Char[] tecken = {
        new Char('a'),
        new Char('b'),
        new Char('c'),
        new Char('d'),
        new Char('1'),
        new Char('2'),
        new Char('3')
    };

    // skapa ett tecken
    Char sign = new Char('2');

    // anropa lastIndexOf och lagra resultatet
    int index = CharUtil.lastIndexOf(tecken, sign);

    // anropa getDigits och lagra resultatet
    Char[] digits = CharUtil.getDigits(tecken);


}