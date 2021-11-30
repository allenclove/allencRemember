package cn.alenc.birthdaymanagement.service;

import cn.alenc.birthdaymanagement.entity.UserEmails;

import java.util.Optional;

public interface EmailAccountService {

    UserEmails addEmailAccount(UserEmails userEmails);

    String testEmailAccount(UserEmails userEmails);

    void deleteEmailAccount(UserEmails userEmails);

    UserEmails modifyEmailAccount(UserEmails userEmails);

    Optional<UserEmails> queryEmailAccountsByUserID(String id);
}
