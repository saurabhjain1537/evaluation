package testdome;

import java.util.LinkedList;

public class Platformer {

	LinkedList<Integer> remainingtiles = null;
	int currentTile = 0;
	int numTilesDeleted = 0;
	
    public Platformer(int n, int position) {
    	remainingtiles = new LinkedList<Integer>();
    	currentTile = position;
    	
    	for(int i=0; i < n; i++) {
    		remainingtiles.add(i);
    	}
    }

    public void jumpLeft() {
    	remainingtiles.remove(currentTile);
    	numTilesDeleted++;
    	currentTile = currentTile -2;
    }

    public void jumpRight() {
    	remainingtiles.remove(currentTile);
    	numTilesDeleted++;
    	currentTile ++;
    }

    public int position() {
        return remainingtiles.get(currentTile);
    }

    public static void main(String[] args) {
        Platformer platformer = new Platformer(6, 3);
        System.out.println(platformer.position());

        platformer.jumpLeft();
        System.out.println(platformer.position());

        platformer.jumpRight();
        System.out.println(platformer.position());
    }
}