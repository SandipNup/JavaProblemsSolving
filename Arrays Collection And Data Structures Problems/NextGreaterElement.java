public class NextGreaterElement {

    public static void printNextGreaterElement(int[] arr){

        for(int i= 0; i<arr.length-1; i++){
            int nge = -1;
            for(int j = i; j<arr.length-1; j++){
                if(arr[i] < arr[j]){
                    nge = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " : " + nge);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 3,8, 9};
        printNextGreaterElement(arr);
    }
}
