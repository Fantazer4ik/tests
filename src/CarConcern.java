
/*
Відчуй себе інженером-конструктором автомобілів і знайди рішення, що допоможе відновити роботу заводу.
Для цього ти маєш додати в конструкторах ініціалізацію полів відповідними параметрами.
Якщо параметра немає, слід ініціалізувати поле значенням за замовчуванням.
Для поля year — це поточний рік (4321), для поля color — Помаранчевий.

Требования:
•	Клас CarConcern має містити чотири приватних поля з модифікатором final.
•	Клас CarConcern має містити публічний конструктор із трьома параметрами, який ініціалізує відповідні поля.
•	Клас CarConcern має містити публічний конструктор із двома параметрами, який ініціалізує відповідні поля.
•	Клас CarConcern має містити публічний конструктор з одним параметром, який ініціалізує відповідні поля.
 */

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {

        this.model = model;
        this.year = year;
        this.color = color;

    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "помаранчевий";
        //напишіть тут ваш код
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "помаранчевий";
        //напишіть тут ваш код
    }
}
