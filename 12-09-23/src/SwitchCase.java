public class SwitchCase {

    public static void main(String[] args) {

        String sigla = "P";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grade");
                break;
            }
            default:
                System.out.println("Indefinido");

        }

    }

}
