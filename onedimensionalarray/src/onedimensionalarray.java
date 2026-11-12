public class onedimensionalarray {
    static void main(String[] args) {

        //Una po is declaration ng array from sa mga given values, double data type kase may decimal num
        double[] temperatures = new double[5];
        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        //Next para ma print yung initial temperatures
        System.out.println("Initial temperatures: ");

        //For loop, start sa 0 hanggang sa length ng array which is 5 kaya may increment
        for (int i = 0; i < temperatures.length; i++) {

            //Para ma print po yung mga temp from Day 1 to 5
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }
        //Next naman is to update yung index[2] na temperature which is 31.8 to 32.0
        temperatures[2] = 32.0;

        //Last, print natin yung updated temperature ni temperature array, index [2]
        System.out.println("Updated temperature for the third day: " + temperatures[2]);
    }
}