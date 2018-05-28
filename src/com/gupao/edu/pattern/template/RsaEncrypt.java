package com.gupao.edu.pattern.template;

/**
 * @createby: lichanghong on 2018-05-28 17:46
 **/
public class RsaEncrypt extends AbstractEncrypt {
    @Override
    public String encrypt(String str) {
        if(checkStr(str)){
            System.out.println("执行Rsa加密算法");
            return str;
        }
        return null;
    }
}
