
public class Main {
    public static void main(String[] args) {
        // 1. Write a loop to display even numbers from 0 to 100
        for (int x = 0; x <=100; x+=2) {
           System.out.println(x);
        }

          var y=0;
          while(y<=100) {
              System.out.println(y);
              y+=2;
          }
           var z=0;
           do{
               System.out.println(z);
               z+=2;
           }while(z<=100);

        // 2. Write a loop to display multiples of 3 from 0 to 100
        for (int k = 0; k <=100; k+=3) {
            System.out.println(k);
        }

         var l=0;
         while (l<=100){
             System.out.println(l);
             l+=3;
         }

          var m=0;
          do{
              System.out.println(m);
              m+=3;
          }while(m<=100);

        // 3. Write a loop to display prime numbers from 0 to 100
        for (int a = 2; a <=100; a++) {
            if (isPrime(a)) {
                System.out.println(a+ "");
            }
        }

          var b=0;
          while (b<=100){
              if (isPrime(b)) {
                  System.out.println(b+ "");
              }
              b++;
          }

           var c=0;
           do{
               if (isPrime(c)){
                 System.out.println(c+ "");
               }
               c++;
           }while (c<=100);
    }
    private static boolean isPrime(int num){
        if (num <2) {
            return false;
        }
        for (int a = 2; a <=Math.sqrt(num) ; a++) {
            if (num % a == 0) {
                return false;
            }
        }
        return true;
    }


    private static boolean isPrime(int num){
        if (num <2) {
            return false;
        }
        for (int b = 2; b <=Math.sqrt(num) ; b++) {
            if (num % b == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int num){
        if (num <2) {
            return false;
        }
        for (int c = 2; c <=Math.sqrt(num) ; c++) {
            if (num % c == 0) {
                return false;
            }
        }
        return true;
    }
}
