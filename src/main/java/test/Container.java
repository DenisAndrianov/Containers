package test;

abstract class Container implements Comparable <Container> {
    double h;
    int angle;
    double valume;
    double mass;
    Liquid liquid;
    abstract void findValume ();
    public int compareTo(Container another) {
        return (mass < another.mass ) ? -1 : ((mass == another.mass) ? 0 : 1);
    }
}
