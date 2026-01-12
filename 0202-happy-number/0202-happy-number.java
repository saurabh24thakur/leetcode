class Solution {
    public int isSq(int n){
        int sum = 0;
        while(n>0){
            int l = n%10;
            sum += Math.pow(l,2);
            n/=10;
        }
        return sum;

        // int num=n;
        // if(num>=0 && num<10){
        //     if(num==1){
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }

        // int digit1=num%10;
        // num=num/10;
        // int digit2=num%10;
        // num=num/10;

        // num=(int) (Math.pow(digit1,2) + Math.pow(digit2,2));

        // return isHappyHelper(num);



        
    }
    public boolean isHappy(int n) {
        int s =n, f = n;
        do{
             s = isSq(s);
             f = isSq(isSq(f));
        }while(s !=f);
        return s == 1;
    }
}