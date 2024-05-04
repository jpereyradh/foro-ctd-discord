public class Main {

    public static void main(String[] args) {
         String nombreUsuario = "usuario123";
        for (char c : nombreUsuario.toCharArray()) {
            if (!Character.isLetter(c)) {
                System.out.println("El nombre de usuario solo puede contener letras mayúsculas y minúsculas.");
                return;
            }
        }
    }



}
