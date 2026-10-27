//single inheritance

class A {
    void show() {
        System.out.println("Parent Class");
    }
}

class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}