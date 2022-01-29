package ch8_Interface;

interface WithStuckInterface {
    default void withStuck(){
        System.out.println("This truck has stuck! ");
    }
}
