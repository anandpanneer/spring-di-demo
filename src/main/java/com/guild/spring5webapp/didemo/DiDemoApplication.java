package com.guild.spring5webapp.didemo;

import com.guild.spring5webapp.didemo.controllers.MyController;
import com.guild.spring5webapp.didemo.controllers.springframework.ConstructorInjectedController;
import com.guild.spring5webapp.didemo.controllers.springframework.PropertyInjectedController;
import com.guild.spring5webapp.didemo.controllers.springframework.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

//		controller.hello();
		System.out.println(controller.hello());

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
