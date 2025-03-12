public class Arraycontains{
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (n == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myArray = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};

        System.out.println(contains(myArray, 2013)); // true
        System.out.println(contains(myArray, 2015)); // false
    }
}
