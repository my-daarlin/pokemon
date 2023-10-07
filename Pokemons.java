//SITES USED
//https://emojicombos.com/pokemon-dot-art

import java.util.Scanner;

public class Pokemons {
//public class Main {
    public static void main(String[] args) {
        
        //MAIN POKEMON VARIABLES SETUP

        String pokemonName;;
        
        //STAGE 1 POKEMON VARIABLES SETUP

        String stage1PokemonBackroundColour;
        String stage1PokemonFontColour;
        String stage1PokemonImage;
        String stage1PokemonClass;
        String stage1PokemonType;
        String stage1PokemonAbility1;
        String stage1PokemonAbility2;
        int stage1PokemonStageCount;

        //STAGE 2 POKEMON VARIABLES SETUP

        String stage2PokemonBackroundColour = " ";
        String stage2PokemonFontColour = " ";
        String stage2PokemonClass = " ";
        String stage2PokemonImage = " ";
        String stage2PokemonType = " ";
        String stage2PokemonAbility1 = " ";
        String stage2PokemonAbility2 = " ";
        int stage2PokemonStageCount = 0;

        //STAGE 3 POKEMON VARIABLES SETUP

        String stage3PokemonBackroundColour = " ";
        String stage3PokemonFontColour = " ";
        String stage3PokemonClass = " ";
        String stage3PokemonImage = " ";
        String stage3PokemonType = " ";
        String stage3PokemonAbility1 = " ";
        String stage3PokemonAbility2 = " ";
        int stage3PokemonStageCount = 0;

        //PICHU VARIABLES

        int pichuStageCount = 2;
        String pichuAbility1 = "\u001b[43m" + "\u001b[30m" + "collect" + "\u001B[0m";   
        String pichuAbility2 = "\u001b[43m" + "\u001b[30m" + "cry for help" + "\u001B[0m";
        String pichuBackroundColour = "\u001b[43m";  //yellow
        String pichuFontColour = "\u001b[30m"; //black
        String pichuImageLine1 = "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣶⣿";
        String pichuImageLine2 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣿";
        String pichuImageLine3 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⠟⢻⣿⣿⣿⣿";
        String pichuImageLine4 = "⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠿⠋⠀⠀⠈⢡⣿⣿⡇";
        String pichuImageLine5 = "⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣄⠀⠀⠀⠀⠀⠀⠟⠁⠀⠀⠀⠀⠀⣼⣿⣿⠁";
        String pichuImageLine6 = "⠀⠹⣿⣿⣿⠿⡄⠉⠉⠙⠛⠻⢿⠀⠀⠀⣀⡀⠀⠘⠄⠀⠀⠀⠀⢠⣿⣿⡟⠀";
        String pichuImageLine7 = "⠀⠀⠙⣿⣿⣷⡀⠀⠀⠀⠀⠀⢸⠤⠂⠁⠀⠀⠀⠀⠀⠀⠀⠠⡀⠚⠛⠛⠀⠀";
        String pichuImageLine8 = "⠀⠀⠀⠈⢿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢤⣄⠀⠐⡀⠀⠀⠀⠀";
        String pichuImageLine9 = "⠀⠀⠀⠀⠀⠻⣿⣿⣿⠦⢲⠁⠀⢀⢀⠀⠀⠀⠀⠀⠸⣾⡿⢃⣠⡅⠀⠀⠀⠀";
        String pichuImageLine10 = "⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⢸⠀⠐⣷⣾⡇⠀⠀⠂⠀⡀⠀⠀⣾⣿⡇⠀⠀⠀⠀";
        String pichuImageLine11 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣠⣤⣌⠉⠀⠀⠒⠒⠊⠀⠀⠀⢙⣟⠤⠀⠀⠀⠀";
        String pichuImageLine12 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠻⣿⡇⠀⠀⠀⠀⠀⣀⣤⣶⠉⠀⠀⢠⠃⠀⠀";
        String pichuImageLine13 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠔⠀⠀⠉⠉⡽⣿⣿⣿⢿⣿⠁⠀⢀⠔⠁⠀⠀⠀";
        String pichuImageLine14 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢤⢤⢴⠀⠋⠀⠁⠀⠉⠀⠸⣠⣴⣤⡀⠀⠀";
        String pichuImageLine15 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠘⠀⢣⠀⠀⠀⠀⠀⠀⢀⠿⣿⣿⣿⣦⡀";
        String pichuImageLine16 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢄⠀⢀⠀⠀⠀⠀⠀⢀⠈⠀⠈⠻⣿⠟⠋";
        String pichuImageLine17 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⢠⠀⠀⠐⡄⠀⠀⠀⠀⠀";
        String pichuImageLine18 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠣⣀⣌⠇⠀⠀⠀⠀⠀";
        String pichuImage = pichuImageLine1 + "\n" + pichuImageLine2 + "\n" + pichuImageLine3 + "\n" + pichuImageLine4 + "\n" + pichuImageLine5 + "\n" + pichuImageLine6 + "\n" + pichuImageLine7 + "\n" + pichuImageLine8 + "\n" + pichuImageLine9 + "\n" + pichuImageLine10 + "\n" + pichuImageLine11 + "\n" + pichuImageLine12 + "\n" + pichuImageLine13 + "\n" + pichuImageLine14 + "\n" + pichuImageLine15 + "\n" + pichuImageLine16 + "\n" + pichuImageLine17 + "\n" + pichuImageLine18; 

        //PIKACHU VARIABLES
        
        int pikachuStageCount = 1;
        String pikachuAbility1 = "\u001b[43m" + "\u001b[30m" + "Lightning rod" + "\u001B[0m";
        String pikachuAbility2 = "\u001b[43m" + "\u001b[30m" + "Thunder" + "\u001B[0m";
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
        
        //RAICHU VARIABLES

        int raichuStageCount = 0;
        String raichuAbility1 =  "\u001b[43m" + "\u001b[30m" + "Thunder Shock" + "\u001B[0m";
        String raichuAbility2 =  "\u001b[43m" + "\u001b[30m" + "Ace Spark" + "\u001B[0m";
        String raichuImageLine1 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        String raichuImageLine2 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠛⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        String raichuImageLine3 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        String raichuImageLine4 = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠼⣄⡀⠀⠀⠀⠀⠀⠀⠀";
        String raichuImageLine5 = "⠀⠀⠀⡴⠋⠳⣄⠀⠀⢀⢎⣔⠀⠀⠀⠀⠉⠳⣄⠀⠀⠀⠀⠀";
        String raichuImageLine6 = "⠀⢠⠞⠁⠀⠀⠀⠹⣶⢛⠘⡋⠀⢠⣎⣦⠀⠀⠈⠙⠲⢤⡀⠀";
        String raichuImageLine7 = "⣰⠏⠀⠀⠀⠀⠀⠀⢰⠀⠰⡤⡀⠀⢛⣋⠀⠀⠰⣄⣀⣠⣿⣆";
        String raichuImageLine8 = "⠛⠒⠶⠶⢶⡶⠄⢀⣨⢦⡀⠢⠃⠀⠸⣿⠇⠀⢰⠃⠉⠉⠉⠉";
        String raichuImageLine9 = "⠀⠀⠀⠰⠿⣤⣀⠛⢧⣌⡇⠀⠀⠀⠀⠀⠰⠉⠙⢳⠀⠀⠀⠀";
        String raichuImageLine10 = "⠀⠀⠀⠀⠀⠀⣼⣣⣞⣽⣇⠀⠈⠑⢄⠀⠐⢄⣀⣸⠀⠀⠀⠀";
        String raichuImageLine11 = "⠀⠀⠀⠀⠀⠈⠛⣿⣿⠁⠉⠠⡀⠀⠀⡆⠀⠀⠀⢹⡀⠀⠀⠀";
        String raichuImageLine12 = "⠀⠀⠀⠀⠀⠀⠀⠹⡿⠇⠀⠀⢈⠁⠊⠀⠀⠀⠀⠈⣇⠀⠀⠀";
        String raichuImageLine13 = "⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀";
        String raichuImageLine14 = "⠀⠀⠀⠀⠀⠀⠀⠀⣸⠗⠀⣀⣦⣀⣤⣤⠴⠾⣄⡀⠺⡄⠀⠀";
        String raichuImageLine15 = "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀";
        String raichuImage = raichuImageLine1 + "\n" + raichuImageLine2 + "\n" + raichuImageLine3 + "\n" + raichuImageLine4 + "\n" + raichuImageLine5 + "\n" + raichuImageLine6 + "\n" + raichuImageLine7 + "\n" + raichuImageLine8 + "\n" + raichuImageLine9 + "\n" + raichuImageLine10 + "\n" + raichuImageLine11 + "\n" + raichuImageLine12 + "\n" + raichuImageLine13 + "\n" + raichuImageLine14 + "\n" + raichuImageLine15;


        //BULBASAUR VARIABLES

        int bulbasaurStageCount = 0;
        String bulbasaurAbility1 = "\u001b[42m" + "\u001b[30m" + "Whine whip" + "\u001B[0m";
        String bulbasaurAbility2 = "\u001b[42m" + "\u001b[30m" + "Razor leaf" + "\u001B[0m";
        String bulbasaurFontColour = "\u001b[30m";
        String bulbasaurBackroundColour = "\u001b[42m";
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

        //EEVEE VARIABLES

        int eeveeStageCount = 1;
        String eeveeAbility1 = "\u001b[30m" + "\u001b[47m" + "Be Prepared" + "\u001B[0m";
        String eeveeAbility2 = "\u001b[30m" + "\u001b[47m" + "Bite" + "\u001B[0m";
        String eeveeTextColour = "\u001b[30m";
        String eeveeBackroundColour = "\u001b[47m";
        String eeveeImage = "Im sorry, but Eevee doesn't have a picture yet...";
        
        //FLAREON VARIABLES

        int flareonStageCount = 0;
        String flareonAbility1 = "\u001b[41m" + "\u001b[30m" + "Bite" + "\u001B[0m";
        String flareonAbility2 = "\u001b[41m" + "\u001b[30m" + "Fire Spin" + "\u001B[0m";
        String flareonFontColour = "\u001b[30m";
        String flareonBackroundColour = "\u001b[41m";
        String flareonImageLine1 = "⠐⣶⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣷⠀";
        String flareonImageLine2 = "⠀⠸⡏⠙⠦⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣠⠖⠋⣸⠃⠀";
        String flareonImageLine3 = "⠀⠀⢻⠀⠀⠈⢳⡀⠀⠀⠀⢨⢢⠀⢠⠞⠁⠀⢠⡏⠀⠀";
        String flareonImageLine4 = "⠀⠀⠈⣧⠀⠀⠀⢻⡀⡠⠔⠊⠀⢣⡏⠀⠀⠀⡾⠀⠀⠀";
        String flareonImageLine5 = "⠀⠀⠀⠈⠓⠦⣴⣼⡏⠀⠀⠀⢠⣾⣤⣤⠶⠛⠁⢀⣿⠀";
        String flareonImageLine6 = "⠀⠀⠀⠀⠀⣶⠟⢻⣿⣦⣀⣤⣾⣿⡏⠙⢲⠀⠀⣾⣿⡇";
        String flareonImageLine7 = "⠀⠀⠀⠀⣸⠃⠀⢀⠀⢹⣿⣿⠃⢀⡇⠀⠘⣶⣶⣿⣿⠇";
        String flareonImageLine8 = "⠀⠀⠀⠀⢰⠀⠀⠈⠻⣿⣯⣿⡿⠟⠁⠀⠀⣿⣿⣿⡿⠀";
        String flareonImageLine9 = "⠀⠀⠀⠀⠙⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣽⣿⣿⣄⠀";
        String flareonImageLine10 = "⠀⠀⠀⠀⠀⢺⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⡟⠁⠀";
        String flareonImageLine11 = "⠀⠀⠀⠀⠀⠀⠈⣿⣦⣴⣴⣤⣶⣤⣾⣿⣿⣿⣿⡁⠀⠀";
        String flareonImageLine12 = "⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⡿⣿⠟⠋⠉⠀⠀⠀";
        String flareonImageLine13 = "⠀⠀⠀⠀⠀⠀⠺⠿⢿⣿⠏⠻⣿⡿⠿⠇⠀⠀⠀⠀⠀⠀";
        String flareonImage = flareonImageLine1 + "\n" + flareonImageLine2 + "\n" + flareonImageLine3 + "\n" + flareonImageLine4 + "\n" + flareonImageLine5 + "\n" + flareonImageLine6 + "\n" + flareonImageLine7 + "\n" + flareonImageLine8 + "\n" + flareonImageLine9 + "\n" + flareonImageLine10 + "\n" + flareonImageLine11 + "\n" + flareonImageLine12 + "\n" + flareonImageLine13;

        //POKEMON TYPE SELECT + CLASS/ABILITY/IMAGE/STAGE COUNT/COLOUR/STAGE 2 VARIABLES ASSIGN
        
        Scanner pokemonTypeInputScanner = new Scanner(System.in);                                       // Create a Scanner object
        System.out.println("What Pokemon do you select? :");
        String pokemonTypeInput;
        
        while (true) {
            pokemonTypeInput = pokemonTypeInputScanner.nextLine();                                           // Read user input
            if (pokemonTypeInput.equalsIgnoreCase("Pichu")) {
                //type/class/ST/image
                stage1PokemonType = "Pichu";
                stage1PokemonClass = "Electric";
                stage1PokemonStageCount = pichuStageCount;
                stage1PokemonImage = pichuImage;

                //abilities
                stage1PokemonAbility1 = pichuAbility1;
                stage1PokemonAbility2 = pichuAbility2;

                //colours
                stage1PokemonFontColour = pichuFontColour;
                stage1PokemonBackroundColour = pichuBackroundColour;
                
                //STAGE 2
                //type/class/ST/image
                stage2PokemonType = "Pikachu";
                stage2PokemonClass = stage1PokemonClass;
                stage2PokemonStageCount = pikachuStageCount;
                stage2PokemonImage = pikachuImage;
                
                //abilities
                stage2PokemonAbility1 = pikachuAbility1;
                stage2PokemonAbility2 = pikachuAbility2;

                //colours
                stage2PokemonFontColour = pichuFontColour;
                stage2PokemonBackroundColour = pichuBackroundColour;
                
                //STAGE 3
                //type/class/ST/image
                stage3PokemonType = "Raichu";
                stage3PokemonClass = stage1PokemonClass;
                stage3PokemonStageCount = raichuStageCount;
                stage3PokemonImage = raichuImage;

                //abilities
                stage3PokemonAbility1 = raichuAbility1;
                stage3PokemonAbility2 = raichuAbility2;

                //colours
                stage3PokemonFontColour = pichuFontColour;
                stage3PokemonBackroundColour = pichuBackroundColour;

                System.out.println("Pichu selected!");
                break;
            }
            else if (pokemonTypeInput.equalsIgnoreCase("Bulbasaur")) {
                //type/class/ST/image
                stage1PokemonType = "Bulbasaur";
                stage1PokemonClass = "Seed";
                stage1PokemonStageCount = bulbasaurStageCount;
                stage1PokemonImage = bulbasaurImage;

                //abilities
                stage1PokemonAbility1 = bulbasaurAbility1;
                stage1PokemonAbility2 = bulbasaurAbility2;

                //colours
                stage1PokemonFontColour = bulbasaurFontColour;
                stage1PokemonBackroundColour = bulbasaurBackroundColour;
                
                
                System.out.println("Bulbasaur selected!");
                break;
            }
            else if (pokemonTypeInput.equalsIgnoreCase("eevee")) {
                //type/class/ST/image
                stage1PokemonType = "Eevee";
                stage1PokemonClass = "Normal";
                stage1PokemonStageCount = eeveeStageCount;
                stage1PokemonImage = eeveeImage;

                //abilities
                stage1PokemonAbility1 = eeveeAbility1;
                stage1PokemonAbility2 = eeveeAbility2;

                //colours
                stage1PokemonFontColour = eeveeTextColour;
                stage1PokemonBackroundColour = eeveeBackroundColour;
                
                //STAGE2
                //type/class/ST/image
                stage2PokemonType = "Flareon";
                stage2PokemonClass = "Fire";
                stage2PokemonStageCount = flareonStageCount;
                stage2PokemonImage = flareonImage;

                //abilities
                stage2PokemonAbility1 = flareonAbility1;
                stage2PokemonAbility2 = flareonAbility2;

                //colours
                stage2PokemonFontColour = flareonFontColour;
                stage2PokemonBackroundColour = flareonBackroundColour;

                System.out.println("Eevee selected!");
                break;
            }
            else {
                System.out.println("You can only select out of these Pokemons: \n    Bulbasaur\n    Pichu\n    Eevee");
            }
        }

        //POKEMON NAME

        Scanner pokemonNameInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Name your " + stage1PokemonType + "! :");
        pokemonName = pokemonNameInput.nextLine();  // Read user input
        System.out.println("Your " + stage1PokemonType + " was succesfuly named " + pokemonName + "!");
        
        //NEW POKEMON CLASS CREATION

        Pokemon pokemonStage1 = new Pokemon(pokemonName, stage1PokemonType, stage1PokemonClass, stage1PokemonImage, stage1PokemonFontColour, stage1PokemonBackroundColour, stage1PokemonAbility1, stage1PokemonAbility2);
        Pokemon pokemonStage2 = new Pokemon(pokemonName, stage2PokemonType, stage2PokemonClass, stage2PokemonImage, stage2PokemonFontColour, stage2PokemonBackroundColour, stage2PokemonAbility1, stage2PokemonAbility2);
        Pokemon pokemonStage3 = new Pokemon(pokemonName, stage3PokemonType, stage3PokemonClass, stage3PokemonImage, stage3PokemonFontColour, stage3PokemonBackroundColour, stage3PokemonAbility1, stage3PokemonAbility2);

        //COMMAND LINES LOOP FOR STAGE ONE

        boolean b = false;
        Scanner stage1PokemonCommands = new Scanner(System.in);
        String commandInputStage1;
        while (true) {
            System.out.println("What sould I do?");
            commandInputStage1 = stage1PokemonCommands.nextLine();
            if (commandInputStage1.equals("ability 1")) {
                pokemonStage1.ability1();
            }
            else if (commandInputStage1.equalsIgnoreCase("ability 2")) {
                pokemonStage1.ability2();
            }
            else if (commandInputStage1.equalsIgnoreCase("image")) {
                pokemonStage1.image();
            }
            else if (commandInputStage1.equalsIgnoreCase("stats")) {
                pokemonStage1.stats();
            }
            else if (commandInputStage1.equalsIgnoreCase("close pokemon")) {
                break;
            }
            else if (commandInputStage1.equalsIgnoreCase("evolve")) {
                if (stage1PokemonStageCount > 0) { //if its bigger, it will pass to the next loop 
                    b = true;
                    System.out.println(stage1PokemonType + " has evolved to " + stage2PokemonType + "!");
                    break;
                }
                else {
                    b = false; //if its smaller, it will skip the next class
                    System.out.println(stage1PokemonType + " doesn't evolve further...");
                }
            }

            else {
                System.out.println("I didn't understand...");
                System.out.println("You can only use these commands:");
                System.out.println("     stats\n     ability 1\n     ability 2\n     evolve\n     image\n     close pokemon");
            }
        }

        //COMMAND LINES LOOP FOR STAGE TWO

        boolean c = false;
        Scanner stage2PokemonCommands = new Scanner(System.in);
        String commandInputStage2;
        if (b == true) {    
            while (true) {
                System.out.println("What sould I do?");
                commandInputStage2 = stage2PokemonCommands.nextLine();
                if (commandInputStage2.equals("ability 1")) {
                    pokemonStage2.ability1();
                }
                else if (commandInputStage2.equalsIgnoreCase("ability 2")) {
                    pokemonStage2.ability2();
                }
                else if (commandInputStage2.equalsIgnoreCase("image")) {
                    pokemonStage2.image();
                }
                else if (commandInputStage2.equalsIgnoreCase("stats")) {
                    pokemonStage2.stats();
                }
                else if (commandInputStage2.equalsIgnoreCase("close pokemon")) {
                    break;
                }
                else if (commandInputStage2.equalsIgnoreCase("evolve")) {
                    if (stage2PokemonStageCount > 0) {
                        c = true;
                        System.out.println(stage2PokemonType + " has evolved to " + stage3PokemonType + "!");
                        break;
                    }
                    else {
                        c = false;
                        System.out.println(stage2PokemonType + " doesn't evolve further...");
                    } 
                }
                else {
                    System.out.println("I didn't understand...");
                    System.out.println("You can only use these commands:");
                    System.out.println("     stats\n     ability 1\n     ability 2\n     evolve\n     image\n     close pokemon");
                }
            }
        }
        else {}

        //COMMAND LOOP FOR STAGE 3

        //boolean d;
        Scanner stage3PokemonCommands = new Scanner(System.in);
        String commandInputStage3;
        if (c == true) {    
            while (true) {
                System.out.println("What sould I do?");
                commandInputStage3 = stage3PokemonCommands.nextLine();
                if (commandInputStage3.equals("ability 1")) {
                    pokemonStage3.ability1();
                }
                else if (commandInputStage3.equalsIgnoreCase("ability 2")) {
                    pokemonStage3.ability2();
                }
                else if (commandInputStage3.equalsIgnoreCase("image")) {
                    pokemonStage3.image();
                }
                else if (commandInputStage3.equalsIgnoreCase("stats")) {
                    pokemonStage3.stats();
                }
                else if (commandInputStage3.equalsIgnoreCase("close pokemon")) {
                    break;
                }
                else if (commandInputStage3.equalsIgnoreCase("evolve")) {
                    if (stage3PokemonStageCount > 0) {
                        //d = true;
                        //System.out.println(stage3PokemonType + " has evolved to " + stage4PokemonType + "!");
                        break;
                    }
                    else {
                        //d = false;
                        System.out.println(stage3PokemonType + " doesn't evolve further...");
                    } 
                }
                else {
                    System.out.println("I didn't understand...");
                    System.out.println("You can only use these commands:");
                    System.out.println("     stats\n     ability 1\n     ability 2\n     evolve\n     image\n     close pokemon");
                }
            }
        }
        else {}
        
        //SCANNER CLOSE

        stage1PokemonCommands.close();
        stage2PokemonCommands.close();
        stage3PokemonCommands.close();
        pokemonNameInput.close();
        pokemonTypeInputScanner.close();
    }
}


class Pokemon {
    private String pokemonName;
    private String pokemonImage;
    private String pokemonType;
    private String pokemonClass;
    private String pokemonFontColour;
    private String pokemonBackroundColour;
    private String pokemonAbility1;
    private String pokemonAbility2;

    public Pokemon(String pokemonName, String pokemonType, String pokemonClass, String pokemonImage, String pokemonFontColour, String pokemonBackroundColour, String pokemonAbility1, String pokemonAbility2) {
        this.pokemonName = pokemonName;
        this.pokemonImage = pokemonImage;
        this.pokemonType = pokemonType;
        this.pokemonClass = pokemonClass;
        this.pokemonFontColour = pokemonFontColour;
        this.pokemonBackroundColour = pokemonBackroundColour;
        this.pokemonAbility1 = pokemonAbility1;
        this.pokemonAbility2 = pokemonAbility2;
    }
    public void stats() {
        String colourReset = "\u001B[0m";
        System.out.println("Hi, I am a " + pokemonType + ", my name is " + pokemonName + " and I am a " + pokemonFontColour + pokemonBackroundColour + pokemonClass + colourReset + " type Pokemon!");
        System.out.println("My abilities are:\n\t--" + pokemonAbility1 + "\n\t--" + pokemonAbility2);
    }

    public void image() {
        System.out.println(pokemonImage);
    }

    public void ability1() {
        System.out.println(pokemonType + " " + pokemonName + " uses " + pokemonAbility1 + "!");
    }

    public void ability2() {
        System.out.println(pokemonType + " " + pokemonName + " uses " + pokemonAbility2 + "!");
    }
}
    