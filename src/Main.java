public class Main {
    public static void main(String[] args){
        VeggieFood veggieFood1 = new VeggieFood("soybean");
        veggieFood1.giveInformationAboutFood();

        Fruit fruit1 = new Fruit("apple");
        fruit1.giveInformationAboutFruit();

        Vegetable vegetable1 = new Vegetable("Cucumber");
        vegetable1.giveInformationAboutFood();

        VeggieFood fruit2 = VeggieFood.getVeggieFood("Fruit", "Apple");
        fruit2.giveInformationAboutFood();

        Fruit fruit3 = (Fruit)VeggieFood.getVeggieFood("FRuit", "Banana");
        fruit3.giveInformationAboutFruit();

        Object fruit4 = VeggieFood.getVeggieFood("Fruit", "Watermelon");
        Fruit fruitt4 = (Fruit) fruit4;
        fruitt4.giveInformationAboutFruit();

        var fruit5 = VeggieFood.getVeggieFood("Fruit", "pineapple");
        fruit5.giveInformationAboutFood();

        var fruit6 = new Fruit("Avocado");
        fruit6.giveInformationAboutFruit();

        Object fruit7 = new Fruit("Strawberry");
        Fruit fruitt7 = (Fruit) fruit7;
        fruitt7.giveInformationAboutFruit();
    }
}
