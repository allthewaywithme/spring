import com.demo.controller.UserController;
import com.demo.entity.User;
import com.demo.entity.UserFather;
import com.demo.entity.UserMother;
import com.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("./com/demo/resource/application-context.xml");
       /* User user =context.getBean(User.class);
        System.out.println(user.getId());
        UserFather bean = context.getBean(UserFather.class);
        bean.getFname();
        UserMother m = context.getBean(UserMother.class);
        m.getmName();*/
        UserController c = context.getBean(UserController.class);
        UserService userService = c.getUserService();
        userService.say("aa");

        //AOP 切面编程 统一组织代码拦截某些方法执行前后  做一些操作
        // 两种配置方式 一种基于注解  一种基于xml文件配置



    }
}
