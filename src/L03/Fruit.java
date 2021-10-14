package L03;

abstract public class Fruit {
    int weight;

    public Fruit() {
        this.weight = this.weight = 1+(int) (Math.random()*3);

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(double weight){}
}
