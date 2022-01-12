/* 
Спорудження будівлі планувалося під ресторан і успішно завершилося,
але через деякий час власники вирішили переробити її під барбершоп.
Нам потрібно зробити так, щоб будівля була універсальною
та щоб її призначення можна було змінювати, не створюючи нового.
Для цього створи метод initialize, який задаватиме значення поля type (визначатиме тип будівлі),
а конструктор видали.

Требования:
Клас Building має містити приватне поле type типу String.
Клас Building не повинен містити оголошених конструкторів.
Клас Building має містити нестатичний метод public void initialize із параметром типу String.
Ініціалізація поля type має відбуватися в методі initialize(String).
*/

public class Building {
    private String type;

    public void initialize(String type){
        this.type = type;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}