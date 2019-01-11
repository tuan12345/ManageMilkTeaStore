package app.service.impl;

import app.bean.CartDetailInfo;
import app.model.CartDetail;
import app.service.CartDetailService;
import app.util.DateTimeUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.List;

public class CartDetailServiceImpl extends BaseServiceImpl implements CartDetailService {
    private static final Logger logger = Logger.getLogger(CartDetailServiceImpl.class);
    @Value("${spring.cart.expiration.date}")
    private int expiration;

    @Override
    public CartDetailInfo findById(Serializable key, boolean lock) {
        return null;
    }

    @Override
    public CartDetailInfo saveOrUpdate(CartDetailInfo entity) {
        return null;
    }

    @Override
    public boolean delete(CartDetailInfo entity) {
        return false;
    }

    @Override
    public void deleteCartDetailExpiry() {
        try {
            List<CartDetail> cartDetails = cartDetailDAO
                    .findCartDetailsExpired(DateTimeUtils
                            .substractDate(expiration));
            for (CartDetail cartDetail : cartDetails){
                cartDetailDAO.delete(cartDetail);
            }
            logger.info("Delete cartDetails day " + DateTimeUtils.getCurrentDate());

        } catch (Exception e) {
            logger.error("Hibernate exception " + e.getMessage());
            throw e;
        }
    }
}
