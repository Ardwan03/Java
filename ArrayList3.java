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
    // addFirst lägger till ett givet objekt i början av listan.
    public void addFirst (Object obj){
        // koden saknas här
        Object [] a = new Object [objects.length + 1];
        for(int i=0; i<objects.length;i++)
            a[i+1] = objects[i];
        a[0] = obj;
        objects = a;
    }
    // indexOf returnerar indexet av den första förekomsten av ett givet objekt i listan.
    // Om objektet inte finns, returneras -1.
    // Anta att null inte förekommer i listan.
    public int indexOf (Object obj){
        // koden saknas här
        for(int i=0;i<objects.length;i++)
            if(objects[i].equals(obj)) // det som står till vänster om equals kan aldrig vara null
                return i;

        return -1;        
    }
}
/*  Klassen ArrayList används så här:
Object[] a = { new String("C"),
new String("B"),
new String("A")
};
ArrayList list = new ArrayList(a);
System.out.println(list);
list.addFirst(new String("D")); // (1)
System.out.println(list);
int index = list.indexOf(new String("B"));
System.out.println(index);
*/