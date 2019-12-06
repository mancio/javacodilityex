/*
https://www.hackerrank.com/test/a5ronh5122k/questions/5gh1h79a

2. Filling in Data

A time series of daily readings of mercury levels in a river is provided to you. In each test case, the day's highest level is missing for certain days. By analyzing the data, try to identify the missing mercury levels for those days. Each row of data contains two tab-separated values: a time-stamp and the day's highest reading.
There are exactly twenty rows marked missing in each input file. The missing values are marked as "Missing_1", "Missing_2", "Missing_20". These missing records have been randomly dispersed in the rows of data.
Function Description
Complete the calcMissing function in the editor below. It should print 20 rows, one for each missing value, as floats.

Constraints Mercury levels are all < 400.
• Input Format for Custom Testing
The first line contains an integer n, the number of rows of data to follow. Each of the next n lines contains a string of data in the format described.
• Sample Case 0

• Sample Case 0
Sample Input 0
250
1/3/2012 16:00:00 Missing_l
1/4/2012 16:00:00 27.47
1/5/2012 16:00:00 27.728
1/6/2012 16:00:00 28.19
1/9/2012 16:00:00 28.1
1/10/2012 16:00:00 28.15
12/13/2012 16:00:00 27.52
12/14/2012 16:00:00 Missing_19
.....

Sample Output 0
26.96
31.98
32.69
32.41
32.32
30.5
29.18
30.8
30.46
30.63
30.96
......


I think I need to use
https://scikit-learn.org/stable/auto_examples/linear_model/plot_polynomial_interpolation.html#sphx-glr-download-auto-examples-linear-model-plot-polynomial-interpolation-py
https://commons.apache.org/proper/commons-math/javadocs/api-3.0/org/apache/commons/math3/analysis/polynomials/PolynomialFunctionLagrangeForm.html#value(double)
*/


import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FillinData {



    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("data/fillin.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));

        int readingsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> readings = new ArrayList<>();

        for (int i = 0; i < readingsCount; i++) {
            String readingsItem = bufferedReader.readLine();
            readings.add(readingsItem);
        }

        Miss.calcMissing(readings);

        bufferedReader.close();
    }
}


class Miss {

    /*
     * Complete the 'calcMissing' function below.
     *
     * The function accepts STRING_ARRAY readings as parameter.
     */

    public static void calcMissing(List<String> readings) {
        // Write your code here

        DecimalFormat df3 = new DecimalFormat("#.###");

        ArrayList<Integer> miss = null;
        ArrayList<Double> y = null;
        double count = 0.000;
        int i = 0;

        ListIterator<String> listIterator = readings.listIterator();
        while (listIterator.hasNext()){

            String s = listIterator.next();
            String sub = s.substring(s.indexOf(":") + 7);
            //System.out.println();
            if(sub.contains("M")){
                miss.add(i);
            }
            System.out.println(df3.format(Double.valueOf(s.substring(s.indexOf(":") + 7))));
        }



    }

}

