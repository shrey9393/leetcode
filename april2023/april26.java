class Solution {
    public int addDigits(int num) {
    int Dr = 0;
    while (num > 0) {
        Dr += num % 10;
        num = num / 10;
        if (num == 0 && Dr > 9) {
            num = Dr;
            Dr = 0;  
        }    
    }     
    return Dr;
}
}