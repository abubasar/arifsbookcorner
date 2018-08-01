package com.bookstore.service;

import com.bookstore.domain.*;
import com.bookstore.domain.security.PasswordResetToken;
import com.bookstore.domain.security.UserRole;

import java.util.Set;


public interface UserService {
    User createUser (User user, Set<UserRole> userRoles);

    User save (User user);

    User findById (Long id);

    User findByUsername (String username);

    User findByEmail(String email);

    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    void updateUserPaymentInfo(UserShipping userShipping, UserBilling userBilling, UserPayment userPayment, User user);

    void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

    void updateUserShipping(UserShipping userShipping, User user);

    void setUserDefaultPayment(Long userPaymentId, User user);

    void setUserDefaultShipping(Long userShippingId, User user);

}
