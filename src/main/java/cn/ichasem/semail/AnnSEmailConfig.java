package cn.ichasem.semail;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface AnnSEmailConfig {
    /**
     * 发送类型，QQ or 163
     * @return
     */
    String type();

    /**
     * 用户名
     * @return
     */
    String username();

    /**
     * 密码
     * @return
     */
    String password();






}
