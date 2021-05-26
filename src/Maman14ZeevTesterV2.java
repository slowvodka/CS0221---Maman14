public class Maman14ZeevTesterV2
{
    public static void main(String[] args) {


        System.out.println("********** Test Maman14 - Start **********\n");
        System.out.println("Notes!:\n" +
                "*if says Exception - it means the code does not run at all!!!!\n" +
                "*this TESTER does not check complexity and does not check you did not " +
                "use loops \\ used only recursion in Q3 & Q4\n");
        System.out.println("LAST UPDATE: 03-May-2021\n");
        System.out.println("**** Test - maximalDrop - does it works? **** ");
        maximalDropTester();
        //add tests for all negative?
        System.out.println("* my complexity for maximalDrop is O(n) *\n ");

        System.out.println("**** Test - isSink - does it works? **** ");
        isSinkTester();
        System.out.println("* my complexity for maximalDrop is O(n) *\n ");
        //should i check if it is nXn?

        System.out.println("**** Test - size - does it works? **** ");
        sizeTester();

        System.out.println("**** Test - isPermutation - does it works? **** ");
        isPermutationTester();

        System.out.println("********** Test Maman14 - END **********\n");

    }//end of main


    public static void maximalDropTester() {
            int[] a;
            String s;
            int maxDrop,val;

            a = new int[]{5, 21, 3, 22, 12, 7, 27, 6, 4};
            val = 23;
            maximalDropTester (a, val);


            a = new int[]{5, 21, 3, 22, 12, 7, 26, 14};
            val = 18;
            maximalDropTester (a, val);

            a = new int[]{5, 15, 3, 22, 12, 7, 27, 14} ;
            val = 15;
            maximalDropTester (a, val);

            a = new int[]{15, 3} ;
            val = 12;
            maximalDropTester (a, val);

            a = new int[]{24, 16,23,23,1,30} ;
            val = 23;
            maximalDropTester (a, val);

            //add tests for all negative?

    }//end of maximalDropTester

    public static void maximalDropTester(int[] a, int val){
        try {
            int maxDrop = Ex14.maximalDrop(a);
            if (maxDrop == val)
                System.out.println("\tOK!");
            else
                System.out.println("\tError! - array: " + intArrAsStr(a) + " maxDrop should output: " + val + " your output: " + maxDrop);
        }catch (Exception e) {
            System.out.println("\tError - ** Exception ** - Q1 does not run");
        }
    }

    public static String intArrAsStr (int[] a){
        String s ="";
        for (int i = 0; i<a.length; i++)
            s = s + " " + a[i] + " ";
        s = "{"+s+"}";

        return s;
    }

    public static void isSinkTester() {

        try {
            int[][] a;
            int val;

            a = new int[][]{{0}};
            val = 0;
            isSinkTester(a, val);

            a = new int[][]{{1}};
            val = -1;
            isSinkTester(a, val);

            a = new int[][]{{1,1},{0,0}};
            val = 1;
            isSinkTester(a, val);

            a = new int[][]{{0,1,0},{0,0,0},{1,1,1}};
            val = 1;
            isSinkTester(a, val);

            a = new int[][]{{0,1,0,1},{1,1,1,1},{1,1,1,1},{0,0,0,0}};
            val = 3;
            isSinkTester(a, val);

            a = new int[][]{{0,1,0,1},{1,1,1,1},{1,1,1,1},{1,0,0,0}};
            val = -1;
            isSinkTester(a, val);

            a = new int[][]{{0,1,0,1,1,0},{1,0,1,1,0,0},{0,0,0,1,0,1},{0,0,0,0,0,0},{1,0,1,1,0,0},{0,1,0,1,1,1}};
            val = 3;
            isSinkTester(a, val);

            a = new int[][]{{0,1,0,0,0,1},{1,0,0,1,1,1},{0,0,0,0,0,0},{0,0,0,0,0,0},{1,1,1,1,1,1},{1,0,0,0,1,0}};
            val = -1;
            isSinkTester(a, val);

            a = new int[][]{{0,0,0,0,0,0},{0,0,0,0,0,1},{0,0,0,1,1,1},{0,0,1,1,1,1},{0,1,1,1,1,1},{1,1,1,1,1,1}};
            val = -1;
            isSinkTester(a, val);

            a = new int[][]{{0,0,0,0,0,0},{1,0,0,0,0,1},{1,0,0,1,1,1},{1,0,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1}};
            val = 0;
            isSinkTester(a, val);

            a = new int[][]{{1,1,1,1,1,1},{0,0,0,0,0,0},{1,1,0,1,1,1},{1,1,0,1,1,1},{1,1,1,1,0,0},{1,1,0,0,0,1}};
            val = 1;
            isSinkTester(a, val);

            a = new int[][]{{0,1,1,1,1,1},{0,0,1,1,1,1},{0,0,0,1,1,1},{0,0,0,0,1,1},{0,0,0,0,0,1},{0,0,0,0,0,0}};
            val = 5;
            isSinkTester(a, val);

            a = new int[][]{{1,1,1,1,1,1},{1,1,1,1,1,0},{1,1,1,1,0,0},{1,1,1,0,0,0},{1,1,0,0,0,0},{1,0,0,0,0,0}};
            val = -1;
            isSinkTester(a, val);

            a = new int[][]{{0,1,0,0,0,0},{0,0,0,0,0,0},{0,1,0,0,0,0},{0,1,0,0,0,0},{0,1,0,0,0,0},{0,1,0,0,0,0}};
            val = 1;
            isSinkTester(a, val);

            a = new int[][]{{0,0,0,1,0,0},{0,0,0,1,0,0},{0,0,0,1,0,0},{0,0,0,0,0,0},{0,0,0,1,0,0},{0,0,0,1,0,0}};
            val = 3;
            isSinkTester(a, val);

            a = new int[][]{{1,1,1,1,1,1},{1,1,1,1,1,1},{0,0,0,0,0,0},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1}};
            val = 2;
            isSinkTester(a, val);

            a = new int[][]{{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{0,0,0,0,0,0}};
            val = 5;
            isSinkTester(a, val);

            //should i check if it is nXn?
        } catch (Exception e) {
            System.out.println("\tError - ** Exception ** - Q2 does not run");
        }

    }//end of isSinkTester

    public static void isSinkTester(int[][] a, int val) {
        try {
            int isSink = Ex14.isSink(a);
            if (isSink == val)
                System.out.println("\tOK!");
            else
                System.out.println("\tError! - array: \n" + intArrAsStr(a) + " \nisSink should output: " + val + " your output: " + isSink);
        }
        catch (Exception e) {
            System.out.println("\tError - Exception - Q2 does not run");
        }
    }

    public static String intArrAsStr (int[][] a){
        String s ="";
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a.length; j++)
                s = s + " " + a[i][j] + " ";
            s = s + "\n";
        }
        s = "{"+s+"}";

        return s;
    }

    public static void sizeTester() {

        boolean[][] mat1,mat2;
        int val,x,y;

        //1
        mat1 = new boolean[][]{{false}};
        mat2 = new boolean[][]{{false}};
        val = 0; x = 0; y = 0;
        sizeTester(mat1, mat2, val,x,y);

        //2
        mat1 = new boolean[][]{{true}};
        mat2 = new boolean[][]{{true}};
        val = 1; x = 0; y = 0;
        sizeTester(mat1, mat2, val,x,y);

        //3
        mat1 = new boolean[][]{{true,true}};
        mat2 = new boolean[][]{{true,true}};
        val = 2; x = 0; y = 0;
        sizeTester(mat1, mat2, val,x,y);

        //4
        mat1 = new boolean[][]{{true,true},{false,false}};
        mat2 = new boolean[][]{{true,true},{false,false}};
        val = 2; x = 0; y = 0;
        sizeTester(mat1, mat2, val,x,y);

        //5
        mat1 = new boolean[][]{{true,true},{true,false}};
        mat2 = new boolean[][]{{true,true},{true,false}};
        val = 3; x = 0; y = 0;
        sizeTester(mat1, mat2, val,x,y);

        //6
        mat1 = new boolean[][]{{true,true},{false,false}};
        mat2 = new boolean[][]{{true,true},{false,false}};
        val = 0; x = 1; y = 0;
        sizeTester(mat1, mat2, val,x,y);

        //7
        mat1 = new boolean[][]{{true,true,true,true},{true,true,true,true}};
        mat2 = new boolean[][]{{true,true,true,true},{true,true,true,true}};
        val = 8; x = 1; y = 1;
        sizeTester(mat1, mat2, val,x,y);

        //8
        mat1 = new boolean[][]{{true,true,true,true},{true,false,false,true},{true,false,false,true},{true,true,true,true}};
        mat2 = new boolean[][]{{true,true,true,true},{true,false,false,true},{true,false,false,true},{true,true,true,true}};
        val = 12; x = 0; y = 1;
        sizeTester(mat1, mat2, val,x,y);

        //9
        mat1 = new boolean[][]{{true,true,true,true},{true,false,false,true},{true,false,false,true},{true,true,true,true}};
        mat2 = new boolean[][]{{true,true,true,true},{true,false,false,true},{true,false,false,true},{true,true,true,true}};
        val = 0; x = 1; y = 1;
        sizeTester(mat1, mat2, val,x,y);

        //10
        mat1 = new boolean[][]{{true,true,true,true},{true,false,false,true},{true,false,false,true},{true,true,true,true}};
        mat2 = new boolean[][]{{true,true,true,true},{true,false,false,true},{true,false,false,true},{true,true,true,true}};
        val = 0; x = 2; y = 1;
        sizeTester(mat1, mat2, val,x,y);

        //11
        mat1 = new boolean[][]{{true,true,false,false},{true,false,false,false},{false,false,false,true},{true,true,true,true}};
        mat2 = new boolean[][]{{true,true,false,false},{true,false,false,false},{false,false,false,true},{true,true,true,true}};
        val = 3; x = 0; y = 0;
        sizeTester(mat1, mat2, val,x,y);

        //12
        mat1 = new boolean[][]{{true,true,false,false},{true,false,false,false},{false,false,false,true},{true,true,true,true}};
        mat2 = new boolean[][]{{true,true,false,false},{true,false,false,false},{false,false,false,true},{true,true,true,true}};
        val = 3; x = 1; y = 0;
        sizeTester(mat1, mat2, val,x,y);


    }//end of sizetester

    public static void sizeTester(boolean[][] mat1, boolean[][] mat2, int val,int x, int y) {
        try {
            int size = Ex14.size(mat1, x, y);
            if (size == val) {
                System.out.println("\tOK!");
                if (!boolArrAsStr(mat1).equals(boolArrAsStr(mat2)))
                    System.out.println("\tbut you changed the input Array");
            } else
                System.out.println("\tError! - array: \n" + boolArrAsStr(mat2) + " \nsize should output: " + val + " your output: " + size);
            } catch (Exception e) {
                 System.out.println("\tError - ** Exception ** - Q3 does not run");
            }
    }//end of sizetester

    public static String boolArrAsStr (boolean[][] a){
        String s ="";
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a[0].length; j++)
                s = s + " " + a[i][j] + " ";
            s = s + "\n";
        }
        s = "{"+s+"}";

        return s;
        }

    public static void isPermutationTester() {

        int[] a, b;
        boolean flag;

        //1
        a = new int[]{1};
        b = new int[]{1};
        flag = true;
        isPermutationTester(a,b,flag);

        //!1
        a = new int[]{2};
        b = new int[]{1};
        flag = false;
        isPermutationTester(a,b,flag);

        //2
        a = new int[]{1, 2};
        b = new int[]{1};
        flag = false;
        isPermutationTester(a,b,flag);

        //2
        a = new int[]{1, 2};
        b = new int[]{2, 1};
        flag = true;
        isPermutationTester(a,b,flag);

        //2
        a = new int[]{1, 3};
        b = new int[]{1, 1};
        flag = false;
        isPermutationTester(a,b,flag);

        //4
        a = new int[]{1, 2, 3, 4};
        b = new int[]{2, 4, 3, 1};
        flag = true;
        isPermutationTester(a,b,flag);

        //9
        a = new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2};
        b = new int[]{1, 1, 1, 1, 1, 2, 2, 2, 1};
        flag = false;
        isPermutationTester(a,b,flag);

        //1
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        b = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        flag = false;
        isPermutationTester(a,b,flag);

        //1
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        b = new int[]{2, 3, 4, 1, 9, 8, 7, 6, 5};
        flag = true;

        //does it really permutation
        a = new int[]{};
        b = new int[]{};
        flag = true;
        isPermutationTester(a,b,flag);

        a = new int[]{1,2,3};
        b = new int[]{};
        flag = false;
        isPermutationTester(a,b,flag);

        a = new int[]{};
        b = new int[]{1};
        flag = false;
        isPermutationTester(a,b,flag);

    }//end of isPermutationTester

    public static void isPermutationTester(int[] a, int[] b, boolean check) {
        try {
            int[] a1, b1;

            //1
            a1 = a.clone();
            b1 = b.clone();

            boolean flag = Ex14.isPermutation(a, b);
            if (flag == check) {
                System.out.println("\tOK!");
                if (!intArrAsStr(a).equals(intArrAsStr(a1)) || !intArrAsStr(b).equals(intArrAsStr(b1)))
                    System.out.println("\tbut you changed the input Array");
            } else
                System.out.println("\tError! - \na:\n" + intArrAsStr(a1) + " \nb:\n" + intArrAsStr(b1) + "\nshould be: " + check);
        }
        catch (Exception e) {
            System.out.println("\tError - Exception - Q4 does not run");
        }

    }//isPermutationTester helper

    public static void template() {

        try {


        } catch (Exception e) {
            System.out.println("\tError - Exception - Q4 does not run");
        }

    }//end of template


}// end of Maman14ZeevTester
