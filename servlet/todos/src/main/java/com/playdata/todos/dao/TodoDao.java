package com.playdata.todos.dao;

import com.playdata.todos.config.JdbcConnection;
import com.playdata.todos.dto.Todo;
import com.playdata.todos.dto.TodoJoinUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TodoDao {
    public List<TodoJoinUser> findAll(){


        return null;
    }
    public void insert(int uid, String content){
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "insert into todos(user_id, content, checked) " +
                "values(?, ?, false)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, uid);
            pst.setString(2, content);
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
