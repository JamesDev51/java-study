package ch9_exceptions;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.get(0);
    }
}
