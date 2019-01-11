package app.dao;

import app.model.CartDetail;

import java.util.Date;
import java.util.List;

public interface CartDetailDAO  extends BaseDAO<Integer, CartDetail> {
    List<CartDetail> findCartDetailsExpired(Date date);
}
