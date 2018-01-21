server.session.timeout = 10 //10 seconds only


grails.plugin.springsecurity.rejectIfNoRule = true                             // reject if rule not defined in request_map
//grails.plugin.springsecurity.fii.rejectPublicInvocations = false                 // reject public url invocation

grails.plugin.springsecurity.apf.storeLastUsername = true
grails.plugin.springsecurity.apf.postOnly = true                                //login form submission post only
grails.plugin.springsecurity.logout.postOnly = false                            //logout post only
grails.plugin.springsecurity.successHandler.alwaysUseDefault = false             //if true, always redirects to the value of successHandler
grails.plugin.springsecurity.successHandler.defaultTargetUrl = "/"    //redirect url after login success
grails.plugin.springsecurity.useSecurityEventListener = true
grails.plugin.springsecurity.adh.errorPage = null

grails.plugin.springsecurity.password.hash.iterations = 1

//remember me config
grails.plugin.springsecurity.rememberMe.cookieName = 'app_auth_cookie'
grails.plugin.springsecurity.rememberMe.alwaysRemember = false
grails.plugin.springsecurity.rememberMe.tokenValiditySeconds = 604800   //7 days
grails.plugin.springsecurity.rememberMe.key = 'f%)n@F432-0%09+6q2Ik21#*&hf23'

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'grails.sec.issue.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'grails.sec.issue.UserRole'
grails.plugin.springsecurity.authority.className = 'grails.sec.issue.Role'
grails.plugin.springsecurity.securityConfigType = 'Annotation'

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/', access: ['permitAll']],
        [pattern: '/error', access: ['permitAll']],
        [pattern: '/index', access: ['permitAll']],
        [pattern: '/index.gsp', access: ['permitAll']],
        [pattern: '/shutdown', access: ['permitAll']],
        [pattern: '/assets/**', access: ['permitAll']],
        [pattern: '/**/js/**', access: ['permitAll']],
        [pattern: '/**/css/**', access: ['permitAll']],
        [pattern: '/**/images/**', access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
        [pattern: '/assets/**', filters: 'none'],
        [pattern: '/**/js/**', filters: 'none'],
        [pattern: '/**/css/**', filters: 'none'],
        [pattern: '/**/images/**', filters: 'none'],
        [pattern: '/**/favicon.ico', filters: 'none'],
        [pattern: '/**', filters: 'JOINED_FILTERS']
]

