class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int [] arr = new int [n];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i<n; i++){
            arr[i]= arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[n-1];
    }
}