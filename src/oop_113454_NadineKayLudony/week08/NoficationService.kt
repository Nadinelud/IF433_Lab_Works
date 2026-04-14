package oop_113454_NadineKayLudony.week08

class NoficationService {
    fun sendEmail(emailAddress: String){
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile){
        if (user.email != null){
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email")
        }
    }
}