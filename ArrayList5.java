// Klassen ArrayList representerar en lista med objekt.
class ArrayList
{
    // objekt i listan
    private Object[] objects;
    public ArrayList (Object[] objects)
    {
        this.objects = new Object[objects.length];
        for (int i = 0; i < objects.length; i++)
            this.objects[i] = objects[i];
    }
    public String toString ()
    {
        String s = "[";
        if (objects.length > 0)
        {
            for (int i = 0; i < objects.length - 1; i++)
                s += objects[i] + ", ";
            s += objects[objects.length - 1];
        }
        s += "]";
        return s;
    }
    // addLast lägger till ett givet objekt på slutet i listan
    public void addLast (Object obj){
        // koden saknas här
        Object [] a = new Object [objects.length + 1];
        for(int i=0; i<objects.length;i++)
            a[i] = objects[i];
        a[objects.length+1 -1] = obj;
        objects = a;
    }
    // subList returnerar en lista som innehåller de objekt i den
    // här listan som finns från och med ett givet index, fromIndex.
    // Om fromIndex inte finns i listan, kastas ett undantag
    // av typen IndexOutOfBoundsException.
    public ArrayList subList (int fromIndex) throws IndexOutOfBoundsException{
        // koden saknas här
        if (fromIndex < 0 || fromIndex >= objects.length)
            throw new IndexOutOfBoundsException("index out of range");

        Object[] a = new Object[objects.length - fromIndex];

        for (int i = fromIndex; i < objects.length; i++)
            a[i - fromIndex] = objects[i];
        ArrayList resultat = new ArrayList(a);

        return resultat;
    }
}
/*  Klassen ArrayList används så här:
Object[] a = { new String("A"),
new String("B"),
new String("C"),
new String("D"),
};
ArrayList list = new ArrayList(a); // (1)
System.out.println(list);
list.addLast(new String("E"));
System.out.println(list);
ArrayList sublist = list.subList(2);
System.out.println(sublist);
*/