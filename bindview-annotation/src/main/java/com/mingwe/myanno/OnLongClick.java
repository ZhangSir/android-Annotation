package com.mingwe.myanno;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 *
 * Created by zhangshuo on 2017/2/17.
 */

@Target(METHOD)
@Retention(CLASS)
public @interface OnLongClick {
    int[] value();
}
