class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        generatesub(nums,ans,new ArrayList<Integer>(),0);
        return ans;
    }
    
    private void generatesub(int [] nums, List<List<Integer>> ans ,  ArrayList<Integer> currentsubset,int currentIndex)
    {
        if(currentIndex>=nums.length)
        {
            ans.add(new ArrayList<>(currentsubset));
            return ;
        }
        
       
        //for considered case when we consider adding a number of currentIndex to the subset
        
        generatesub(nums,ans,currentsubset,currentIndex+1);
        // now we undo the changes made in the first case as it woould make all the additions duplicate
         currentsubset.add(nums[currentIndex]);
        
        generatesub(nums,ans,currentsubset,currentIndex+1);
        currentsubset.remove(currentsubset.size()-1);
      
    }
}