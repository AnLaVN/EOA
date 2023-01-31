package DataAccessObject;
//Make by Thành Đạt || Dat09

public abstract class EOA_DAO < Entity , Type> {
    abstract public void Insert(Entity e);
    abstract public void Update(Entity e);
    abstract public void Delete(Type ID);
}