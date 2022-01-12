
public class BusinessSkyscraper {
    private int floorsCount;
    private String developer;

    public BusinessSkyscraper(){
        this.developer = "JavaRushDevelopment";
        this.floorsCount = 5;

    }
    public BusinessSkyscraper(int floorsCount, String UNKNOWN){
        this.floorsCount = floorsCount;
        this.developer = UNKNOWN;
        System.out.println();
    }//напишіть тут ваш код

    public static void main(String[] args) {
        BusinessSkyscraper skyscraper = new BusinessSkyscraper();
        BusinessSkyscraper skyscraperUnknown = new BusinessSkyscraper(50, "Невідомо");
    }
}
