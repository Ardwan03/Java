// Klassen ArrayList representerar en lista med objekt.
class ArrayList<T>
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

    // addLast lägger till ett givet objekt på slutet i listan.
    public void addLast (T obj) { // Void = inget ska returneras, T är typen på element, obj är det nya värdet som vi arbetar med. 
    // koden saknas här
    Object[] a = new Object[objects.length + 1]; // Skapa en ny array med en extra plats
    for (int i = 0; i < objects.length; i++) // gå igenom hela loopen för den första/gamla arayen
        a[i] = objects[i]; // lägg in allt som fanns i gamla in i det nya. 

    a[objects.length] = obj; // på sista platen av den nya arrayen, lägg in det nya värdet. Sista platsen är = [objects.length+1 -1] = [objects.length]
    objects = a; // låt den nya arrayen peka på objects
    }

    // elementAt returnerar det objekt i listan som finns
    // på ett givet index.
    // Om indexet inte är giltigt, kastas ett undantag av typen
    // java.lang.IndexOutOfBoundsException.
    public T elementAt (int index) throws IndexOutOfBoundsException{ // Vi ska returnera T, vi vet ej ännu vad T är. Ej static eftersom vi är inne i class redan. 
    // koden saknas här
    if (index < 0 || index >= objects.length)
        throw new IndexOutOfBoundsException("index out of range!");

    return (T) objects[index]; // vi Castar T som vi ska returnera, eftersom inuti objects[index] så finns typen Object, men det ska vara T som returneras. 
                                // Cast betyder att vi omvandlar till den enheten, exempelvis omvandla en double till int. double a = (int) 3.5; kommer att ge bara 3. 
                                // objects är listan där symbolerna finns, och index är ju indexen för symbolerna. 
    }
}

/*  Klassen ArrayList används så här:
Object[] a = { new String("+"),
new String("-"),
new String("*")
};
ArrayList<String> list = new ArrayList<>(a);
System.out.println(list);
System.out.println("");
list.addLast(new String("/")); // (1)
System.out.println(list);
String element = list.elementAt(2);
System.out.println(element);
*/