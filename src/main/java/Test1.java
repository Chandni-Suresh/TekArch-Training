import java.util.Scanner;

public class Test1 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        System.out.println("Enter the range of  numbers ");
         int n = sc.nextInt();


    // for loop to print all numbers divisible by 5
        System.out.println("Executing for loop");

        for (int i = 1; i <= n; i++) {
        if (i % 5 == 0)
            System.out.println(i);
    }


    //While loop
        System.out.println("Executing while loop");
    int j = 1;
        while (j <= n) {
        if (j % 5 == 0)
            System.out.println(j);
        j++;
    }

        System.out.println("Executing while DO loop");
    int x=1;
        do {
        if (x % 5 == 0)
            System.out.println(x);
        x++;

    }while (x <= n) ;

        System.out.println("Divisibility by 8 check ");
        for(int i=200; i>=100;i--)
    {
        if(i%8==0)
            System.out.println(i);
    }
}

}
