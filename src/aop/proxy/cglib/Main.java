package aop.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();

        CglibProxy cglibProxy=new CglibProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(UserImpl.class);
        enhancer.setCallback(cglibProxy);

        UserImpl o = (UserImpl) enhancer.create();
        o.calName("wangbaoqiang");

    }
}
