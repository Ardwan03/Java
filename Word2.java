class Word
{
    // ordets tecken
    private char[] chars;
    public Word (char[] chars)
    {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++)
            this.chars[i] = chars[i];
    }
    public String toString ()
    {
        return new String (this.chars);
    }
    // subWord tar emot två index, fromIndex och toIndex,
    // och returnerar ett ord som innehåller de tecken
    // i det här ordet som finns från och med fromIndex
    // till och med toIndex.
    // Om fromIndex > toIndex, kastas ett undantag av typen
    // IllegalArgumentException.
    // Om fromIndex < 0 eller toIndex >= chars.length,
    // kastas ett undantag av typen IndexOutOfBoundsException.
    public Word subWord (int fromIndex, int toIndex){
        // koden saknas här
        if (fromIndex > toIndex)
            throw new IllegalArgumentException ("wrong index order");
        if (fromIndex < 0 || toIndex >= chars.length)
            throw new IndexOutOfBoundsException ("index out of range");

        char[] a = new char[toIndex - fromIndex + 1];
        int index = 0;
        for (int i = fromIndex; i <= toIndex; i++)
            a[index++] = chars[i];
        Word resultat = new Word(a);
        return resultat;
    }
    // addFirst lägger till ett givet tecken i början av ordet
    public void addFirst (char c){
        // koden saknas här
        char[] b = new char[chars.length + 1];
        b[0] = c;

        for(int i=0;i<chars.length;i++)
            b[i + 1] = chars[i];
        chars = b;
    }
}
/* Klassen Word används så här:
char[] v = {'k', 'n', 'i', 'f', 'e'};
Word word = new Word (v);
System.out.println (word);
Word w = word.subWord (2, 4);
w.addFirst ('L'); // (1)
System.out.println (w);
*/