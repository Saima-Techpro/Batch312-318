package practices.day07.interfaces;

public class Car1 implements Engine, Brakes, Chassis{
    @Override
    public boolean isABS() {
        return true;
    }

    @Override
    public void applyBrakes() {
        System.out.println("Applying brakes for Car1");
    }

    @Override
    public String getPaintType() {
        return "Metallic";
    }

    @Override
    public String getPaintColor() {
        return "Black";
    }

    @Override
    public boolean headlightsWork() {
        return true;
    }

    @Override
    public int getHorsepower() {
        return 320;
    }

    @Override
    public double getDisplacement() {
        return 3.0;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is running!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is stopping!");
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
