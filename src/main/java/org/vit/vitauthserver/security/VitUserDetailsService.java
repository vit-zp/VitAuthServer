package org.vit.vitauthserver.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.vit.vitauthserver.model.user.User;
import org.vit.vitauthserver.repository.user.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class VitUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUserName(username);
        if (user == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(
                u -> {
                    authorities.add(new SimpleGrantedAuthority(u.getRoleName()));
                }
        );
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getEncryptedPassword(), authorities);
    }
}
