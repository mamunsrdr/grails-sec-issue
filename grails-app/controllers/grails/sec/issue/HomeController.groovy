package grails.sec.issue

import grails.converters.JSON
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import org.springframework.security.core.userdetails.UserDetails

class HomeController {

    SpringSecurityService springSecurityService

    @Secured('ROLE_USER')
    def index() {
        render(view: 'home')
    }

    @Secured('ROLE_USER')
    def userInfo() {
        UserDetails userDetails = (springSecurityService.principal as UserDetails)
        Map userInfo = [username: userDetails.username, accountLocked: userDetails.accountNonLocked, accountNonExpired: userDetails.accountNonExpired, authorities: userDetails.authorities.join(",")]
        render userInfo as JSON
    }

    @Secured('ROLE_ADMIN')
    def adminHome() {
        render 'admin home'
    }
}
