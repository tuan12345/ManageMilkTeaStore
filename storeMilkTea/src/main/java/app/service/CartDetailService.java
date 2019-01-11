package app.service;

import app.bean.CartDetailInfo;

public interface CartDetailService extends BaseService<Integer, CartDetailInfo> {
    void deleteCartDetailExpiry();
}
