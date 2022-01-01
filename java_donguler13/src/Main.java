import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisi Giriniz:");
        int n= input.nextInt();
        int j,a=0,k,m=0,i,p=0;
        for ( i = 1; i <= n ; i++){
            for(k=0;k<2*n-1-m;k++){
                System.out.print("*");

            }
            System.out.print("\n");
            for(j=0;j<=a;j++) {
                System.out.print(" ");}
            a++;
            m=m+2;
        }}}
