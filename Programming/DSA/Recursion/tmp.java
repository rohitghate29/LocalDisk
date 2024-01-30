class tmp {
   public static int [] printNos(int x) {
    int arr [] = new int [x];
    printNums(arr, x);
    return arr;
   }

   static void printNums(int [] arr, int n) {
    if(n <= 0){
        return;
    }
    arr[n-1] = n;
    printNums(arr, n-1);
   }

   public static void main(String[] args) {
    int arr []= printNos(10);
    for(int n : arr) {
        System.out.print(n+" ");
    }
   }
}