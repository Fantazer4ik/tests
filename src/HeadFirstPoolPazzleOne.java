public class HeadFirstPoolPazzleOne {
    public static void main (String [] args){
/*
a noise
annoys
an oyster
 */
        int x = 0;
        while(x < 4){ // 3 cikle;
            System.out.print("a");// guess
            if (x < 1){ //Static
                System.out.print(" ");// guess
            }
            System.out.print("n"); // guess
            if (x > 1){     // guess
                System.out.print(" oyster");   // guess
                x=x+2;    // guess
            }
            if (x == 1){    // Static
                System.out.print("noys");    // guess
            }
            if (x < 1) {  // guess
                System.out.print("oise");    // guess
            }
            System.out.println();     // Static
            x++;// guess

        }
    }
}
