class Char
{
    private char ch;
    public Char (char ch)
    {
        this.ch = ch;
    }

    public boolean isEnglishLetter ()
    {
        return (65 <= ch && ch <= 90) || (97 <= ch && ch <= 122);
    }

    public boolean equals (Char c)
    {
        return this.ch == c.ch;
    }

    public static int indexOf(Char [] a, Char b){
        for(int i=0;i<a.length;i++)
            if(a[i].equals(b))
                return i;
        return -1;
    }

    public static Char [] englishLetters (Char [] a){
        int minnet =0;
        for(int i=0;i<a.length;i++)
            if(a[i].isEnglishLetter())
                minnet++;

        Char [] Vektor = new Char [minnet];
        int index =0;
        for(int i=0;i<a.length;i++)
            if(a[i].isEnglishLetter())
                Vektor [index++] = a[i];

        return Vektor;
    }

    Char [] tecken = {new Char ('a'),new Char ('b'),new Char ('c'),new Char ('d'),new Char ('e'), };
    Char sign = new Char ('b');

    int index = CharUtil.indexOf(tecken, sign);
    Char [] lagring = CharUtil.englishLetters(tecken);
}