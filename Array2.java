public class Array2 {
    // not fix size array
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        // using for each loop
        for (int i : arr) {
            System.out.println(i);
        }
        // find and element
        int[] arr1 = { 1, 2, 5, 33, 6 };
        for (int i:arr1) {
            if (i == 33) {
                System.out.println("found :"+i);
            }

        }

        //Find Mxa element 
          int[] arr3 = new int[5];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        arr3[3] = 4;
        arr3[4] = 5;

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > res) {
                res = arr3[i];
            }
        }
        System.out.println("Max element: " + res);
    }
}
