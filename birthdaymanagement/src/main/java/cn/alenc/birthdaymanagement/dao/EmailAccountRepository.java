package cn.alenc.birthdaymanagement.dao;

import cn.alenc.birthdaymanagement.entity.UserEmails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailAccountRepository extends JpaRepository<UserEmails,String> {
}
