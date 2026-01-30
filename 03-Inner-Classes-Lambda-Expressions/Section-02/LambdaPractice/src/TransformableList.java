import java.util.ArrayList;

public class TransformableList extends ArrayList<Integer> {
    
    // takes in any arbitrary transformer
    // applies this to every value in the list
    public void transformAll(Transformer t){

        for(int i = 0; i < this.size(); i ++){
            int modified = t.transform(this.get(i));

            this.set(i, modified);
        }
    }
}
