package me.whiteship.chapter04.item15.class_and_interfaces.item;

import me.whiteship.chapter04.item15.class_and_interfaces.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock //가짜 객체를 만들어서  사용하는 방법
    MemberService memberService; //DefaultMemberService 직접 참조할 수 없음

    @Test
    void itemService() {
        ItemService service = new ItemService(memberService);
        assertNotNull(service);
        assertNotNull(service.getMemberService());
    }

}