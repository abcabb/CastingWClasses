public class VeggieFood {
    private String name;

    public String getName(){
        return name;
    }
    public VeggieFood(String name){
        this.name = name;
    }

    public void giveInformationAboutFood(){
        String type = this.getClass().getSimpleName();
        System.out.println(name + " is a " + type + " veggie food.");
    }

    public static VeggieFood getVeggieFood(String type, String name){
        return switch (type.toUpperCase().charAt(0)){
            case 'F' -> new Fruit(name);
            case 'V' -> new Vegetable(name);
            case 'A' -> new AnimalProducted(name);
            default -> new VeggieFood(name);
        };
    }
}

class Fruit extends VeggieFood{
    public Fruit(String name){
        super(name);
    }

    @Override
    public void giveInformationAboutFood(){
        super.giveInformationAboutFood();
    }

    public void giveInformationAboutFruit(){
        System.out.println("This " + super.getName() + " fruit is juicy !");
    }
}

class Vegetable extends VeggieFood{
    public Vegetable(String name){
        super(name);
    }

    @Override
    public void giveInformationAboutFood() {
        super.giveInformationAboutFood();
    }

    public void giveInformationAboutVegetable(){
        System.out.println("This " + super.getName() + " vegetable is so fresh !");
    }
}

class AnimalProducted extends VeggieFood{
    public AnimalProducted(String name){
        super(name);
    }

    @Override
    public void giveInformationAboutFood() {
        super.giveInformationAboutFood();
    }

    public void giveInformationAboutAnimalProduct(){
        System.out.println("This " + super.getName() + " Animal product food is so delicious !");
    }
}