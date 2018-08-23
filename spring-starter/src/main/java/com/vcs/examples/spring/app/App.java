package com.vcs.examples.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vcs.examples.spring.tr.Motociklas;
import com.vcs.examples.spring.tr.Vaziuoti;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
//		TransportoPriemone tr = new Automobilis();
//		(new Vaziuoti(tr)).vaziuoti();
				

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(AppCtx.class);
		ctx.refresh();
		
		Vaziuoti v = ctx.getBean(Vaziuoti.class);
		v.vaziuoti();
		
		Motociklas a = ctx.getBean(Motociklas.class);
		a.getSound();
		
		ctx.close();
	}

}
