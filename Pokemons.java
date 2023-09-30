import java.util.Scanner;

public class PokemonsV3 {
    public static void main(String[] args) {
        
        //Pokemon Parameter variables

        String pokemonName;
        String pokemonType;
        String pokemonImage;
        String pokemonClass;
        String pokemonBackroundColour;
        String pokemonFontColour;


        //Pokemon type select + class asigning
        
        Scanner pokemonTypeInput = new Scanner(System.in);                                       // Create a Scanner object
        System.out.println("What Pokemon do you select? :");
        
        while (true) {
            pokemonType = pokemonTypeInput.nextLine();                                               // Read user input
            if (pokemonType.equalsIgnoreCase("Pikachu")) {
                pokemonType = "Pikachu";
                pokemonClass = "Electric";
                System.out.println("Pikachu");
                break;
            }
            else if (pokemonType.equalsIgnoreCase("Bulbosaur")) {
                pokemonType = "Bulbosaur";
                pokemonClass = "Seed";
                System.out.println("Bulbosaur");
                break;
            }
            else {
                System.out.println("You can only select out of these Pokemons: \n    Bulbosaur\n    Pikachu");
            }
        }

        //COLOUR SELECT
        
        if (pokemonType.equals("Electric")) {
            pokemonBackroundColour = "\u001b[43m";
            pokemonFontColour = "\u001b[30m";
        }
        else {
            pokemonBackroundColour = "\u001b[42m";
            pokemonFontColour = "\u001b[30m";
        }

        //Pikachu variables
        
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
        
        //Image Assigning

        if (pokemonType.equalsIgnoreCase("Pikachu")) {
            pokemonImage = pikachuImage;
        }
        else {
            pokemonImage = "Undefined";
        }
        
        //Creating a name

        Scanner pokemonNameInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Name your Pikachu! :");
        pokemonName = pokemonNameInput.nextLine();  // Read user input
        System.out.println("Your Pikachu wassuccesfuly named " + pokemonName);
        
        //Creating a new pokemon class

        Pokemon pokemon1  = new Pokemon(pokemonName, pokemonType, pokemonClass, pokemonImage, pokemonFontColour, pokemonBackroundColour);
        
        //Creating the command lines

        Scanner pokemonCommands = new Scanner(System.in);
        String commandInput;
        while (true) {
            System.out.println("What sould I do?");
            commandInput = pokemonCommands.nextLine();
            if (commandInput.equals("skill 1")) {
                pokemon1.skill1();
            }

            else if (commandInput.equalsIgnoreCase("skill 2")) {
                pokemon1.skill2();
            }

            else if (commandInput.equalsIgnoreCase("image")) {
                pokemon1.image();
            }

            else if (commandInput.equalsIgnoreCase("stats")) {
                pokemon1.stats();
            }

            else if (commandInput.equalsIgnoreCase("close pokemon")) {
                break;
            }

            else {
                System.out.println("I didn't understand...");
                System.out.println("You can only use these commands:");
                System.out.println("     stats\n     skill 1\n     skill2 \n     image\n     close pokemon");
            }
        }
    }
}

class Pokemon {
    private String pokemonName;
    private String pokemonImage;
    private String pokemonType;
    private String pokemonClass;
    private String pokemonFontColour;
    private String pokemonBackroundColour;

    public Pokemon(String pokemonName, String pokemonType, String pokemonClass, String pokemonImage, String pokemonFontColour, String pokemonBackroundColour) {
        this.pokemonName = pokemonName;
        this.pokemonImage = pokemonImage;
        this.pokemonType = pokemonType;
        this.pokemonClass = pokemonClass;
        this.pokemonFontColour = pokemonFontColour;
        this.pokemonBackroundColour = pokemonBackroundColour;
    }
    public void stats() {
        String resetColour = "\u001B[0m";
        System.out.println("Hi, I am a " + pokemonType + " my name is " + pokemonName + " and I am a " + pokemonFontColour + pokemonBackroundColour + pokemonClass + resetColour + " type Pokemon!");
    }

    public void image() {
        System.out.println(pokemonImage);
    }

    public void skill1() {
        System.out.println(pokemonType + pokemonName + " uses skill one!");
    }

    public void skill2() {
        System.out.println(pokemonType + pokemonName + " uses skill two!");
    }
}

//V3 - electric class experiment, ONLY INCLUDE IN V3!!
 
// class ElectricType extends Pokemon {
//     public Pikachu(String IdPikachu, String image) {
//         characterIdPikachu = IdPikachu;
//     }
//     public void imagePrint() {
//         System.out.println("test");
//     } 
// }
    