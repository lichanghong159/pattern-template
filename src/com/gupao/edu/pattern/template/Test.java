package com.gupao.edu.pattern.template;

/**
 * @createby: lichanghong on 2018-05-28 17:49
 **/
public class Test {
    public static void main(String[] args) {
        String str = "123";
        AbstractEncrypt des = new DesEncryt();
        des.encrypt(str);
        AbstractEncrypt rsa = new RsaEncrypt();
        rsa.encrypt(str);
    }
}
