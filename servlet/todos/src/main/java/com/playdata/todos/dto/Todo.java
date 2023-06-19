package com.playdata.todos.dto;

public class Todo {
    private Integer id;
    private String content;
    private String createAt;
    private boolean checked;


    // 전체 생성자, getter
    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getCreateAt() {
        return createAt;
    }

    public boolean isChecked() {
        return checked;
    }

    public Todo(Integer id, String content, String createAt, boolean checked) {
        this.id = id;
        this.content = content;
        this.createAt = createAt;
        this.checked = checked;
    }
}
