// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>1){
                return true;
            }
            
        }
        return false;
    }
}