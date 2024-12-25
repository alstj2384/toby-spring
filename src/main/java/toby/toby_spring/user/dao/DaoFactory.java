package toby.toby_spring.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * UserDao의 생성 책임을 맡은 팩토리 클래스
 *
 * 컴포넌트 구조와 관계를 정의한 설계도 역할을 수행함
 */

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao(){
        SimpleConnectionMaker simpleConnectionMaker = new SimpleConnectionMaker();
        UserDao userDao = new UserDao(simpleConnectionMaker);
        return userDao;
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new SimpleConnectionMaker();
    }
}
