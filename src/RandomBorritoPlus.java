import java.util.Random;

public class RandomBorritoPlus {
        public static void main (String[] args){
            //declaring a Random class and naming variables
            Random random = new Random();
            int randomRice, randomBeans, randomMeat, randomSalsa, randomVeggies, randomGuac, randomCheese, randomSourCream, randomQueso;
            String guac, cheese, sourCream, queso;
            double price = 3.0;
            double addIngredient = .50;
            int sum = 0;


            //declaring borrito into an Array
            String[] burritoOrder = new String[25];

            //Borrito options and their randomness
            String[] rice = {"white rice", "brown rice", "no rice"};
            String[] meat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
            String[] beans = {"pinto", "black", "no beans"};
            String[] salsa = {"mild", "medium", "hot", "no salsa"};
            String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};
            String[] Cheese = {"add cheese", "no cheese"};
            String[] Guac = {"add guac", "no guac"};
            String[] Queso = {"add queso", "no queso"};
            String[] SourCream = {"add sour cream", "no sour cream"};

            // for loop initiated borrito at random
            for (int i = 0; i< burritoOrder.length; i++) {
                randomRice = random.nextInt(rice.length);
                randomMeat = random.nextInt(meat.length);
                randomBeans = random.nextInt(beans.length);
                randomSalsa = random.nextInt(salsa.length);
                randomVeggies = random.nextInt(veggies.length);
                randomGuac= random.nextInt(Guac.length);
                randomCheese = random.nextInt(Cheese.length);
                randomSourCream = random.nextInt(SourCream.length);
                randomQueso= random.nextInt(Queso.length);

                // starting my selections
                if (Guac[randomGuac].equals("add guac")){
                    guac = "guac";
                    System.out.println((price + addIngredient));
                }else if (Cheese[randomCheese].equals("add cheese")){
                    cheese = "cheese";
                }else if (SourCream[randomSourCream].equals("add sour cream")){
                    sourCream = "sourCream";
                } else if (Queso[randomQueso].equals("add queso")){
                    queso = "queso";
                }

                //printing out Burrito Orders
                burritoOrder[i] = "Burrito Oder " + (i+1) + ":" + rice[randomRice] + "," + meat[randomMeat] +"," + beans[randomRice] +"," + rice[randomBeans] +"," + salsa[randomSalsa] + "," + veggies[randomVeggies ] + "," + Guac[randomGuac] + "," + Cheese[randomCheese] + "," + SourCream[randomSourCream]+ "," +Queso[randomQueso];
                System.out.println(burritoOrder[i]);
            }

        }

}
