package std1.inhirit;

public class B {
    int i = 0;
    U[] us = new U[4];

    void addU(U u) {
        us[i++] = u;
    }

    void deleteU(int j) {
        us[j] = null;
    }

    void enemerationU() {
        for (U um :
                us) {
            if (um != null) {
                um.d();
                um.f();
                um.g();
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        B b = new B();
        b.addU(a1.makeU());
        b.addU(a2.makeU());
        b.addU(a3.makeU());
        b.addU(a4.makeU());
        b.deleteU(2);
        b.enemerationU();

    }
}
