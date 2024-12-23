package toby.toby_spring.user;

import toby.toby_spring.user.dao.DConnectionMaker;
import toby.toby_spring.user.dao.SimpleConnectionMaker;
import toby.toby_spring.user.dao.UserDao;
import toby.toby_spring.user.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SimpleConnectionMaker scm = new SimpleConnectionMaker();
        UserDao userDao = new UserDao(scm);

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        userDao.add(user);

        System.out.println(user.getId() + "등록 성공!");

        User user2 = userDao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회 성공!");

    }
}
