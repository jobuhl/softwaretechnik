package Aufgabe12;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Jojo on 08.05.16.
 */
public class RPC {

    private String classname;
    private Object[] construkorparameter;
    private String methodname;
    private String methodparameter;

    public RPC(String classname, Object[] construkorparameter, String methodname, String methodparameter) {
        this.classname = classname;
        this.construkorparameter = construkorparameter;
        this.methodname = methodname;
        this.methodparameter = methodparameter;
    }

    public void reflect(){

        try {

            //get the classname
            Class unknownclass = Class.forName(classname);

            //get 1. construktor
            Class[] parameterTypes = {String.class, int.class};
            Constructor newconstructor = unknownclass.getConstructor(parameterTypes);

            //get 1. constructor parameters
            Object[] parameters = construkorparameter;
            Object instance = newconstructor.newInstance(parameters);

            System.out.println("Klasse: " + unknownclass.getName());
            System.out.println("Instanz: " + instance);

            //get method
            Method[] method = unknownclass.getDeclaredMethods();
            for (Method method1 : method) {
                System.out.println("Methode: " + method1.getName());
            }

            //set method parameter
            Class[] signatur = {String.class};
            Method method2 = unknownclass.getMethod(methodname,signatur);

            Object rueckgabe = method2.invoke(instance,methodparameter);
            System.out.println("Instanz: " + instance);




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
