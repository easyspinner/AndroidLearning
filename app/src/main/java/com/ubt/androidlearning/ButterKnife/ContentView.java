package com.ubt.androidlearning.ButterKnife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName OnClick
 * @date 2016/9/30 9:31
 * @author zhouchen
 * @Description 注解类 setContentView
 * @modifier
 * @modify_time
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ContentView {

    int value();
}
