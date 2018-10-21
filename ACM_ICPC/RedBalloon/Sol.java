import java.util.Scanner;

public class Sol {
    static boolean isPowerOfTwo(long n)
    {
        if (n == 0)
            return false;
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    static long checkLarge(long n){
        long x=0;
        for (long i = 0; i < n; i++) {
            if(isPowerOfTwo(i))
                x = i;

        }
        return x;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long num;
        String names[]={"Alice","Bob"};
        int current=0;
        while((num=in.nextLong())!=-1){

            if(isPowerOfTwo(num))
                num/=2;
            else if(!isPowerOfTwo(num)){
                long l=checkLarge(num);
                num-=l;
            }

            if(num==1)
                System.out.println(names[current]);

            else if(num!=1){

                while(num!=1){
                    if(current==0)
                        current=1;
                    else if(current==1)
                        current=0;

                    if(isPowerOfTwo(num))
                        num/=2;
                    else if(!isPowerOfTwo(num)){
                        long l=checkLarge(num);
                        num-=l;
                    }
                }
                System.out.println(names[current]);

            }
            current=0;

        }
    }
}

