fun main(){
    val account = Account("Mub")
    account.deposit(1399)
    account.withdraw(100)
    account.deposit(-155)
    account.withdraw(-345)
    account.withdraw(6789765)
   //println(account.calculateBalance())

}

class Account(var accountName:String){
    var balance = 0
    //var listOfTransactions: MutableList<Int>

    fun deposit(amount: Int){
        if (amount > 0){
            this.balance+= amount
      //  listOfTransactions.add(amount)
            println("$amount deposited, your new balance is ${this.balance}")
        } else {
            println("Can not deposit zero or negative amount")
        }
    }

    fun withdraw(withdrawalAmount: Int){
        if (withdrawalAmount > 0 && withdrawalAmount <= this.balance){
        //   listOfTransactions.add(-withdrawalAmount)
           this.balance-=withdrawalAmount
           println("$withdrawalAmount withdrawn, your new balance is ${this.balance}")
        } else {
            println("Can not withdraw zero, negative amount or amount greater than your current balance")
        }

    }

//    fun calculateBalance(): Int{
//        for (transaction in listOfTransactions){
//            this.balance+= transaction
//        }
//        return this.balance
//    }
}