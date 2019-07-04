package cn.runx.imam;

import cn.runx.imam.config.RedisConfig;
import cn.runx.imam.mapper.CodeMapper;
import cn.runx.imam.mapper.UserMapper;
import cn.runx.imam.po.Code;
import cn.runx.imam.po.CodeExample;
import cn.runx.imam.po.User;
import cn.runx.imam.po.UserExample;
import cn.runx.imam.redis.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImamApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    CodeMapper codeMapper;

    @Test
    public void contextLoads() {


    }

}
