import java.util.Arrays;

public class Main
{
    public static void main(String args[])
    {
        //1
        //a
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}
                                 , {"Brian", "Elenor", "Harry", "Lenny"}
                                  ,{"Cathy", "Fred", "Jill", "Matt"}};
        for (String[] printChart : seatingChart)
        {
            System.out.println(Arrays.toString(printChart));
        }

        //b
        seatingChart[1][2] = "Paul";
        for (String[] printChart : seatingChart)
        {
            System.out.println(Arrays.toString(printChart));
        }

        //c
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        for (String[] printChart : seatingChart)
        {
            System.out.println(Arrays.toString(printChart));
        }

        //d
        String[] tempRow = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempRow;
        for (String[] printChart : seatingChart)
        {
            System.out.println(Arrays.toString(printChart));
        }

        //predict
        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        //2
        //a
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int [3][2];
        for (int[] printArr1 : arr1)
        {
            System.out.println(Arrays.toString(printArr1));
        }

        //b
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] printArr1 : arr1)
        {
            System.out.println(Arrays.toString(printArr1));
        }
        for (int[] printArr2 : arr2)
        {
            System.out.println(Arrays.toString(printArr2));
        }

        //c
        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;
        for (int[] printArr2 : arr2)
        {
            System.out.println(Arrays.toString(printArr2));
        }

        //predict
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}
