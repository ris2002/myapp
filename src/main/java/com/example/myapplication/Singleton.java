package com.example.myapplication;

public class Singleton {
    private static Singleton instance = null;
private  Singleton(){

}
private synchronized static void  createInstance(){
    if(instance==null){
        instance=new Singleton();
    }
}
public static Singleton getInstance(){
    if (instance==null) createInstance():
    return instance
}
}
