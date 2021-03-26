package cn.ichasem.semail;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface AnnNiceEmail {


    /**
     * 主题
     * @return
     */
    String subject();

    /**
     * 来自谁的邮件
     * @return
     */
    String from();

    /**
     * 发送给某人的邮箱
     * @return
     */
    String to();


    /**
     * 文字
     * @return
     */
    @Deprecated
    String text() default "";

    /**
     * 超文本
     * @return
     */
    @Deprecated
    String html() default "";
}
