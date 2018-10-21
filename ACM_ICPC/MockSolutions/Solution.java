import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int i=0;
        while(i<20){
            String record=in.nextLine().trim();
            char n=record.charAt(0);
            String name=record.substring(1,record.length()).trim();

            if(n=='-')
                if(record.charAt(1)=='1')
                    return;

            if(n<-1 && n>9){
                System.out.println("Number must be between 0-9");
                return;
            }

            if(name.length()>30){
                System.out.println("Name must contain characters below 30");
                return;
            }

            else if(n=='0')
                System.out.println("Bonjour "+name);
            else if(n=='1')
                System.out.println("Ola "+name);
            else if(n>'1')
                System.out.println("Hello "+name);

        }

    }
}

