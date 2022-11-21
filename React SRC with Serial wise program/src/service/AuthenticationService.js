const AuthenticationService={
    login:function(username){
        sessionStorage.setItem('authenticatedUser' , username)
    },

    logout:function(){
        sessionStorage.setItem('authenticatedUser' , '')
    },

    isLoggedIn:function(){
       const user=sessionStorage.getItem('authenticatedUser')
       if(user!=null)
           return true
       else
          return false    
    }
}

export default AuthenticationService;