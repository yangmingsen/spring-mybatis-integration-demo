package top.yms.ui.demo;

public class Demo5 {
    static class A {
        private B b;

        public A(B b) {
            this.b = b;
        }
    }

    static class B {
        private C c;

        public B(C c) {
            this.c = c;
        }
    }

    static class C {
        private A a;

        public C(A a) {
            this.a = a;
        }
    }
}
