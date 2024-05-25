package Session27thApril;

public interface Food {

    int price = 4;

    void cusine();
    void country();
}

class Indian implements Food
{

    @Override
    public void cusine() {
        System.out.println("Indian Cusine");
    }

    @Override
    public void country() {
        System.out.println("India");
    }
}

class Chinesse implements Food
{

    @Override
    public void cusine() {
        System.out.println("Chinesse");
    }

    @Override
    public void country() {
        System.out.println("China");
    }
}



class MainTest
{
    public static void main(String[] args) {
//        Food food  = new Indian();
//        food.country();
//        food.cusine();
//
//        Food food1 = new Food();

        Food food;

        food = new Indian();
        food.country();
        food.cusine();

        food = new Chinesse();
        food.country();
        food.cusine();
    }
}


