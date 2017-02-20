package com.mingwei.myprocess.model;

import com.mingwe.myanno.OnClick;
import com.mingwe.myanno.OnLongClick;

import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Name;
import javax.lang.model.element.VariableElement;

/**
 * Created by zhangshuo on 2017/2/17.
 */

public class OnLongClickMethod {
    private Name mMethodName;
    public int[] ids;

    public OnLongClickMethod(Element element){
        if(element.getKind() != ElementKind.METHOD){
            throw new IllegalArgumentException(String.format("Only method can be annotated width @%s",
                    OnLongClick.class.getSimpleName()));
        }

        ExecutableElement methodElement = (ExecutableElement) element;
        mMethodName = methodElement.getSimpleName();
        ids = methodElement.getAnnotation(OnLongClick.class).value();
        if(null == ids){
            throw new IllegalArgumentException(String.format("Must set valid ids for @%s", OnLongClick.class.getSimpleName()));
        }else{
            for(int id : ids){
                if(id < 0){
                    throw new IllegalArgumentException(String.format("Must set valid ids for @%s", OnLongClick.class.getSimpleName()));
                }
            }
        }

        List<? extends VariableElement> parameters = methodElement.getParameters();
        if(null != parameters && parameters.size() > 0){
            throw new IllegalArgumentException(String.format("The method annotated with @%s must have no parameters", OnLongClick.class.getSimpleName()));
        }
    }

    public Name getMethodName(){
        return mMethodName;
    }
}
