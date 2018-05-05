package testdome;

import java.util.concurrent.Callable;

interface IBird {
    Egg Lay();
}

class Chicken implements IBird{
    public Chicken() {
    }

    @Override
    public Egg Lay() {
        // Create an implementation for ChickenEgg
        Egg chickenEgg = null;
        chickenEgg = new Egg(new Callable<IBird>() {
            @Override
            public IBird call() throws Exception {
                return new Chicken();
            }
        });
        return chickenEgg;
    }

    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken();
        System.out.println(chicken instanceof IBird);
    }
}

class Egg {
    boolean isHatched = false;
    Callable<IBird> bird;
    public Egg(Callable<IBird> createBird) {
        bird = createBird;
        isHatched = false;
    }

    public IBird Hatch() throws Exception {
        if(isHatched) {
            // Egg already hatched
            throw new IllegalStateException("Can't hatch again");
        } else {
            isHatched = true;
            return bird.call();
        }

    }
}