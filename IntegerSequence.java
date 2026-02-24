// a program that in various ways manages a sequence of integers
class IntegerSequence
    {
        public static void main (String[] args)
         {
                System.out.println("A SEQUENCE OF INTEGERS\n\n");

                // input tool
                java.util.Scanner in = new java.util.Scanner(System.in);
                in.useLocale(java.util.Locale.US);

                // input some integer numbers
                int[] Hehe = new int[10 + 1];
                System.out.print("enter 10 integer numbers on one line: ");

                for (int i = 1; i < Hehe.length; i++)
                    Hehe[i] = in.nextInt();

                System.out.println();
                // the least of the integers and their mean value
                int min = Hehe[1];
                int sum = Hehe[1];
                for (int i = 2; i < Hehe.length; i++)
                {
                    if (Hehe[i] < min)
                        min = Hehe[i];
                    sum += Hehe[i];
                }
                double mean = (double) sum / (Hehe.length - 1);
                // present the result
                System.out.println("the least integer and the mean value of all integers");
                System.out.printf("%4d | %7.2f\n\n\n", min, mean);

                in.close();
         }
    }
