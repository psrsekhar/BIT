interface Engine {
  public void start();
}
class PetrolEngine implements Engine {
  public void start() {
    System.out.println("Petrol engine started");
  }
}
class DieselEngine implements Engine {
  public void start() {
    System.out.println("Diesel engine started");
  }
}
class ElectricEngine implements Engine {
  public void start() {
    System.out.println("Elecric engine started");
  }
}
class Car {
  Engine e;
  Car(Engine e) {
    this.e = e;
  }
  public void move() {
    e.start();
    System.out.println("Car is moving..");
  }
}
class EngineFactory {
  public static Engine getEngine(String type) {
    Engine e = null;
    if (type.equals("petrol")) {
      e = new PetrolEngine();
    } else if (type.equals("diesel")) {
      e = new DieselEngine();
    } else if (type.equals("electric")) {
      e = new ElectricEngine();
    }
    return e;
  }
}
class Test {
  public static void main(String[] args) {
    Engine e = EngineFactory.getEngine("electric");
    Car c = new Car(e);
    c.move();
  }
}

//System.out.println();
