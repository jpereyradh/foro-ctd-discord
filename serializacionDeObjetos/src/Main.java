import java.io.*;

public static void main(String[] args) {
    // Serialización
    try {
        // Creamos un objeto a serializar
        MiObjeto obj = new MiObjeto("Hola, soy un objeto serializable", 123);

        // Creamos un FileOutputStream para escribir en un archivo
        FileOutputStream fileOut = new FileOutputStream("objeto_serializado.ser");

        // Creamos un ObjectOutputStream utilizando fileOut como parámetro
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

        // Serializamos el objeto
        objOut.writeObject(obj);

        // Cerramos los flujos
        objOut.close();
        fileOut.close();

        System.out.println("El objeto se ha serializado exitosamente.");
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Deserialización
    try {
        // Creamos un FileInputStream para leer el archivo
        FileInputStream fileIn = new FileInputStream("objeto_serializado.ser");

        // Creamos un ObjectInputStream utilizando fileIn como parámetro
        ObjectInputStream objIn = new ObjectInputStream(fileIn);

        // Deserializamos el objeto
        MiObjeto obj = (MiObjeto) objIn.readObject();

        // Cerramos los flujos
        objIn.close();
        fileIn.close();

        // Utilizamos el objeto deserializado
        System.out.println("Objeto deserializado: " + obj.getMensaje());
        System.out.println("Valor: " + obj.getValor());
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }}
