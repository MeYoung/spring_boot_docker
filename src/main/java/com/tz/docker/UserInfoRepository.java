package com.tz.docker;

import org.aspectj.weaver.ast.Var;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shijin.huang
 * @Classname UserInfoRepository
 * @Description
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserBean, Integer> {
}
