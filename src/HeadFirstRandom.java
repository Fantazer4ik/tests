public class HeadFirstRandom {
    public static void main (String[] args){
        String[] wordListOne = {"one","two","three", "four"};
        String[] wordListTwo = {"seven", "eighth", "nine", "ten"};
        String[] wordListThree = {"eleven", "twelve", "thirteen", "fourteen"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1= (int) (Math.random() * oneLength);
        int rand2= (int) (Math.random() * twoLength);
        int rand3= (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.print("Oll - " + phrase);
    }

}
