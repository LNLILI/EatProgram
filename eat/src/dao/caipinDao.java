package dao;



import java.util.List;

import entity.food;

public interface caipinDao {
  public List select();
  public int update(food food);
  public int delete(int id);
  public int add(food food);
  public int select0();
}
