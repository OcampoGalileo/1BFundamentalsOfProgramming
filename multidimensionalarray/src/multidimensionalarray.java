import java.util.Arrays;

public class multidimensionalarray {
    static void main(String[] args) {
        //Una po is Array Initialization
        String[][] seats = {

                //index [0] para sa first row, index [0] si Alice, [1] si Bob and [2] si Charlie
                {"Alice", "Bob", "Charlie"},

                //index [1] para sa second row, index [0] si David, [1] si Emma and [2] si Frank
                {"David", "Emma", "Frank"}
        };
        //Para maprint si Frank, print natin kung nasan siya (which is nasa index [1][2])
        System.out.println("Person in second row, third column: " + seats[1][2]);

        //Next is papalitan yung seats [0][1] which is si Bob ng "Vacant"
        seats[0][1] = "Vacant";

        /*Last is gamit tayo ng Arrays.deepToString() method para ma print yung updated
        na seating arrangement*/
        System.out.println("Updated seating arrangement: " + Arrays.deepToString(seats));
    }
}