package cn.alenc.birthdaymanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_emails")
public class UserEmails {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;

    @Column
    private String emailAccount;

    @Column
    private String passwordCode;

    @Column
    private int userId;

    @Column
    private int isDelete;
}
