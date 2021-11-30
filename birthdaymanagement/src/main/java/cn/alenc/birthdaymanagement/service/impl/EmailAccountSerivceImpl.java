package cn.alenc.birthdaymanagement.service.impl;

import cn.alenc.birthdaymanagement.dao.EmailAccountRepository;
import cn.alenc.birthdaymanagement.entity.UserEmails;
import cn.alenc.birthdaymanagement.service.EmailAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmailAccountSerivceImpl implements EmailAccountService {

    @Autowired
    private EmailAccountRepository emailAccountRepository;


    @Override
    public UserEmails addEmailAccount(UserEmails userEmails) {
        return emailAccountRepository.save(userEmails);
    }

    @Override
    public String testEmailAccount(UserEmails userEmails) {
        return null;
    }

    @Override
    public void deleteEmailAccount(UserEmails userEmails) {
        emailAccountRepository.delete(userEmails);
    }

    @Override
    public UserEmails modifyEmailAccount(UserEmails userEmails) {
        return emailAccountRepository.save(userEmails);
    }

    @Override
    public Optional<UserEmails> queryEmailAccountsByUserID(String id) {
        return emailAccountRepository.findById(id);
    }
}
