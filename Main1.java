package com.company;
import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
       // num29() ;
       // num54() ;
        // num79() ;
        // num104() ;
        //num129() ;
    }
    public static void num29() {
        //Данны вещественное число a и натуральное чсило n . Вычислить : P = a(a+1)...(a+n-1) !

        Scanner sc = new Scanner(System.in);
        double result =  1 ;

        System.out.println("Enter a ");
        double a = sc.nextDouble();
        System.out.println("Enter n ");
        int n = sc.nextInt();
        for(int i = 1 ; i != n+1 ; i++) {
            result = result*(a+i-1) ;
        }
        System.out.println("P = "+ result);
        }



   public static void num54() {
        // Выичислить суму : 1 + (1/2) + (1/3)+...+ (1/n) !
        Scanner sc = new Scanner(System.in);
        double result = 0 ;
        System.out.println("Enter n ");
        int n = sc.nextInt();
        for(double i = 1 ; i != n+1 ;i++) {
             result = result + (1/i) ;
        }
       System.out.println("Result = "+ result);
    }


    public static void num79() {
        // Вычислить приближенно площадь фигуры , образованной кривой у = 0,3(x-1)^2 +4 , осью абсцис
        // и двумя прямыми у = 1 , у = 1 , у = 3 !

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        double x = sc.nextDouble();
        double f = ( 4 + 0.3 * (Math.pow((x - 1), 2))) ;
        int a = 1 ;
        int b = 3 ;
        double l = 0.001 ;
        double s = 0 ;
        double i = a + l ;
        while(i <= b){
            double m = (0.3*(Math.pow((x-1) , 2))+4) + (0.3*(Math.pow(((x-l)-1) , 2))+4) ;
            double h = l;
            s = s + m*l ;
            i = i + 1 ;
        }
        System.out.println("Result = "+ s);
    }


    public static void num104() {
        // В области К районв . Известно kоличество жителей и плотность населения каждого района .
        // Определить самый густонаселенный район .

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[][] m1 = new int[k][4] ;
        int max = 1 ;
        for(int i = 0; i < k ; i++){
            m1[i][0] = i + 1 ; // Номер района
            m1[i][1] = (int) (Math.random()*200+30); ; //  kоличество жителей
            m1[i][2] = (int) (Math.random()*20+10); // площадь
            m1[i][3] = (int) (m1[i][1]/m1[i][2]) ; // плотность населения
             System.out.print(" "+  m1[i][0]   + " \t");
             System.out.print(" "+ m1[i][1] + " \t");
             System.out.print(" "+ m1[i][2] + " \t");
             System.out.println(" "+ m1[i][3] + " \t");
        }
        for(int i = 0 ; i < k ; i++){
            System.out.println(" The average population density in the "+ (i + 1)  +" is "+ (m1[i][1]/m1[i][2]) + " people per square kilometer ");
             if( m1[i][1]/m1[i][2] > m1[max][1]/m1[max][2]) {
               max = i+1 ;
             }
             if(i == k-1){
                 System.out.println(" Max = " + max);
             }
        }
    }

    public static void num129() {
        // Проверить , существует ли читырехзначное число сумма пятых степеней цифр которого равно самому числу !

       for( int chislo = 1000  ; chislo < 10000 ;) {
           int newchislo = (int) ((Math.pow((chislo/1000) , 5)) + (Math.pow(((chislo/100)%10) , 5)) + (Math.pow(((chislo/10)%10) , 5)) + (Math.pow((chislo% 10) , 5)));
           if(chislo != newchislo && chislo < 10000) {
               chislo++ ;
           } else if(chislo == newchislo){
               System.out.println(" The sum of the digits to the fifth power of " + chislo + "  is equal to the number ");
               chislo = 10000 ;
           } else if(chislo != newchislo || chislo == 9999 ) {
               System.out.println(" A four-digit number the sum of the digits to the fifth power of which is equal to the number does not exist ");
           }
           }
    }
    }

