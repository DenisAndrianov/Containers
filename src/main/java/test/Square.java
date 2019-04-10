package test;

public class Square extends Container {
    double a;
    double b;

    @Override
    void findValume() {
        valume = a * b * h;
    }

    @Override
    public String toString() {
        String str = "Параллелепипед "+ liquid +" --- Стороны: " + a + " ," + b + " Высота: " + h + " Объем: " + Math.round(valume * 100.0)/100.0 + " Масса: " + Math.round(mass * 100.0)/100.0 +" кг.";
        return str;
    }

    Square()    {
        System.out.println("Введите длину стороны а(м)");
        this.a = Main.input();
        System.out.println("Введите длину стороны b(м)");
        this.b = Main.input();
        System.out.println("Введите высоту h (м)");
        this.h = Main.input();
        findValume();
        liquid = Main.inputLiquid();
        mass = liquid.density*valume;
    }
}
