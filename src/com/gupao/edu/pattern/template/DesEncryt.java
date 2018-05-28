package com.gupao.edu.pattern.template;

/**
 * @createby: lichanghong on 2018-05-28 17:49
 **/
public class DesEncryt extends AbstractEncrypt {
    @Override
    public String encrypt(String str) {
        if(checkStr(str)){
            System.out.println("执行des加密算法");
            return str;
        }
        return null;
    }
}
