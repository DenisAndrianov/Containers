package test;

public class Circle extends Container{
    double r;

    void findValume ()  {
        valume = Math.PI * Math.pow(r,2) * h;
    }

    @Override
    public String toString() {
        String str = "Цилиндр "+ liquid +" --- Радиус: " + r + " Высота: " + h + " Объем: " + Math.round(valume * 100.0)/100.0 + " Масса: " + Math.round(mass * 100.0)/100.0 +" кг.";
        return str;
    }

    Circle () {
        System.out.println("Введите радиус основания (м)");
        this.r = Main.input();
        System.out.println("Введите высоту (м)");
        this.h = Main.input();
        findValume();
        liquid = Main.inputLiquid();
        mass = liquid.density * valume;
    }
}
