
public class Gen<AnyClass> implements Comparable<AnyClass>{

    private AnyClass data;
    public Gen( AnyClass data ) {
        this.data = data;
    }
    public AnyClass add( AnyClass data2 ) {
        return data2;
    }

    public int compareTo( AnyClass ob2 ) {
        return 0;
    }
}
