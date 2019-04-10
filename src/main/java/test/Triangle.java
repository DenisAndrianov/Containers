package test;

public class Triangle extends Container {
    double a, b, c;

    @Override
    void findValume() {
        double p = (a + b + c) / 2;
        valume = (Math.sqrt(p * (p - a) * (p - b) * (p - c))) * h;
    }

    @Override
    public String toString() {
        String str = "Треугольная призма "+ liquid +" --- Стороны: " + a + " ," + b + " ," + c + " Высота: " + h + " Объем: " + Math.round(valume * 100.0)/100.0 + " Масса: " + Math.round(mass * 100.0)/100.0 +" кг.";
        return str;
    }

    Triangle () {
        System.out.println("Введите длину стороны а (м)");
        this.a = Main.input();
        System.out.println("Введите длину стороны b (м)");
        this.b = Main.input();
        System.out.println("Введите длину стороны c (м)");
        this.c = Main.input();
        System.out.println("Введите высоту h (м)");
        this.h = Main.input();
        findValume();
        liquid = Main.inputLiquid();
        mass = liquid.density * valume;
    }
}
