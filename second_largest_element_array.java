public class second_largest_element_array {
    public static void main(String[] args) {
        int[] arr = { 2, 21, 15, 19, 64, 42, 0 };
        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if(arr[i]<arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;



                }

            }
        }
        for(int i=0;i<arr.length;i++){
         
            System.out.print(arr[i] + " ");
        }
        System.out.println("SECOND LARGEST ELEMENT IS " + arr[1]);

    }

}
