package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote{
    public abstract double convertirMontant(double mt) throws RemoteException;
}

