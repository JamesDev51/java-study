package me.whiteship.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    //private 생성자 -> 외부에서는 부를 수 없음
    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    //해당 메서드에 접근해서만 settings 인스턴스를 가져갈 수 있음
    public static Settings getInstance() {
        return SETTINGS;
    }

}
