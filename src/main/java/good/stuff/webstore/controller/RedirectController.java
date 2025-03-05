package good.stuff.webstore.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/redirect")
    public String redirectAfterLogin(Authentication authentication) {
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            if ("ADMIN".equals(authority.getAuthority())) {
                return "redirect:/admin/dashboard";
            }
        }
        return "redirect:/user/home";
    }
}
