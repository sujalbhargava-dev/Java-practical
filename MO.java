//Method Overriding

class MO {
    void show() {
        System.out.println("Parent");
    }
}

class B extends MO {
    void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}