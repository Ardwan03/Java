// Klassen MutableString representerar en föränderlig teckensträng.
class MutableString
{
    private static class Node
    {
        public char ch;
        public Node next;
        public Node (char ch)
        {
            this.ch = ch;
            this.next = null;
        }
    }

    // antalet tecken i teckensträngen
    private int numberOfChars = 0;
    private Node first = null;
    public MutableString (char[] chars)
    {
        if (chars != null)
        {
            Node n = new Node(chars[0]);
            first = n;
            for (int pos = 1; pos < chars.length; pos++)
            {
                n.next = new Node(chars[pos]);
                n = n.next;
            }
            numberOfChars = chars.length;
        }
    }
    public String toString ()
    {
        StringBuilder sb = new StringBuilder("");
        Node n = first;
        while (n != null)
        {
            sb.append(n.ch);
            n = n.next;
        }
        return sb.toString();
    }
    // charAt returnerar det tecken som finns på ett givet index i teckensträngen.
    // Om ett index som inte finns i teckensträngen anges, kastas
    // ett undantag av typen java.lang.IndexOutOfBoundsException.
    public char charAt (int index) throws java.lang.IndexOutOfBoundsException{
        // koden saknas här
        if(index < 0 || index >= numberOfChars) // om index är mindre än noll, eller om index är större än eller lika med chars.length vilket är lika med numberOfChars!
            throw new java.lang.IndexOutOfBoundsException();

        Node n = first; // n börjar peka på första noden i listan

        for(int i=0; i<index; i++) // flytta n ett steg framåt i listan för varje varv tills vi når index-positionen
            n = n.next; // flytta n till nästa nod i listan

        return n.ch; // returnera tecknet i noden på det givna indexet
    }
    // addFirst lägger till ett givet tecken i början av teckensträngen.
    public void addFirst (char ch){
        // koden saknas här
        Node node = new Node(ch); // skapa en ny Node, hämta tecknet.
        node.next = first; // låt first peka på next, dvs flytta allt ett steg till höger. 
        first = node; // låt node som vi skapade peka på första platsen. 

        numberOfChars++; // öka, eftersom vi ökade med ett tecken. 
    }
}
/* 
En instans av klassen MutableString skapas och används så här:
char[] chars = {'n', 'n', 'y'};
MutableString str = new MutableString(chars);
System.out.println(str);
System.out.println("");

str.addFirst('u');
str.addFirst('s'); // (1)
System.out.println(str);
char c = str.charAt(4);
System.out.println(c);
*/