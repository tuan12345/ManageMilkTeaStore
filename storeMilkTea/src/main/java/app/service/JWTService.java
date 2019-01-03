package app.service;


public interface JWTService {
    String generateTokenLogin(String username);
    String getUsernameFromToken(String token);
    Boolean validateTokenLogin(String token);

}
