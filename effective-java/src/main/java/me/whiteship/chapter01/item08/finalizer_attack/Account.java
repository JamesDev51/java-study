package me.whiteship.chapter01.item08.finalizer_attack;

import java.math.BigDecimal;

public class Account {

    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;

        if (accountId.equals("푸틴")) {
            throw new IllegalArgumentException("푸틴은 계정을 막습니다.");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }

    //상속 못하도록 final 을 붙여서 finalize 공격을 막기
    @Override
    protected final void finalize() throws Throwable {
        super.finalize();
    }
}
