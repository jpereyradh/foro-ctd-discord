public class Main {


        // Atributo estático para contar el número de círculos creados
        private static int contador = 0;

        private double radio;

        public Main(double radio) {
            this.radio = radio;
            contador++; // Incrementar el contador cada vez que se crea un círculo
        }

        // Método estático para obtener el contador
        public static int getContador() {
            return contador;
        }

        // ... (otros métodos de la clase)
    }
