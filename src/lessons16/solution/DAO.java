package lessons16.solution;


public interface DAO<A> {
    void save(A p);
    A load(A id);
    void delete(int id);
    void delete(A a);
}
