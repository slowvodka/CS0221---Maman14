/**
 * this class implements all the functions for this assignment
 * 1) maximal drop
 * 2) isSink
 * 3) size
 * 4) isPermutation
 *
 * it also has the following private methods:
 * 1) overloading for Size (since size is recursive the public size function is a wrapper)
 * 2) CopyArray - to recursively copy a 2d array
 * 3) multRec
 * 4) addRec
 * 5) addRecPow
 */

public class Ex14 {

    /**
     * function calculates and returns maximal drop between two peaks
     * @param a int array
     * @return int - maximal drop between two peaks
     *
     * complexity, time: O(n) , space O(1)
     * we will iterate the whole array once, and it depends on the array length
     */
    public static int maximalDrop (int [] a){

        if (a.length <=1)
            return 0;

        int max = a[0];
        int min = a[0];
        int drop = 0;
        for (int i = 0 ; i < a.length ; i++ )
        {
            //if the next number is smaller then min - we found a new min
            if (a[i] < min)
                min = a[i];
            //if max - min is bigger the current drop we have a new drop
            if (max - min > drop)
                drop = max - min;
            //if we found a new max we update it and the min to make sure min will be after
            //the max
            if (a[i] > max)
            {
                max = a[i];
                min = a[i];
            }
        }

        return drop;
    }//end of maximalDrop

    /**
     * function that finds if there is a sink in the matrix
     * a sink is defined as the row k filled with zeroes and the column k filled with ones (except [mat[k][k]
     * which is also zero)
     * @param mat - int matrix with nXn dimentions filled with 1 or 0
     * @return int - number of col/row that is sink, otherwise returns -1 (if no sink in mat)
     *
     * complexity, time: O(n) , space O(1)
     *
     * in the worst case it will have to iterate through all the height of the array twice (2n) (* see that in the last else you have i-- *)
     * to find a potential sink and then to iterate through the column and the row to validate it
     * also n. so in conclusion ~3n iterations = O(n)
     */
    public static int isSink (int [][] mat){
        int potential = 0;
        boolean checkCol = false;
        //iteration through the rows
        for (int i = 0; i<mat.length ; i++)
        {
            //if position [i][i] is not zero - the row cannot be sink so skip
            if (!checkCol && mat[i][i] == 1)
                continue;
            //if the position is equals one let`s mark it as a potential sink
            if (!checkCol && mat[i][i] == 0)
            {
                potential = i;
                //indicates to start checking the columns
                checkCol = true;
                continue;
            }
            //if we need to check the column and it equals to 1 do nothing
            if (checkCol && mat[i][potential] == 1) {
                continue;
            }
            else
            {
                //in case our potential sink is not that potential anymore
                checkCol = false;
                potential = -1;
                i--;
            }
        }
        //if we have a potential candidate iterate over it`s column
        for (int i = 0; potential != -1 && i< mat.length ; i++)
        {
            if ((mat[i][potential] == 1 && mat[potential][i] == 0) || (i==potential && mat[potential][i] == 0))
                continue;
            else
                potential = -1;
        }

        return potential;
    }////end of isSink


    /**
     * wrapper for the other size function
     * function receives a boolean 2d array and a position.
     * and returns the size of the stain (this and all adjacent squares that have true
     * in case x,y point to a clean position or x,y is out of array boundaries return 0
     * @param mat 2d boolean matrix true indicates stain
     * @param x - int, x position
     * @param y - int, y position
     * @return - int - size of the stain
     */
    public static int size (boolean[][] mat, int x, int y) {
        if (mat == null || mat.length == 0 || mat[0].length == 0 )
            return 0;
        //copy of mat
        boolean[][] copy = new boolean[mat.length][mat[0].length];
        copy = CopyArray(copy, mat.length-1, mat[0].length-1, mat);

        //overloading of size
        int size = size(x,y, copy);

        return size;

    }//end of Size

    /**
     * function receives a boolean 2d array and a position and returns the size of the stain
     * in case x,y point to a clean position or x,y is out of array boundaries return 0
     * @param x - int, x position
     * @param y - int, y position
     * @param copy 2d boolean matrix true indicates stain
     * @return - size of the stain
     */
    private static int size (int x, int y,boolean[][] copy) {
        if (x < copy.length && y < copy[0].length && x >= 0 && y >= 0 && copy[x][y]) {
            copy [x][y] = false;
            return 1 + size(x + 1, y,copy) + size(x - 1, y,copy) + size(x, y + 1,copy) + size(x, y - 1,copy) + size(x + 1, y + 1,copy) + size(x - 1, y - 1,copy) + size(x - 1, y + 1,copy) + size(x + 1, y - 1,copy);
        }
        else {
            return 0;
        }
    }//end of Size_overload

    /**
     * private function to copy a boolean 2d array recursively
     * @param copy 2d array in the size of the original. any value will be overwritten
     * @param row - number of row in the original / copy array
     * @param column number of columns in the original / copy array
     * @param orig - 2d boolean array, original
     */
    private static boolean[][] CopyArray(boolean [][] copy,int row,int column, boolean[][] orig)
    {
        if (row != 0 || column!=0) {
            copy[row][column] = orig[row][column];
            if (column == 0)
                CopyArray(copy, row - 1, copy[0].length - 1, orig);
            else
                CopyArray(copy, row, column - 1, orig);
        }
        copy[0][0] = orig[0][0];
        return copy;

    }//end of CopyArray

    /**
     * function finds out if two array`s a a permutation of each other
     * if arrays have same length, same sum, same mult and same sum of power of 2, they have the same numbers
     * @param a int array
     * @param b int array
     * @return return True if arrays are permutation of each other
     */
    public static boolean isPermutation (int [] a, int [] b){
        //my flag
        boolean per = false;
        //can be permutation only if same length array
        if (a.length == b.length)
            if (a.length == 0 && b.length == 0)
                per = true;
            else
                if (addRec(a, 0) == addRec(b, 0))
                    if (multiRec(a, 0) == multiRec(b, 0))
                        if (addRecPow(a, 0) == addRecPow(b, 0))
                            per = true;
        return per;

    }// end of isPermutation

    /**
     * private method that multiplies all numbers in int array and returns an answer recursively
     * @param intArr - int arr
     * @param index - the current index of the array
     * @return - int - the multiplication of all numbers in arr
     */
    private static int multiRec (int[] intArr, int index){
        if (index != intArr.length)
        {
            return intArr[index] * multiRec(intArr,index+1);
        }
        return 1;
    }//end of multiRec

    /**
     * private method that adds up all numbers in int array and returns an answer recursively
     * @param intArr - int arr
     * @param index - the current index of the array
     * @return - int - the addition of all numbers in arr
     */
    private static int addRec (int[] intArr, int index){
        if (index != intArr.length)
        {
            return intArr[index] + addRec(intArr,index+1);
        }
        return 0;
    }//end of addRec

    /**
     * private method that adds up all power of 2 numbers in int array and returns an answer recursively
     * @param intArr - int arr
     * @param index - the current index of the array
     * @return - int - the addition of all power of 2 of numbers in arr
     */
    private static int addRecPow (int[] intArr, int index){
        if (index != intArr.length)
        {
            return (int) (Math.pow(intArr[index],2)  + addRecPow(intArr,index+1));
        }
        return 0;
    }//end of addRec

}//end of Ex14
