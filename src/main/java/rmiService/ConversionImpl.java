package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion  {

    public ConversionImpl() throws RemoteException {
        super();
    }
    @Override
    public double coversionMontant(double mt){
        return mt*3.2;
    }
}
