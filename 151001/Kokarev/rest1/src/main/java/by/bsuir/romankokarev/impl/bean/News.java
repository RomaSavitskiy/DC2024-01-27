package by.bsuir.romankokarev.impl.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class News {
    private long id;
    private long userId;
    private String title;
    private String content;
    private Date created;
    private Date modified;
}
