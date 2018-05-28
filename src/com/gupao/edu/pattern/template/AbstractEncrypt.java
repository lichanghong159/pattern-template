package com.gupao.edu.pattern.template;

/**
 * 加密算法
 * @createby: lichanghong on 2018-05-28 17:43
 **/
public abstract class AbstractEncrypt{
    public boolean checkStr(String str){
        if(null==str || "".equals(str)){
            return false;
        }
        return true;
    }
    public abstract String encrypt(String str);
}
