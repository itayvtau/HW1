import java.util.Arrays;

public class Assignment01Q04 {

    public static void shiftpos(int[] array) {
        int size = array.length - 1;
        int last = array[size];
        for (int i = size; i > 0; i--)
            array[i] = array[i-1];
        array[0] = last;
    }

        public static void shiftneg(int[] array) {
        int size = array.length - 1;
        int first = array[0];
        for (int i = 0; i < size; i++)
            array[i] = array[i+1];
        array[size] = first;
    }


    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0 || (direction != 'R' && direction != 'L')) {
            return array;
        }
        move = move % array.length;
        if ((direction == 'R' && move > 0) || (direction == 'L' && move < 0)) {
            for (int i = 0; i < Math.abs(move); i++) {
                shiftpos(array);
            }
        } else{
            for (int i = 0; i < Math.abs(move); i++)
                shiftneg(array);
        }
        
        return array;
    }

    public static void main(String[] args) {
     
    
     
     
       System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}