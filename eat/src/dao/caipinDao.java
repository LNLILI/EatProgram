package dao;



import java.util.List;
import java.util.Vector;

import entity.food;

public interface caipinDao {
  public Vector select();
  public int update(food food);
  public int delete(String id);
  public int add(food food);
  public Vector select0(String name);
  public Vector ROU();
}
