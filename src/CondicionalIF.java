public class CondicionalIF {
    public static void main(String[] args) {
        
        int camila = 16;
        int leonarda = 26;

        int vitto, atenea;
        vitto = 3;
        atenea = 7;

// Ejemplo numero 1
        if (leonarda > camila){
            System.out.println("Leonarda, Es mayor que Camila");
        }
        else if(leonarda == camila){ 
            System.out.println("Leonarda y Camila son iguales");
        }
        else{
            System.out.println("Leonarda, No es mayor que Camila");
        };
// Ejemplo numero 2
        if (vitto > atenea){
            System.out.println("Vitto, Es mayor que Atenea");
        }
        else{
            if (vitto == atenea){
                System.out.println("Vitto y Atenea son iguales");
            }
            else{
                System.out.println("Vitto, No es mayor que Atenea");
            }
        }

    }
}

// La sintaxis del IF ELSE, es totalmente igual a la de JavaScript. 
// Dejo dos ejemplos de como anidar condicionales if; Y dos ejemplos de como declarar variables.