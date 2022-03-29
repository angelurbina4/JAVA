public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Lineas de texto que apareceran en la app 
        String saludoGeneral = "Bienvenido al Cafe Java, ";
        String mensajePendiente = ", tu pedido estara listo en breve";
        String mensajeListo = ", tu pedido esta listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menu (agrega las tuyas a continuacion)
        double precioMocha = 3.5;
        double precioCafeDeFiltro = 2.5;
        double precioCafeConLeche = 5.5;
        double precioCapuchino =  4.5;
    
        // Variables de nombre de cliente (agrega las tuyas a continuacion)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuacion)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;
    
        // SIMULACION DE INTERACCION DE APP(Agrega tu codigo para los desafios a continuacion)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Cafe Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente iran aqui ** //
        System.out.println(cliente2 + mensajePendiente);

        if(estaListoOrden4) {
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCapuchino);
        } else {
            System.out.println(cliente4 + mensajePendiente);
        }

        if(estaListoOrden2) {
            System.out.println(cliente2 + mensajeListo);
            System.out.println(mensajeMostrarTotal + (precioCapuchino + precioCapuchino));
        } else {
            System.out.println(cliente2 + mensajePendiente);
        }
        
        System.out.println(mensajeMostrarTotal + (precioCafeConLeche - precioCafeDeFiltro));

        
    }
}