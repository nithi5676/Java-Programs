import java.io.*;
import java.util.*;

public class ATM {
     public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
    double cashwith = sc.nextDouble();
    double intialbal =sc.nextDouble();
    if((cashwith>0 && cashwith<=2000)&&(intialbal>0 && intialbal<=2000)){
        if(intialbal<cashwith){
            System.out.println(String.format("%.2f",intialbal));
        }
        else if(cashwith%5.0==0.0){
            intialbal = (intialbal-cashwith)-0.50;
            System.out.println(String.format("%.2f",intialbal));
        }
        else
            System.out.println(String.format("%.2f",intialbal));
    }
    }
}