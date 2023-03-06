package dao;

public interface IB_IDao<T,ID> {
    T trouverParId(ID id);
}
