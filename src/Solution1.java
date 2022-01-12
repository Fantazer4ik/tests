import com.sun.tools.javac.Main;
/*
Ця задача потрібна, щоб зрозуміти, як викликається конструктор базового (батьківського) класу.
У тебе є класи ElectricCar, GasCar, HybridCar, які успадковують клас Car.
Тобі потрібно в конструкторах спадкоємців класу Car передати тип автомобіля
в конструктор базового (батьківського) класу, використовуючи super("тип автомобіля").
Для цього в класі Solution у методі main створи 3 об'єкти: HybridCar, GasCar і ElectricCar.

Результат виведення має бути таким (у будь-якій послідовності):
Привіт. Я ElectricCar
Привіт. Я GasCar
Привіт. Я HybridCar

Требования:
•	Класи ElectricCar, GasCar, HybridCar мають успадковуватися від класу Car.
•	Тіло конструктора класу Car не змінюй.
•	Спадкоємці класу Car мають викликати конструктор базового класу з відповідним аргументом.
•	У методі main має бути створено 3 об'єкти класів HybridCar, GasCar і ElectricCar.
•	Результат виведення має відповідати умові.
 */

public class Solution1 {
    public static void main(String[] args) {
        HybridCar one = new HybridCar();
        GasCar two = new GasCar();
        ElectricCar three = new ElectricCar();

    }
}

