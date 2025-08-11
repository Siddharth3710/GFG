class Solution {
    public static int minimumCostOfBreaking(int[] x, int[] y, int M, int N) {
        int v = 0, h = 0;
        int vp = 1, hp = 1;
        int tc = 0;
        
        Arrays.sort(x);
        Arrays.sort(y);
        reverseArray(x);
        reverseArray(y);
        
        while(v < x.length && h < y.length) {
            if(x[v] >= y[h]) {
                tc += (x[v] * hp);
                vp++;
                v++;
            } else {
                tc += (y[h] * vp);
                hp++;
                h++;
            }
        }
        
        while(v < x.length) {
            tc += (x[v] * hp);
            vp++;
            v++;  
        }
        
        while(h < y.length) {
            tc += (y[h] * vp);
            hp++;
            h++;
        }
        
        return tc;
    }
     
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}