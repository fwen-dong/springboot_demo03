package cn.com.fwen.springboot.test;


import cn.com.fwen.springboot.MySpringBootApplication;
import cn.com.fwen.springboot.entity.User;
import cn.com.fwen.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class UserServiceTest {

    //直接注入业务层对象
    @Autowired
    UserService userService;

    //测试查询所有用户数据
    @Test
    public void test01(){
        try {
            List<User> users = userService.findAllUser();
            for (User user:users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        try {
            Map<String, Object> map = userService.findPageUser(1, 3);
            System.out.println("总的数据条数："+map.get("count"));
            List<User> users = (List<User>) map.get("data");
            for (User user:users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
