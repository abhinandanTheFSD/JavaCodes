public class PallindromeNumber{
    public static void main (String [] args){
        int r , sum = 0;
        int temp;
        int n = 121;

        temp = n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }

        if(temp==sum){
           System.out.println(temp + " Is Pallindrome Number");
        }
        else{
            System.out.println(temp + " Is Not Pallindrome Number");
        }
    }
}