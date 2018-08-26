package aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        //动态代理  拦截有接口的方法
        UserServiceImpl userService = new UserServiceImpl();
        InvocationHandler userInvocationHandler = new UserInvocationHandler(userService);
        UserService o = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),userInvocationHandler);
        o.calName("laowang");//代理类调用方法
    }
}
