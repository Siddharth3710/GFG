class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer>s=new Stack<>();
                int n = mat.length;

        for(int i=0;i<n;i++){
            s.push(i);
        }
        
        while(s.size()>1){
            
            int a=s.pop();
            int b=s.pop();
            
            if(mat[a][b]==1){
                s.push(b);
            }
            else{
                                s.push(a);
            }
        }
        
        if(s.isEmpty()){
            return -1;
        }
        
        int cand=s.pop();
        
        for(int i=0;i<n;i++){
            if(i!=cand){
                if(mat[i][cand]==0||mat[cand][i]==1){
                    return -1;
                }
            }
        }
                return cand;

    }
}