package com.techpored.SpringBootJWT_Study;

public class AuthenticationResponse {//App'den gelen tokeni saklayacak class
//    bu classtan create edilen obje app den gelen token bulunduracak
 private final String jwt;

    public AuthenticationResponse(String jwt) {//final jwt initialize etmek icin cons create edildi
        this.jwt = jwt;
    }
    public String getJwt() {
        return jwt;
    }
}
