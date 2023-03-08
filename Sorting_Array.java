public class Sorting_Array {
    public static void main(String[] args) {
        int[] array = {85, 95, 72, 83, 97};
        int size = array.length;
        System.out.print("Given list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i= array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
//        System.out.println("");
//        for (int i = 0; i < size; i++) {
//            for (int j = i; j < size; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        System.out.print("Sorted List: ");
//        for (int i = 0; i < size; i++) {
//            System.out.print(" " + array[i]);
//        }
    }
}
