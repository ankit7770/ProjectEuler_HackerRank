import java.util.*;

public class MultiplesOf3And5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long test=sc.nextLong();
        for(long i=0;i<test;i++){
            long number=sc.nextLong();
            long divisibleOf3=0,divisibleOf5=0,divisibleOf15=0,sum1=0,sum2=0,sum3=0;
            divisibleOf3=(number-1)/3;
            divisibleOf5=(number-1)/5;
            divisibleOf15=(number-1)/15;
               /*
               * Using the formula
               * Sum of first n terms of an AP: S =(n/2)[2a + (n- 1)d]
               * */
               sum1=(6+((divisibleOf3-1)*3))*divisibleOf3/2;
               sum2=(10+((divisibleOf5-1)*5))*divisibleOf5/2;
               sum3=(30+((divisibleOf15-1)*15))*divisibleOf15/2;
            System.out.println(sum1+sum2-sum3);
        }
    }
}