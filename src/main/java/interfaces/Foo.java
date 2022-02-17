package interfaces;

public interface Foo {

    default void bar() {
        System.out.print("Hello");
        baz();
        staticBaz();
    }

    private void baz() {
        System.out.println(" world!");
    }


    private static void staticBaz() {
        System.out.println(" static world!");
    }
}