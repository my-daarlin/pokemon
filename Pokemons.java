import java.util.Scanner;

//public class PokemonsV4 {
public class Main {
    public static void main(String[] args) {
        
        //POKEMON VARIABLES SETUP

        String pokemonName;
        String pokemonType;
        String pokemonImage;
        String pokemonClass;
        String pokemonBackroundColour;
        String pokemonFontColour;


        //POKEMON TYPE SELECT + CLASS ASSIGN
        
        Scanner pokemonTypeInput = new Scanner(System.in);                                       // Create a Scanner object
        System.out.println("What Pokemon do you select? :");
        
        while (true) {
            pokemonType = pokemonTypeInput.nextLine();                                           // Read user input
            if (pokemonType.equalsIgnoreCase("Pikachu")) {
                pokemonType = "Pikachu";
                pokemonClass = "Electric";
                System.out.println("Pikachu selected!");
                break;
            }
            else if (pokemonType.equalsIgnoreCase("Bulbasaur")) {
                pokemonType = "Bulbasaur";
                pokemonClass = "Seed";
                System.out.println("Bulbasaur selected!");
                break;
            }
            else {
                System.out.println("You can only select out of these Pokemons: \n    Bulbasaur\n    Pikachu");
            }
        }

        //COLOUR ASSIGN
        
        if (pokemonType.equals("Electric")) {
            pokemonBackroundColour = "\u001b[43m";  //yellow
            pokemonFontColour = "\u001b[30m"; //black
        }
        else {
            pokemonBackroundColour = "\u001b[42m"; //green
            pokemonFontColour = "\u001b[30m"; //black
        }

        //PIKACHU VARIABLES
        
        String pikachuImageLine1 = ("⠸⣷⣦⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⠀⠀⠀");
        String pikachuImageLine2 = (" ⠙⣿⡄⠈⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠔⠊⠉⣿⡿⠁⠀⠀⠀");
        String pikachuImageLine3 = ("⠀⠀⠈⠣⡀⠀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⠁⠀⠀⣰⠟⠀⠀⠀⣀⣀");
        String pikachuImageLine4 = ("⠀⠀⠀⠀⠈⠢⣄⠀⡈⠒⠊⠉⠁⠀⠈⠉⠑⠚⠀⠀⣀⠔⢊⣠⠤⠒⠊⠉⠀⡜");
        String pikachuImageLine5 = ("⠀⠀⠀⠀⠀⠀⠀⡽⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠩⡔⠊⠁⠀⠀⠀⠀⠀⠀⠇");
        String pikachuImageLine6 = ("⠀⠀⠀⠀⠀⠀⠀⡇⢠⡤⢄⠀⠀⠀⠀⠀⡠⢤⣄⠀⡇⠀⠀⠀⠀⠀⠀⠀⢰⠀");
        String pikachuImageLine7 = ("  ⠀⠀⠀⠀⢀⠇⠹⠿⠟⠀⠀⠤⠀⠀⠻⠿⠟⠀⣇⠀⠀⡀⠠⠄⠒⠊⠁⠀");
        String pikachuImageLine8 = ("⠀⠀⠀⠀⠀⠀⢸⣿⣿⡆⠀⠰⠤⠖⠦⠴⠀⢀⣶⣿⣿⠀⠙⢄⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine9 = ("⠀⠀⠀⠀⠀⠀⠀⢻⣿⠃⠀⠀⠀⠀⠀⠀⠀⠈⠿⡿⠛⢄⠀⠀⠱⣄⠀⠀⠀⠀");
        String pikachuImageLine10 = ("⠀⠀⠀⠀⠀⠀⠀⢸⠈⠓⠦⠀⣀⣀⣀⠀⡠⠴⠊⠹⡞⣁⠤⠒⠉⠀⠀⠀⠀⠀");
        String pikachuImageLine11 = ("⠀⠀⠀⠀⠀⠀⣠⠃⠀⠀⠀⠀⡌⠉⠉⡤⠀⠀⠀⠀⢻⠿⠆⠀⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine12 = ("⠀⠀⠀⠀⠀⠰⠁⡀⠀⠀⠀⠀⢸⠀⢰⠃⠀⠀⠀⢠⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine13 = ("⠀⠀⠀⢶⣗⠧⡀⢳⠀⠀⠀⠀⢸⣀⣸⠀⠀⠀⢀⡜⠀⣸⢤⣶⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine14 = ("⠀⠀⠀⠈⠻⣿⣦⣈⣧⡀⠀⠀⢸⣿⣿⠀⠀⢀⣼⡀⣨⣿⡿⠁⠀⠀⠀⠀⠀⠀");
        String pikachuImageLine15 = ("⠀⠀⠀⠀⠀⠈⠻⠿⠿⠓⠄⠤⠘⠉⠙⠤⢀⠾⠿⣿⠟⠋");
        String pikachuImage = pikachuImageLine1 + "\n" + pikachuImageLine2 + "\n" + pikachuImageLine3 + "\n" + pikachuImageLine4 + "\n" + pikachuImageLine5 + "\n" + pikachuImageLine6 + "\n" + pikachuImageLine7 + "\n" + pikachuImageLine8 + "\n" + pikachuImageLine9 + "\n" + pikachuImageLine10 + "\n" + pikachuImageLine11 + "\n" + pikachuImageLine12 + "\n" + pikachuImageLine13 + "\n" + pikachuImageLine14 + "\n" + pikachuImageLine15;
        
        //BULBASAUR VARIABLES

        String bulbasaurImageLine1  = ("         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⡀");
        String bulbasaurImageLine2  = (" ⠀⠀⢀⡀⠀⠀       ⠀⠠⠐⠂⠀⠁⠀⠀⠀⠀");
        String bulbasaurImageLine3  = (" ⠀⠰⡁⠐⢉⣉⣭⡍⠁⠂⠉⠘⡀ ⠀⠀⠀⠀⠂⠡⠀");
        String bulbasaurImageLine4  = (" ⢀⣊⠀⡄⠻⠿⠋⠀⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⠀⢀");
        String bulbasaurImageLine5  = (" ⡎⣾⠀⠁⣴⡆⠀⠡⢺⣿⣆⠀⢠⢱⣄⠀⠀⠀⠀⠈");
        String bulbasaurImageLine6  = (" ⡑⠟⠀⠀⠀⠀⠀⢀⣸⡿⠟⠀⠀⠈⢿⣿⡦⡀⠀⡰");
        String bulbasaurImageLine7  = (" ⠙⠔⠦⣤⣥⣤⣤⣤⡤⠆⠀⠀⠀⠀⢀⢀⠀⠈⠎⠀");
        String bulbasaurImageLine8  = (" ⠀⠀⠈⣰⡋⢉⠉⠁⠒⠂⢇⢠⡆⠀⠸⢴⣿⠀⠘⠀");
        String bulbasaurImageLine9  = (" ⠀⠀⠘⡿⠃⠀⠨⠒⢆⣸⣿⠁⠀⡠⡇⠈⠋⠀⠰⠀");
        String bulbasaurImageLine10  = (" ⠀⠀⠀⠛⠒⠒⠁⠀⠈⠷⡤⠤⠐⠀⠘⠒⠒⠖⠁⠀");
        String bulbasaurImage = bulbasaurImageLine1 + "\n" + bulbasaurImageLine2 + "\n" + bulbasaurImageLine3 + "\n" + bulbasaurImageLine4 + "\n" + bulbasaurImageLine5 + "\n" + bulbasaurImageLine6 + "\n" + bulbasaurImageLine7 + "\n" + bulbasaurImageLine8 + "\n" + bulbasaurImageLine9 + "\n" + bulbasaurImageLine10;

        //IMAGE ASSIGN

        if (pokemonType.equalsIgnoreCase("Pikachu")) {
            pokemonImage = pikachuImage;
        }
        else if (pokemonType.equalsIgnoreCase("Bulbasaur")) {
            pokemonImage = bulbasaurImage;
        }
        else {
            pokemonImage = "Undefined";
        }
        
        //NAME CREATION

        Scanner pokemonNameInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Name your " + pokemonType + "! :");
        pokemonName = pokemonNameInput.nextLine();  // Read user input
        System.out.println("Your " + pokemonType + " was succesfuly named " + pokemonName + "!");
        
        //NEW POKEMON CLASS CREATION

        Pokemon pokemon1  = new Pokemon(pokemonName, pokemonType, pokemonClass, pokemonImage, pokemonFontColour, pokemonBackroundColour);
        
        //COMMAND LINES LOOP

        Scanner pokemonCommands = new Scanner(System.in);
        String commandInput;
        while (true) {
            System.out.println("What sould I do?");
            commandInput = pokemonCommands.nextLine();
            if (commandInput.equals("ability 1")) {
                pokemon1.ability1();
            }

            else if (commandInput.equalsIgnoreCase("ability 2")) {
                pokemon1.ability2();
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
                System.out.println("     stats\n     ability 1\n     ability 2 \n     image\n     close pokemon");
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
        String colourReset = "\u001B[0m";
        System.out.println("Hi, I am a " + pokemonType + " my name is " + pokemonName + " and I am a " + pokemonFontColour + pokemonBackroundColour + pokemonClass + colourReset + " type Pokemon!");
    }

    public void image() {
        System.out.println(pokemonImage);
    }

    public void ability1() {
        System.out.println(pokemonType + " " + pokemonName + " uses ability one!");
    }

    public void ability2() {
        System.out.println(pokemonType + " " + pokemonName + " uses ability two!");
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
    