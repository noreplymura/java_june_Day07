class A {
    void m() {
        System.out.println("hello n ");
    }

    void n() {
        System.out.println("hello");
    this.m();
    }
}

class TestThis4 {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
