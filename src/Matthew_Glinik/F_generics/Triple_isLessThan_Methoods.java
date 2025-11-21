package Matthew_Glinik.F_generics;

public interface Triple_isLessThan_Methoods<E> {
    // 1115
    public boolean isLessThan(E other);
    // 3115
    /*
    public default boolean lessThan_s(E other){
        return(false);
    }
    */
    /*
    public default boolean lessThan_s(Object o){
        if(other instanceof E)
        {
            return(lessThan_s((E) other));
        }
        else
        {
            return(false);
        }
    }
    */
}
