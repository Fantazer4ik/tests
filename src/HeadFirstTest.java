public class HeadFirstTest {
    public static void main (String [] arg){

        int x = 0;
        int y = 0;
        while (x < 5){ //cikle = 4
            if (y < 5){ // true
                x++; // x+1
                if (y < 3){ // true
                    x--; // x-1
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
