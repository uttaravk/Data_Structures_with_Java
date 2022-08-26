public class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        for(int pos =digits.length-1; pos>=0; pos--){
            if(digits[pos]!=9){
                digits[pos]=digits[pos]+1;
                return digits;
            } else {
                digits[pos]=0;
            }
        }
        int[] output = new int[digits.length+1];
        output[0]=1;
        return output;
    }
}