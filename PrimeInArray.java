public class PrimeInArray {
    public static void main(String[] args) {
        int arr[] = {25,11,17,49,31,95,94,75,3,5};
        int size = 0;
        int prime = 0;
        int arr1[] = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            prime = 0;
            for (int j=2; j<arr[i]/2; j++){
                if (arr[i]%j == 0){
                    prime = 1;
                    break;
                }
            }
            if (prime==0) {
                arr1[size] = arr[i];
                size++;
            }
        }
        for (int i=0; i<size; i++){
            System.out.println(arr1[i]+ " ");
        }
    }
}
