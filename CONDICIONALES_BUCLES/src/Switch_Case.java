public class Switch_Case {
    public static void main(String[] args){
        var estacion = "Llovinza";
        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;  
            default:
                System.out.println("NO es una Estacion");
        }

        }
}

