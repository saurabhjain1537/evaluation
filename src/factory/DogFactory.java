package factory;

class DogFactory
{
  public static Dog getDog(String criteria) throws Exception
  {
	  Dog dog = null;
	  switch(criteria) {
	  case "small" : dog = new Poodle();
	  break;
	  case "big" : dog = new Rottweiler();
	  break;
	  case "working" : dog = new SiberianHusky();
	  break;
	  default : throw new Exception("Unsupported criteria");
	  }

    return dog;
  }
}
