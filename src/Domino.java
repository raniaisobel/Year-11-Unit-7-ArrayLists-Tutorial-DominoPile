public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        this.top=0;
        this.bottom=0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom(){
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString(){
        return this.top+"/"+this.bottom;
    }

    public void flip(){
        int x = this.top;
        int y = this.bottom;
        this.top = y;
        this.bottom = x;
    }

    public void settle(){
        if (this.top>this.bottom){
            flip();
        }
    }

    public int compareTo(Domino other) {
        int thisSmallest;
        int thisLargest;
        int otherSmallest;
        int otherLargest;

        if (this.top < this.bottom) {
            thisSmallest = this.top;
            thisLargest = this.bottom;
        } else {
            thisSmallest = this.bottom;
            thisLargest = this.top;
        }

        if (other.top < other.bottom) {
            otherSmallest = other.top;
            otherLargest = other.bottom;
        } else {
            otherSmallest = other.bottom;
            otherLargest = other.top;
        }

        if (thisSmallest < otherSmallest) {
            return -1;
        } else if (thisSmallest > otherSmallest) {
            return 1;
        } else {
            if (thisLargest < otherLargest) {
                return -1;
            } else if (thisLargest > otherLargest) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other){
        int thisTotal = this.top+this.bottom;
        int otherTotal = other.top+other.bottom;
        if(thisTotal<otherTotal){
            return -1;
        }
        else if(thisTotal>otherTotal){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean canConnect(Domino other){
        if(this.top==other.top){
            return true;
        }
        if(this.top==other.bottom){
            return true;
        }
        if(this.bottom==other.top){
            return true;
        }
        if(this.bottom==other.bottom){
            return true;
        }
        else{
            return false;
        }
    }
}
