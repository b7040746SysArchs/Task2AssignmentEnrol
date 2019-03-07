package com.enrol

class LecturerController {
def scaffold = Lecturer;

def login(){

}

def validate(){
  def user = Lecturer.findByUsername(params.username)

  if(user && user.password == params.password){
    session.user = user
    render view:'home'
  }else{
    flash.message = "Invalid Username Or Password"
    render view:'login'
  }
}

def logout(){
  session.user = null
  redirect(url:'/')
}

}
