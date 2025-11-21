package Matthew_Glinik.F_generics;

public interface Triple_isGreaterThan_Methoods<E> {
    // 1115
    public boolean isGreaterThan(E other);
    // 3115
    /*
    public default boolean greaterThan_s(E other){
        return(false);
    }
    */
    /*
    public default boolean greaterThan_s(Object o){
        if(other instanceof E)
        {
            return(greaterThan_s((E) other));
        }
        else
        {
            return(false);
        }
    }
    */
}
