package me.whiteship.chapter01.item06;

public class Deprecation {

    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */

    // TODO 애노테이션 프로세서 -> 주석하고 같음
    @Deprecated(forRemoval = true, since = "1.2")
    public Deprecation() {
    }

    private String name;

    public Deprecation(String name) {
        this.name = name;
    }
}
