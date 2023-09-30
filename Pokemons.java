import java.util.Scanner;

public class PokemonsV1 {
    public static void main(String[] args) {
        // String[] arr = {"a","b","c"};
        // System.out.println(String.join("-",arr));
        
        
        //Pikachu variables

        String characterIdPikachu = "Pikachu";
        String type = "Eletric";
        String pikachuImageLine1 = ("⠸⣷⣦⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⠀⠀⠀");
        String pikachuImageLine2 = (" ⠙⣿⡄⠈⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠔⠊⠉⣿⡿⠁⠀⠀⠀");
        String pikachuImageLine3 = ("⠀⠀⠈⠣⡀⠀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⠁⠀⠀⣰⠟⠀⠀⠀⣀⣀");
        String pikachuImageLine4 = ("⠀⠀⠀⠀⠈⠢⣄⠀⡈⠒⠊⠉⠁⠀⠈⠉⠑⠚⠀⠀⣀⠔⢊⣠⠤⠒⠊⠉⠀⡜");
        String pikachuImageLine5 = ("⠀⠀⠀⠀⠀⠀⠀⡽⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠩⡔⠊⠁⠀⠀⠀⠀⠀⠀⠇");
        String pikachuImageLine6 = ("⠀⠀⠀⠀⠀⠀⠀⡇⢠⡤⢄⠀⠀⠀⠀⠀⡠⢤⣄⠀⡇⠀⠀⠀⠀⠀⠀⠀⢰⠀");
        String pikachuImageLine7 = ("⠀⠀⠀⠀⠀⠀⢀⠇⠹⠿⠟⠀⠀⠤⠀⠀⠻⠿⠟⠀⣇⠀⠀⡀⠠⠄⠒⠊⠁⠀");
        String pikachuImageLine8 = ("⠀⠀⠀⠀⠀⠀⢸⣿⣿⡆⠀⠰⠤⠖⠦⠴⠀⢀⣶⣿⣿⠀⠙⢄⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine9 = ("⠀⠀⠀⠀⠀⠀⠀⢻⣿⠃⠀⠀⠀⠀⠀⠀⠀⠈⠿⡿⠛⢄⠀⠀⠱⣄⠀⠀⠀⠀");
        String pikachuImageLine10 = ("⠀⠀⠀⠀⠀⠀⠀⢸⠈⠓⠦⠀⣀⣀⣀⠀⡠⠴⠊⠹⡞⣁⠤⠒⠉⠀⠀⠀⠀⠀");
        String pikachuImageLine11 = ("⠀⠀⠀⠀⠀⠀⣠⠃⠀⠀⠀⠀⡌⠉⠉⡤⠀⠀⠀⠀⢻⠿⠆⠀⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine12 = ("⠀⠀⠀⠀⠀⠰⠁⡀⠀⠀⠀⠀⢸⠀⢰⠃⠀⠀⠀⢠⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine13 = ("⠀⠀⠀⢶⣗⠧⡀⢳⠀⠀⠀⠀⢸⣀⣸⠀⠀⠀⢀⡜⠀⣸⢤⣶⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine14 = ("⠀⠀⠀⠈⠻⣿⣦⣈⣧⡀⠀⠀⢸⣿⣿⠀⠀⢀⣼⡀⣨⣿⡿⠁⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine15 = ("⠀⠀⠀⠀⠀⠈⠻⠿⠿⠓⠄⠤⠘⠉⠙⠤⢀⠾⠿⣿⠟⠋");
        String pikachuImage = (pikachuImageLine1 + "\n" + pikachuImageLine2 + "\n" + pikachuImageLine3 + "\n" + pikachuImageLine4 + "\n" + pikachuImageLine5 + "\n" + pikachuImageLine6 + "\n" + pikachuImageLine7 + "\n" + pikachuImageLine8 + "\n" + pikachuImageLine9 + "\n" + pikachuImageLine10 + "\n" + pikachuImageLine11 + "\n" + pikachuImageLine12 + "\n" + pikachuImageLine13 + "\n" + pikachuImageLine14 + "\n" + pikachuImageLine15 + "\n" );
        


        //System.out.println(pikachuImage);

        Pokemon pikachu1  = new Pokemon(characterIdPikachu, pikachuImage, type);
        //pikachu.skill1();
        //pikachu.skill2();
        
        Scanner pokemonName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Name your Pikachu! :");
        characterIdPikachu = pokemonName.nextLine();  // Read user input
        System.out.println("Your Pikachu wassuccesfuly named " + characterIdPikachu);
        
        while (true) {
            Scanner pokemonCommands = new Scanner(System.in);
            System.out.println("Write \"help \" for commands list!");
            String commandInput = pokemonCommands.nextline();
            if (commandInput == "skill 1") {
                pikachu.skill1();
                break;
            }
            else {
                System.out.println("I didn't understand...");
            }

        }
        
        //pikachu1.imagePrint();
    }
}

class Pokemon {
    private String Id;
    private String image;
    private String type;

    public Pokemon(String Id, String image, String type) {
        this.Id = Id;
        this.image = image;
        this.type = type;
    }
    public void stats() {
        System.out.println(Id);
    }
    public void imagePrint() {
        System.out.println(image);
    }
    public void skill1() {
        System.out.println("\"" + Id + "\"" + "uses skill one!");
    }
    public void skill2() {
        System.out.println("\"" + Id + "\"" + "uses skill two!");
    }
}
 
// class ElectricType extends Pokemon {
//     public Pikachu(String IdPikachu, String image) {
//         characterIdPikachu = IdPikachu;
//     }
//     public void imagePrint() {
//         System.out.println("test");
//     } 
// }
    