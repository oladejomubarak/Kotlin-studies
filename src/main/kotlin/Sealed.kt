fun main(){
    val success = Result.Success("SUCCESS!")
   // val failure = Result.Failure("FAILURE")
    val progress = Result.Progress("PROGRESS")
    val recover = Result.Failure.RecoverableError(Exception(""), "recoverable error occured")
    val nonrecoverable = Result.Failure.NonRecoverableError(Exception(""), "non recoverable error occured")

    getData(success)
    getData(recover)

}

fun getData(result: Result){
    when(result){
        is Result.Success -> result.showMessage()
        is Result.Failure -> result.showMessage()
        is Result.Progress -> result.showMessage()

    }
}
sealed class Result(var message: String){
    fun showMessage(){
        println("Result: $message")
    }
    class Success(message: String): Result(message)
    sealed class Failure(message: String): Result(message){
        class RecoverableError(exception: Exception, message: String): Failure(message)
        class NonRecoverableError(exception: Exception, message: String): Failure(message)
    }
    class Progress(message: String): Result(message)

}