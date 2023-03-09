public class String_Sorting {
    public static void main(String[] args) {
        String array[] = {"Nitin", "Ashish", "Vaibhav","Abhishek"};
        int size = array.length;
        String temp = null;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(array[j].compareTo(array[i])<0){
                    //swap the string
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i=0; i<size; i++){
            System.out.println(array[i]);
        }
    }
}
