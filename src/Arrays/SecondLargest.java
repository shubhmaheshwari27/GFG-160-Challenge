package Arrays;

public class SecondLargest {


    public static int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;

        int la = -1, sla = -1;
        for(int i =0; i <= n-1; i++){
            if(arr[i] > la) {
                sla = la;
                la = arr[i];
            }else if(arr[i]< la && arr[i]> sla){
                sla = arr[i];
            }
        }return sla;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,6,7};
        System.out.println(getSecondLargest(arr));

    }
}

// Arrays.sort(arr);

// for(int i = 0; i <= n-2; i++){
//     if(arr[n-2] != arr[n-1]){
//         return arr[n-2];
//     }
// }
// return -1;
