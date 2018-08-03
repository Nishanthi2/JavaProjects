package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojo.HelloIndia;
import com.deloitte.pojo.HelloWorld;
import com.deloitte.pojo.Point;
import com.deloitte.pojo.TextEditor;

public class MainClass {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	//Point point = (Point)context.getBean("pointBean");
	//System.out.println(point);
	Point point1 = (Point)context.getBean("pointBean");
	System.out.println(point1);
	Point point2 = (Point)context.getBean("pointBean");
	System.out.println(point2);
	
	point2.setX(5);;
	point2.setY(10);;
	
	System.out.println(point1);
	System.out.println(point2);
	
	HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	objA.getMessage1();
	objA.getMessage2();
	
	HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
	objB.getMessage1();
	objB.getMessage3();
	objB.getMessage2();//since this is not mentioned in bean,it will inherit this from helloworld and print the msg.
	//if helloworld wasnt mentioned as parent,then it would show null if we call msg2 for india
	//ideally it inherits the bean properties
	
	
	//ctor based dependency injection(DI)(texteditor and spellcheck classes)
	
	TextEditor tel = (TextEditor) context.getBean("textEditor");
	tel.spellCheck();//explanation of this ctor based DI- an obj of type TextEditor first gets bean of id textEditor.
	//here a ctor has an attribute ref whose value is spellChecker,which is the id of the SpellChecker bean.
	//so we go to the SpellChecker bean,that takes it to the class in it,i.e the SpellChecker class.
	//it executes the message in the ctor since that is placed first in the class
	//then tel object calls checkspelling. sothe stmt in that is displayed.
	//

	//((AbstractApplicationContext)context).registerShutdownHook();
	
	//setter based di
	TextEditor tel1 = (TextEditor) context.getBean("textEditorSDI");
	tel1.spellCheck();
	
	//autowire
	TextEditor tel2 = (TextEditor) context.getBean("textEditorAWbN");
	tel2.spellCheck();
	
	TextEditor tel3 = (TextEditor) context.getBean("textEditorAWbT");
	tel3.spellCheck();
	tel3.getName();
	
	TextEditor tel4 = (TextEditor) context.getBean("textEditorAWbC");
	tel4.spellCheck();
	tel4.getName();
	
	
	
	}
	
	
}
