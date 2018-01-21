package grails.sec.issue

import grails.plugin.springsecurity.SpringSecurityService

class BootStrap {

    def init = { servletContext ->

        if (Role.count == 0) {
            Role role = new Role(authority: "ROLE_USER")
            role.save()

            Role role2 = new Role(authority: "ROLE_ADMIN")
            role2.save()

            User user = new User(username: 'super', password: 'pass', accountExpired: false, accountLocked: false, passwordExpired: false)
            user.save()

            new UserRole(user: user, role: role).save()
        }

    }
}
