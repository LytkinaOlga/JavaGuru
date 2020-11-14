package by.bntu.fitr.poisit.lytkina;

import by.bntu.fitr.poisit.lytkina.bean.Developer;
import by.bntu.fitr.poisit.lytkina.bean.FitnessBotProject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        FitnessBotProject fitnessBotProject = ctx.getBean("fitness", FitnessBotProject.class);
        FitnessBotProject yogaBot = ctx.getBean("yoga", FitnessBotProject.class);

        log.info(fitnessBotProject.toString());
        log.info(yogaBot.toString());
    }
    public static void composition(){
        //we create beans that consist reference on other bean
        //we init bean yoga with property and setters

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        FitnessBotProject fitnessBotProject = ctx.getBean("fitness", FitnessBotProject.class);
        FitnessBotProject yogaBot = ctx.getBean("yoga", FitnessBotProject.class);

        log.info(fitnessBotProject.toString());
        log.info(yogaBot.toString());
    }
    public static void baseSyntax(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Developer dev = (Developer) ctx.getBean("dev");
        log.info(dev.toString());

        Developer trainee = ctx.getBean("trainee", Developer.class);
        log.info(trainee.toString());
    }

}
