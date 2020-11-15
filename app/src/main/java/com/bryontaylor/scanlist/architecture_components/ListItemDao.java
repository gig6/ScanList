package com.bryontaylor.scanlist.architecture_components;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.bryontaylor.scanlist.ListItem;

import java.util.List;

@Dao
public interface ListItemDao {

  @Insert
  void insert(ListItem item);

  @Update
  void update(ListItem item);

  @Delete
  void delete(ListItem item);

  // delete all items
  @Query("DELETE FROM list_item_table")
  void deleteAll();

  // get all Items
  @Query("SELECT * FROM list_item_table")
  LiveData<List<ListItem>> getAllItems();
}