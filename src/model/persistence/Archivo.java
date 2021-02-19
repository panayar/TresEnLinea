package model.persistence;

import java.io.*;
import java.util.ArrayList;

public class Archivo implements Serializable {

    private ObjectInputStream input;
    private ObjectOutputStream output;

    public Archivo (File file) {
        if (file.exists()) {
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFile(ArrayList objetos, File file) {
        try {
            output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(objetos);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList leerArchivo(File file) {

        ArrayList objetos = new ArrayList();
        if (file.length() != 0) {
            try {
                input = new ObjectInputStream(new FileInputStream(file));
                objetos = (ArrayList) input.readObject();
            } catch (FileNotFoundException e) {
                // TODO: handle exception
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return objetos;
    }


}
