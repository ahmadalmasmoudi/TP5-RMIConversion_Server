package rmiServer;
import rmiService.ConversionImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConversionServer {

    public static void main(String[] args){

        try{
            Registry registre= LocateRegistry.createRegistry(1099);
            ConversionImpl obj=new ConversionImpl();
            registre.rebind("conversionServeice",obj);
        }catch(Exception e){
            e.printStackTrace();
        }

    }




}
