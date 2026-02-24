// Klassen Word representerar ett ord.
class Word
{
    // ordets tecken
    private Character[] chars;
    public Word (Character[] chars)
    {
        this.chars = new Character[chars.length];
        for (int i = 0; i < chars.length; i++)
            this.chars[i] = chars[i];
    }
    public String toString ()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++)
            sb.append(chars[i]);
        return sb.toString();
    }
    // contains returnerar true om ordet innehåller
    // ett givet tecken, annars false
    public boolean contains (Character c){
        // koden saknas här
        for(int i=0; i<chars.length;i++)
            if(chars[i].equals(c))
                return true;
        return false;
    }
    // insert sätter in ett givet tecken på ett givet
    // index i ordet.
    // Om ett index som inte finns i ordet anges, kastas
    // ett undantag av typen IndexOutOfBoundsException.
    public void insert (int index, Character ch){
        // koden saknas här
        if (index < 0 || index > chars.length)
            throw new IndexOutOfBoundsException();

        Character [] a = new Character [chars.length + 1];

        for (int i = 0; i < index; i++)
            a[i] = chars[i];

        a[index] = ch;

        for (int i = index; i < chars.length; i++)
            a[i + 1] = chars[i];

        chars = a;
    }
}
/*  Klassen Word används så här:
Character[] v = { new Character('m'),
new Character('a'),
new Character('i'),
new Character('l') };
Word word = new Word(v);
System.out.println(word);
System.out.println("");
boolean cont = word.contains('a');
System.out.println(cont);
word.insert(0, 'e'); // (1)
System.out.println(word);
*/