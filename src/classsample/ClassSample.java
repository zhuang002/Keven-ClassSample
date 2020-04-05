/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classsample;

/**
 *
 * @author zhuan
 */
public class ClassSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal1=new Animal(2,"ani1");
        Animal animal2=new Animal(5, "ani2");
        
        animal1.move(3);
        animal2.move(4);
        
        Mammal mammal1=new Mammal(3,"mam1");
        Mammal mammal2=new Mammal(3,"mam2");
        
        mammal1.move(7);
        mammal1.makeSound();
        
        mammal2.move(10);
        mammal2.makeSound();
        
        Human human1=new Human(10, "John", 175, "Male");
        Human human2=new Human(15, "Jane", 165, "Female");
        
        human1.step();
        human1.talk();
        
        human2.talk();
        human2.step();
        
        System.out.println(human1.getName()+" is " + human1.getAge() + " years old "
            +"and is "+human1.getHeight() +" cm tall, and is a "+human1.getGender());
        System.out.println(human2.getName()+" is " + human2.getAge() + " years old.");
        
        Student stu=new Student(15, "Jane", 165, "Female");
        stu.setStudentId(100);
        stu.setGrade(9);
        
        System.out.println("Student "+stu.getName()+" is in grade "+stu.getGrade());
        
        
        stu.takeClass("CS3U");
        stu.takeClass("MA4U");
        stu.takeClass("PH4U");
        
        stu.dropClass("PH4U");
        System.out.print(stu.getName()+" says \"");
        stu.printMyClasses();
        System.out.println("\"");
        
        stu.step();
        stu.talk();
                
        
    }
    
}
