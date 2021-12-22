import java.util.Scanner;

public class Square3x3{

    public Square3x3(int[][] arr4x4) {
    }

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        int [][] arr3x3 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr3x2x1 = new int[][] {{1,2,3},{4,5},{7}};
        int [][] arr1x3x2 = new int[][] {{1},{4,5,6},{7,8}};
        int [][] arr2x2 = new int[][] {{1,2},{3,4}};
        int [][] arr4x4 = new int[][] {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        int [][] arr3x2 = new int[][] {{1,2,3},{4,5,6}};
        int [][] arr2x3 = new int[][] {{1,2},{3,4},{5,6}};
        int [][] arr4x2 = new int[][] {{1,2,3,4},{4,5,6,8}};
        int [][] arr1x4 = new int[][] {{1},{2},{3},{4}};

        int[][] square2 = new int[0][0];
        Square3x3 square1 = new Square3x3(square2);
        Square3x3 square = null;

        String answer = "", answer3 = "";

        System.out.println("Square3x3");
        System.out.println("***************");

        System.out.print("First constructur :");
        answer = "";
        answer = square1.toString();
        if (answer.equals("-1\t-1\t-1\n-1\t-1\t-1\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square1 + "\nCount on :\n-1\t-1\t-1\n-1\t-1\t-1\n-1\t-1\t-1\n");

        System.out.println("\nSecound constructur");
        System.out.println("***************");
        System.out.print("arr3x3 :");
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n7\t8\t9\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t2\t3\n4\t5\t6\n7\t8\t9\n");


        System.out.print("arr4x4 :");
        square = new Square3x3(arr4x4);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n7\t8\t9\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t2\t3\n4\t5\t6\n7\t8\t9\n");


        System.out.print("arr2x2 :");
        square = new Square3x3(arr2x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t-1\n3\t4\t-1\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t2\t-1\n3\t4\t-1\n-1\t-1\t-1\n");


        System.out.print("arr3x2 :");
        square = new Square3x3(arr3x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n");


        System.out.print("arr2x3:");
        square = new Square3x3(arr2x3);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t-1\n3\t4\t-1\n5\t6\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t2\t-1\n3\t4\t-1\n5\t6\t-1\n");


        System.out.print("arr4x2:");
        square = new Square3x3(arr4x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n");


        System.out.print("arr1x4:");
        square = new Square3x3(arr1x4);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t-1\t-1\n2\t-1\t-1\n3\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t-1\t-1\n2\t-1\t-1\n3\t-1\t-1\n");


        System.out.print("arr3x2x1:");
        square = new Square3x3(arr3x2x1);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t-1\n7\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t2\t3\n4\t5\t-1\n7\t-1\t-1\n");


        System.out.print("arr1x3x2:");
        square = new Square3x3(arr1x3x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n");



        System.out.print("\nThird constructur :");
        Square3x3 squareThree = new Square3x3(square2);
        answer = "";
        answer = square.toString();
        if (answer.equals("1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error :\n" + square + "\nCount on :\n1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n");

        square= new Square3x3(arr3x3);


        System.out.println("\n\nMethods");
        System.out.println("***************\n");


        System.out.println("getCell Methods");
        System.out.println("***************");

        System.out.print("All cells :");
        answer = "";
        for (int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                answer += square.getCell(i,j) + " ";

        if (answer.equals("1 2 3 4 5 6 7 8 9 "))
            System.out.println("OK");
        else
            System.out.println("Error : " + answer + "\nCount on :\n1 2 3 4 5 6 7 8 9\n");


        System.out.print("outband row\\col :");
        answer = "";
        answer = square.getCell(-1,1) + " " + square.getCell(3,1) + " " +
                square.getCell(1,-1) + " " + square.getCell(1,3) + " " +
                square.getCell(-1,-1) + " " + square.getCell(-1,3) + " " +
                square.getCell(3,-1) + " " + square.getCell(3,3);
        if (answer.equals("-1 -1 -1 -1 -1 -1 -1 -1"))
            System.out.println("OK");
        else
            System.out.println("Error : " + answer + "\nCount on :\n-1 -1 -1 -1 -1 -1 -1 -1\n\n");


        System.out.print("setXY:");
        square1.setXY(0, 0, 1);
        square1.setXY(1, 1, 2);
        square1.setXY(2, 2, 3);
        square1.setXY(0, 2, 4);
        square1.setXY(2, 0, 5);
        square1.setXY(0, 1, 6);
        square1.setXY(1, 2, 7);
        square1.setXY(1, 0, -3);
        square1.setXY(2, 1, 10);
        square1.setXY(-1, 3, 1);
        square1.setXY(3, -1, 2);
        square1.setXY(-1, 1, 3);
        square1.setXY(3, 1, 4);
        square1.setXY(0, -1, 5);
        square1.setXY(0, 3, 6);

        answer = "";
        answer = square1.toString();
        if (answer.equals("1\t6\t4\n-3\t2\t7\n5\t10\t3\n"))
            System.out.println("OK");
        else
            System.out.println("Error : " + square1 + "\nCount on :\n1\t6\t4\n-3\t2\t7\n5\t10\t3\n");

        System.out.print("\nallThere :");
        if (!square1.allThere())
            System.out.println("OK");
        else
            System.out.println("Error : " + square1.allThere() + "Count on : false");

        System.out.print("allThere :");
        if (square.allThere())
            System.out.println("OK");
        else
            System.out.println("Error : " + square.allThere() + "Count on : true");

        boolean[] digits = new boolean[10];
        boolean flag = true;
        System.out.print("\nwhosThereRow :");
        for(int i=0; i<3; i++)
            square.whosThereRow(i, digits);

        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;

        if(flag)
            System.out.println("OK");
        else
            System.out.println("Error : " + flag + "Count on : true");

        for(int i=1; i<10; i++)
            digits[i] = false;
        flag = true;

        System.out.print("whosThereRow :");
        for(int i=0; i<3; i++)
            square1.whosThereRow(i, digits);

        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;

        if(!flag)
            System.out.println("OK");
        else
            System.out.println("Error : " + flag + "Count on : false");

        for(int i=1; i<10; i++)
            digits[i] = false;
        flag = true;

        System.out.print("\nwhosThereCol :");

        for(int i=0; i<3; i++)
            square.whosThereCol(i, digits);

        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;

        if(flag)
            System.out.println("OK");
        else
            System.out.println("Error : " + flag + "Count on : true");

        for(int i=1; i<10; i++)
            digits[i] = false;
        flag = true;

        System.out.print("whosThereCol :");

        for(int i=0; i<3; i++)
            square1.whosThereCol(i, digits);

        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;

        if(!flag)
            System.out.println("OK");
        else
            System.out.println("Error : " + flag + "Count on : false");
    }

    private String getCell(int i, int j) {
        return null;
    }

    private void setXY(int i, int i1, int i2) {
    }

    private void setXY() {
    }

    private boolean allThere() {
        return false;
    }

    private void whosThereCol(int i, boolean[] digits) {
    }

    private void whosThereRow(int i, boolean[] digits) {
    }
}