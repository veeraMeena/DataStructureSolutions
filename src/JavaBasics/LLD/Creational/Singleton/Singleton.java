package JavaBasics.LLD.Creational.Singleton;

/**
 * 1. create a private static instance varibale
 * 2. make private constructor
 * 3. create public static getInstance Method
 */
public class Singleton {

    //early initialization
   // private static Singleton instance = new Singleton();

    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton  getInstance(){
        //Lazy Initialization
        if(instance==null){
            instance = new Singleton();
            return instance;
        }
        return instance;
    }



}
