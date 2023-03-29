package me.whiteship.chapter04.item15.class_and_interfaces.item;

import me.whiteship.chapter04.item15.class_and_interfaces.member.MemberService;

public class ItemService {

    public static final String NAME = "minseok"; //변경되지 않는 상수

    private MemberService memberService;

    boolean onSale;

    protected int saleRate;

    public ItemService(MemberService memberService) {
        if (memberService == null) {
            throw new IllegalArgumentException("MemberService should not be null.");
        }

        this.memberService = memberService;
    }

    MemberService getMemberService() {
        return memberService;
    }
}
