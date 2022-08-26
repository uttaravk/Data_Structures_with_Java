public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int pos = nums.length-1;
        for(int i = 0; i<=pos; i++){
            if(nums[i]==val){
                while(pos>0 && nums[pos]==val) {
                    pos--;
                }
                if(pos>=i){
                   nums[i]=nums[pos];
                    pos--;
                }
            }
        }
        return pos+1;
    }
}
