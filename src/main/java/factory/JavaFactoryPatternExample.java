package factory;

public class JavaFactoryPatternExample
{
  public static void main(String[] args) throws Exception
  {
    // create a small dog
    Dog dog = DogFactory.getDog("small");
    dog.speak();

    // create a big dog
    dog = DogFactory.getDog("big");
    dog.speak();

    // create a working dog
    dog = DogFactory.getDog("working");
    dog.speak();
  }
}