import java.util.*; // Scanner, Locale
import static java.lang.System.out; // Slipper skriva Sysout, bara out.print();
class Temperatures1
{
    public static void main (String[] args)
    {
        out.println("TEMPERATURES\n");
        // input tool
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        // enter the number of weeks and measurements
        out.print("number of weeks: ");
        int nofWeeks = in.nextInt();
        out.print("number of measurements per week: ");
        int nofMeasurementsPerWeek = in.nextInt();

        // storage space for temperature data
        double[][] t = new double[nofWeeks + 1]
        [nofMeasurementsPerWeek + 1];

        // read the temperatures
        for (int week = 1; week <= nofWeeks; week++)
        {
            out.println("temperatures - week " + week + ":");
            for (int measurement = 1;measurement <= nofMeasurementsPerWeek;measurement++)
                t[week][measurement] = in.nextDouble();
        }
        out.println("");

        // show the temperatures
        out.println("the temperatures");
        for (int week = 1; week <= nofWeeks; week++)
        {
            for (int measurement = 1;measurement <= nofMeasurementsPerWeek;measurement++)
                out.print(t[week][measurement] + " ");
            out.println("");
        }
        out.println("");

        // the least, greatest and average temperatures - weekly
        double[] minT = new double[nofWeeks + 1];
        double[] maxT = new double[nofWeeks + 1];
        double[] sumT = new double[nofWeeks + 1];
        double[] avgT = new double[nofWeeks + 1];

        // add code here
            for (int week = 1; week <= nofWeeks; week++){
                minT[week] = t[week][1]; //Minsta temperaturen antas vara först
                maxT[week] = t[week][1]; //Största temperaturen antas vara först
                sumT[week] = 0; //Sätt värdet till noll, dvs nollställ. 

                    for (int measurement = 1; measurement <= nofMeasurementsPerWeek; measurement++) {
                // Uppdatera min och maxvärde av temperaturerna
                if (t[week][measurement] < minT[week]) //Hittar lägsta temperaturen
                    minT[week] = t[week][measurement]; // Sparar den nya lägsta temperaturen
                if (t[week][measurement] > maxT[week]) // Hittar högsta temperaturen
                    maxT[week] = t[week][measurement]; // Sparar den nya högsta temperaturen
                
                // addera till summan
                sumT[week] += t[week][measurement]; // Summerar temperaturerna
            }
            // beräkna medelvärde för veckan
            avgT[week] = sumT[week] / nofMeasurementsPerWeek;
        }


        // show the least, greatest and average temperatures
        out.println("the least, greatest and average temperatures" + " - weekly");
        for (int week = 1; week <= nofWeeks; week++)
            out.print(minT[week] + " ");

        out.println("");
        for (int week = 1; week <= nofWeeks; week++)
            out.print(maxT[week] + " ");

        out.println("");
        for (int week = 1; week <= nofWeeks; week++)
            out.print(avgT[week] + " ");

        out.println("");
        out.println();
        // the least, greatest and average temperatures - whole period
        double minTemp = minT[1];
        double maxTemp = maxT[1];
        double sumTemp = sumT[1];
        double avgTemp = 0;
        // add code here
                for (int week = 2; week <= nofWeeks; week++) {
                    if (minT[week] < minTemp) // Hittar lägsta vecko-temperaturen
                        minTemp = minT[week]; // Om denna temperatur är lägre än tidigare veckors, då sparas denna som nya minsta värdet. 
                    if (maxT[week] > maxTemp) // Hittar högsta vecko-temperaturen
                        maxTemp = maxT[week]; // Om denna temperatur är högre än tidigare veckors, då sparas denna som nya minsta värdet. 
                    sumTemp += sumT[week]; // Summerar alla vecko-temperaturernas summor
                }
                avgTemp = sumTemp / (nofWeeks * nofMeasurementsPerWeek); // Totalt medelvärde

        // show the least, greatest and average temperature for
        // the whole period
        out.println("the least, greatest and average temperature" + " - whole period");
        out.println(minTemp + "\n" + maxTemp + "\n" + avgTemp);

        in.close();

    }
}