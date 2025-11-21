package Matthew_Glinik.F_generics;

public interface Triple_isEqualTo_Methoods<E> {
    boolean isEqualTo(E other);a
    /*
    default boolean equals(E other){
        return(false);
    }
    */
    /*
    default boolean equals(Object other){
        if(other instanceof E)
        {
            return(equals((E) other));
        }
        else
        {
            return(false);
        }
    }
    */
}
