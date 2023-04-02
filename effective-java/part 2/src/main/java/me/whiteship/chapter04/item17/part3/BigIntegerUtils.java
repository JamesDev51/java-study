package me.whiteship.chapter04.item17.part3;

import java.math.BigInteger;

public class BigIntegerUtils {

    public static BigInteger safeInstance(BigInteger val) {
        //BigInteger 타입인 경우 그대로 쓰기 / 아닌 경우 BigInteger를 만들어 사용
        return val.getClass() == BigInteger.class ? val : new BigInteger(val.toByteArray());
    }
}
