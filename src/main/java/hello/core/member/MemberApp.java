package hello.core.member;

import hello.core.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {

        //MemberService memberService = new MemberServiceImpl();
        //AppConfig appConfig = new AppConfig();                    // 순수 자바
        //MemberService memberService = appConfig.memberService();  // 순수 자바

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);    // 스프링 컨테이너
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);// 메서드 이름명, 반환 타입

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
