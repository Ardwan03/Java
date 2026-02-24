// Klassen ArrayList representerar en lista med objekt.
class ArrayList
{
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
    // set ersätter objektet på ett givet index
    // i listan med ett givet objekt.
    // Om indexet inte är giltigt, kastas ett undantag av typen
    // java.lang.IndexOutOfBoundsException.
    public void set (int index, Object obj) throws IndexOutOfBoundsException{
        // koden saknas här
        // undantag ska alltid kastas först!!!!!!!!!!!!!
        if (index < 0 || index >= objects.length)
            throw new IndexOutOfBoundsException("index out of range!");
        objects[index] = obj; // sätt objektet till index i objects.

    }
    // removeFirst tar bort det första objektet från listan.
    // Om listan är tom, kastas ett undantag av typen
    // java.lang.IllegalStateException.
    public void removeFirst () throws IllegalStateException{
        // koden saknas här
        if (objects.length == 0) // om listan är tom, om den inte har något värde dvs jämförelsen är noll. Antalet element mäts med objects.length och om det ör 0, då innehåller arrayen 0 element.
            throw new IllegalStateException("list is empty");

        Object[] a = new Object[objects.length - 1]; // varför minus ett? Jo för att vi tar ju bort ett element, den första. 

        for (int i = 1; i < objects.length; i++) // varför i=1? för att i=0 är ju elementet som tas bort, därför börjar vi från nästa. 
            a[i - 1] = objects[i]; // varför i-1?? Jo räkna matten vi överför från index 1 i den gamla arrayen till den nya! a[1-1] = objects[1];

        objects = a; // sätt den nya arrayen till objects. 
    }
}

/* Klassen ArrayList används så här:
Object[] a = { new String("s"),
new String("p"),
new String("i"),
new String("c"),
new String("e")
};
ArrayList list = new ArrayList(a);
System.out.println(list);
System.out.println("");
list.set(2, "a");
System.out.println(list);
list.removeFirst(); // (1)
System.out.println(list);
*/