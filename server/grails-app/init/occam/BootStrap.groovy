package occam

import auth.Role
import auth.User
import auth.UserRole

class BootStrap {

    def init = { servletContext ->
        if( !User.count() ){
            User user = new User(username: "admin", password: "ad220022")
            user.save()

            Role roleUser = new Role(authority: "ROLE_SUPERUSER")
            roleUser.save()

            new UserRole(user: user, role: roleUser).save()
        }
    }
    def destroy = {
    }
}
