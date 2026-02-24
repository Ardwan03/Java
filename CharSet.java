class CharSet
{
    private char[] elements;
    public CharSet (char[] elements)
    {
        this.elements = new char[elements.length];
        for (int i = 0; i < elements.length; i++)
            this.elements[i] = elements[i];
    }
    public String toString ()
    {
        String s = "";
        for (int i = 0; i < elements.length; i++)
            s = s + elements[i];
        return s;
    }
    // contains returnerar true om mängden innehåller ett givet tecken, annars false
    public boolean contains(char c){
        // koden saknas här
        for(int i=0;i<elements.length;i++)
            if(elements[i] == (c)) // char c är inte ett objekt, därför ==
                return true;
            return false;
    }
    // remove tar bort ett givet tecken från mängden.
    // Om mängden inte innehåller detta tecken, kastas
    // ett undantag av typen java.util.NoSuchElementException.
    public void remove(char ch) throws java.util.NoSuchElementException
    {
        // 1) Hitta index för ch
        int pos = 0;
        while (pos < elements.length && elements[pos] != ch)
            pos++;

        if (pos == elements.length)
            throw new java.util.NoSuchElementException(ch + " not present");

        // 2) Skapa ny array med ett element mindre
        char[] a = new char[elements.length - 1];

        // Kopiera allt utom elements[pos]
        for (int i = 0; i < pos; i++)
            a[i] = elements[i];

        for (int i = pos + 1; i < elements.length; i++)
            a[i - 1] = elements[i];

        elements = a;
    }
}
/* Klassen CharSet används så här:
char[] ch = {'a', 'b', 'c', 'd', 'e'};
CharSet set = new CharSet (ch);
System.out.println (set);
boolean b = set.contains ('d');
System.out.println (b);
set.remove ('d');
System.out.println (set);
// set.remove ('p');
*/