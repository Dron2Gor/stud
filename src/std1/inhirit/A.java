package std1.inhirit;

public class A {
    U makeU (){
        return new U() {
            @Override
            public void f() {
                System.out.println("f()");
            }

            @Override
            public void d() {
                System.out.println("d()");
            }

            @Override
            public void g() {
                System.out.println("g()");

            }
        };
    }
}
