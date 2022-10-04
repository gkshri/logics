class Solution {
    public int findMin(int[] nums) {
        int s,e,m,mid,i,n,pivot=0,k,l;
        n = nums.length;
        for(i=0;i<n-1;i++)
        {
            if(nums[i] > nums[i+1])
            {
                 pivot = i;
                break;
            }
        }
        s=0;
        e = n-1;  
        k = bs(nums,s,pivot);
        l = bs(nums,pivot+1,e);
        if(k< l){
            return k;
        }
        else
            return l;
    }
    public int bs(int [] a , int s ,int e){
        int m=a[0];
       for(int i = s ; i<=e;i++){
           if(m >= a[i]){
               m =a[i];
           }
       }
        return m;
}
}
