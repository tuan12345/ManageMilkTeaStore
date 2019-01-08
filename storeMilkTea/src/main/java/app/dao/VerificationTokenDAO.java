package app.dao;

import app.model.User;
import app.model.VerificationToken;

public interface VerificationTokenDAO extends BaseDAO<Integer, VerificationToken> {
    VerificationToken findByToken(String token);

    VerificationToken findByUser(User user);
}
