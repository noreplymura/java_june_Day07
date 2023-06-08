class C {
    public void disp() {
        System.out.println("Method of class C ");
    }
}

class A extends C {
    public void disp() {
        System.out.println("Method of class A ");
    }
}

class B extends C {
    public void disp() {
        System.out.println("Method of class B ");
    }
}

class Test {
    public void disp() {
        System.out.println("Method of class D ");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.disp();
    }
}
