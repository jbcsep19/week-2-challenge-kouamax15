import java.util.Random;
public class RandomBorrito {
    public static void main (String[] args){
        //decalring a Random class
        Random random = new Random();
        int randomRice, randomBeans, randomMeat, randomSalsa, randomVeggies;

        //Storing my borrito and the name of container that is the array
        String[] burritoOrder = new String[10];

        //Borrito options and their randomness
        String[] rice = {"white rice", "brown rice", "no rice"};
        String[] meat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String[] beans = {"pinto", "black", "no beans"};
        String[] salsa = {"mild", "medium", "hot", "no salsa"};
        String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};

        // for loop initiated to put the borrito options inside my borrito at random
        for (int b = 0; b< burritoOrder.length; b++) {
            randomRice = random.nextInt(rice.length);
            randomMeat = random.nextInt(meat.length);
            randomBeans = random.nextInt(beans.length);
            randomSalsa = random.nextInt(salsa.length);
            randomVeggies = random.nextInt(veggies.length);

            //printing out Burrito Orders
            burritoOrder[b] = "Burrito Oder " + (b+1) + ":" + rice[randomRice] + "," + meat[randomMeat] +"," + beans[randomRice] +"," + rice[randomBeans] +"," + salsa[randomSalsa] + "," + veggies[randomVeggies];
            System.out.println(burritoOrder[b]);
        }

        }

    }


//    String[] borrito = {"white rice", "carnidas meat", "no beans", "hot salsa", "no veggies"};
//    String[] rice = {"white", "brown", "no rice"};
//    String[] beat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
//    String[] beans = {"pinto", "black", "no beans"};
//    String[] Salsa = {"mild", "medium", "hot", "no salsa"};
//    String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};
//    Random r = new Random();
//    int index;
//    for (int b = 0; b< borrito.length ; b++) {
//        System.out.print("Borrito: " + (borrito[b] + ","));
//        index = 0 + r.nextInt(5);
//        for (int r = 0; b< rice.length; r++){
//            System.out.print("Rice: " + (rice[r] + ","));
//            index = 0 + r.nextInt(5);
//        }

//}



        //import java.util.Random;
///for (row = 1; row <= MAX; row++){
//            for (column = 1; column <= MAX; column++){
//                System.out.print(row * column + "\t");/
// public class RandomWeekDay {
////    public static void main (String[] args){
////        String[] weekDays = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};
////        Random r = new Random();
////        int index;
////
////        for (int counter = 1; counter <=10 ; counter++) {
////                index = 0 + r.nextInt(7);
////                System.out.println(weekDays[index]);
////                System.out.println("Generated number: " + index);
////        }
////        System.out.println("Have a nice day!");
//public class RandomnessGenerator {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        int randomInt;
//
//
//        for ( int counter  = 1; counter <=10; counter++) {
//            randomInt = 1 + r.nextInt(6);
//            System.out.println("Generated number: " + randomInt);
//        }
//        System.out.println("Done!");
//    }
//
//    private static void output(String aMessage){
//
//    }
//
//}
