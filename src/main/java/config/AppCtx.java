package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import disample.ChangePasswordService;
import disample.MemberDao;
import disample.MemberRegisterService;

@Configuration
public class AppCtx {
	
	
	// 해당 메서드가 생성한 객체를 스프링 빈으로 설정 
	// 메서드 이름을 빈 객체의 이름으로 사용
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean 
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}



@Bean
public ChangePasswordService changePwdSvc() {
	ChangePasswordService pwdSvc = new ChangePasswordService();
			pwdSvc.setMemberDao(memberDao());
	return pwdSvc;
}
}