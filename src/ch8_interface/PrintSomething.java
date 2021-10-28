package ch8_interface;

interface WithStuckInterface {
    default void withStuck(){
        System.out.println("This truck has stuck! ");
    }
}
