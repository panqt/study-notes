package pers.panqt.springboot.web.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSession;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import pers.panqt.springboot.modules.login.LoginController;

import pers.panqt.springboot.web.interceptor.SessionInterceptor;

import javax.servlet.http.HttpSession;

/**
 *  @time       2019年03月14日	23:13
 *	@author     panqt
 *
 *	@comment    开启 Spring管理 Session，使用redis缓存
 *              默认是60x30秒过期，这里测试修改为60秒
 * SpringSession详解：  <a>https://www.cnblogs.com/lxyit/p/9672097.html</a>
 * 登陆认证:    {@link LoginController#auth(HttpSession, String, String)}
 * 登出：      {@link LoginController#logout}
 * 登陆检查：   {@link SessionInterceptor}
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=MapSession.DEFAULT_MAX_INACTIVE_INTERVAL_SECONDS)
public class RedisSessionConfig {
    
}
