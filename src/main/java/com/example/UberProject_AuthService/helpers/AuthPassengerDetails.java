package com.example.UberProject_AuthService.helpers;

import com.example.UberProject_AuthService.models.Passenger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

// Why we need this class ?
// Because spring security works on UserDetails polymorphic type for auth
//public class AuthPassengerDetails extends Passenger implements UserDetails {
public class AuthPassengerDetails implements UserDetails {

//    private String username; // email / name / id
//    private String password;
    private final Passenger passenger;

    public AuthPassengerDetails(Passenger passenger) {
//        this.username = passenger.getEmail();
//        this.password = passenger.getPassword();
        this.passenger=passenger;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.passenger.getEmail();
    }

    @Override
    public String getPassword(){
        return  this.passenger.getPassword();
    }

    // Below set of method are not much of a concern

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
