package JavaBasics.LLD.Creational.Singleton;

/**
 * DCL(Double Checked Locking) breaks in Serialization , Reflections.
 *
 * The Best Singleton is Enum Singleton
 *
 * new EnumSingleton() method is not needed, JVM creates it
 *
 * When to use Enum Singleton?
 *
 * ✔ Logger
 * ✔ Configuration Loader
 * ✔ Global Cache
 * ✔ Analytics/Monitoring
 * ✔ Feature Flags
 * ✔ Payment/Inventory global resource managers
 *
 * Basically: anytime you need a truly safe global object.
 */
public enum EnumSingleton {
    INSTANCE;


    public void printData(){
        System.out.print("I am in EnumSingleton");
    }
}
