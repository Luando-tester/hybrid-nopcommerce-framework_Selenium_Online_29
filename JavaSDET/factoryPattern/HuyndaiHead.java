package factoryPattern;

public class HuyndaiHead extends CarFactory {
    @Override
    public void viewCar(){
        System.out.println("View Huyndai Car");
    }

    @Override
    public void driverCar(){
        System.out.println("Drive Huyndai Car");
    }

    @Override
    public void bookCar(){
        System.out.println("Book Huyndai Car");
    }
}
