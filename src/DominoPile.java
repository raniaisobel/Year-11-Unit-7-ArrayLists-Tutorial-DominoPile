import java.util.ArrayList;
public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        this.pile = new ArrayList<>();
    }

    public void newStack6(){
        for(int i =0;i<=6;i++){
            for(int j = i;j<=6;j++){
                pile.add(new Domino(i,j));
            }
        }
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }

    public void shuffle(){
    ArrayList<Domino> shuffled = new ArrayList<>();
        for(int i=0;i<=pile.size();i++){
            int randomInt = (int) (Math.random() * pile.size());
            shuffled.add(pile.get(randomInt));
        }
        this.pile = shuffled;
    }
}