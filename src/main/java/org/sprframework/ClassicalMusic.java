package org.sprframework;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class ClassicalMusic implements Music{

//    private ClassicalMusic(){} //запрещаем создание экземпляров класса вручную

    //Factory method
//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }
//public void doMyInit(){
//    System.out.println("Doing my initialization");
//}
//    public void doMyDestroy(){
//    //не используется для бинов со scope=prototype
//        System.out.println("Doing my destruction");
//    }
    @Override
    public String getSong() {
        return "Hungarian Raphsody";
    }
}
